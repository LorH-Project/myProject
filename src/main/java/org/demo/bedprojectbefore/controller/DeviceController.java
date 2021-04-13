package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.mapper.CabinetMapper;
import org.demo.bedprojectbefore.mapper.GoodMapper;
import org.demo.bedprojectbefore.pojo.Cabinet_switch;
import org.demo.bedprojectbefore.pojo.Goods;
import org.demo.bedprojectbefore.pojo.Replenishment_Record;
import org.demo.bedprojectbefore.service.CabinetSer;
import org.demo.bedprojectbefore.service.GoodSer;
import org.demo.bedprojectbefore.service.ReplenSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Api("设备管理")
@RestController
@CrossOrigin
public class DeviceController {
    private String fileName = "";

    @Resource
    private GoodSer goodSer;

    @Resource
    private CabinetSer cabinetSer;

    @Resource
    private ReplenSer replenSer;

    @ApiOperation(httpMethod = "GET",value = "商品列表",notes = "商品列表")
    @RequestMapping(value = "/goodList")
    public Dto goodList(@RequestParam(defaultValue = "",required = false) String goodsName,
                        @RequestParam(defaultValue = "",required = false) String goodsManufactor,
                        @RequestParam(defaultValue = "",required = false) String start,
                        @RequestParam(defaultValue = "",required = false) String end,
                        @RequestParam(defaultValue = "1") int pageNo,
                        @RequestParam(defaultValue = "5") int pageSize){
        List<Goods> goodsList=goodSer.goodList(goodsName, goodsManufactor, start, end, pageNo, pageSize);
        System.out.println(goodsList.size());
        Page<Goods> page=new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setTotalCount(goodSer.getGoodCount(goodsName,goodsManufactor,start,end));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        page.setRows(goodSer.goodList(goodsName, goodsManufactor, start, end, pageNo, pageSize));
        return DtoUtil.returnSuccess(page);
    }

    @ApiOperation(httpMethod = "GET",value ="删除商品",notes = "删除商品")
    @RequestMapping(value = "/delGood")
    public Dto delGood(@RequestParam("id")int id){
        return DtoUtil.returnSuccess(goodSer.delGood(id));
    }

    @ApiIgnore
    @RequestMapping("/deleteGoodsById")
    public Dto deleteGoodsById(String Ids){
        String[] goodsIds = Ids.split(",");
        System.out.println("length:"+goodsIds.length);
        return DtoUtil.returnSuccess(goodSer.deleteGoodsById(goodsIds));
    }

    @ApiOperation(httpMethod = "GET",value = "新增商品",notes = "新增商品")
    @RequestMapping("/insGoods")
    public Dto insGoods(@RequestBody Goods goods, MultipartFile file){
        String path = "D:\\Y2\\vue\\test\\public\\upload\\images\\";
        String suf = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        System.out.println(suf);
        File file1 = new File(path);
        if(!file1.exists()){
            file1.mkdirs();
        }
        try{
            fileName = "aa"+new Random().nextInt(1000)+suf;
            System.out.println(fileName);
            file.transferTo(new File(path+fileName));/*上传*/
            goods.setGoodsPic("/upload/images/"+fileName);
            goods.setcTime(new Date());
            goods.setGoodsId(0);
            goods.setIsFlag(2);
            System.out.println(goods.getGoodsPic());
            return DtoUtil.returnSuccess(goodSer.addGoods(goods));
        }catch (Exception e){
            e.printStackTrace();
            return DtoUtil.returnSuccess("未查到数据","404");
        }
    }

    //根据id查商品对象
    @ApiIgnore
    @RequestMapping(value = "/selIdGood")
    public Dto selIdGood(@RequestParam("id") int id){
        Goods goods=goodSer.selIdGood(id);
        System.out.println(goods.getGoodsName()+" "+goods.getGoodsId());
        return DtoUtil.returnSuccess(goods);
    }

    @ApiOperation(httpMethod = "GET",value = "修改商品")
    @RequestMapping("/updGoods")
    public Dto updGoods(Goods goods,MultipartFile file){
        String path = "D:\\Y2\\vue\\test\\public\\upload\\images\\";
        String suf="";
        if(file!=null){
            suf= file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        }
        File file1 = new File(path);
        if(!file1.exists()){
            file1.mkdirs();
        }
        try{
            if(file!=null){
                fileName = "lz"+new Random().nextInt(1000)+suf;
                file.transferTo(new File(path+fileName));
                goods.setGoodsPic("/upload/images/"+fileName);
            }
            goods.setuTime(new Date());
            return DtoUtil.returnSuccess(goodSer.updateGoods(goods));
        }catch (Exception e){
            e.printStackTrace();
            return DtoUtil.returnSuccess("0");
        }
    }



    @ApiOperation(httpMethod = "GET",value = "陪护床格子开关列表",notes = "陪护床格子开关列表")
    @RequestMapping(value = "/cabList")
    public Dto cabList(@RequestParam(defaultValue = "",required = false) String nickName,
                       @RequestParam(defaultValue = "",required = false) String deviceNumber,
                       @RequestParam(defaultValue = "0",required = false) int agentId,
                       @RequestParam(defaultValue = "",required = false) String cabinetNumber,
                       @RequestParam(defaultValue = "",required = false) String start,
                       @RequestParam(defaultValue = "",required = false) String end,
                       @RequestParam(defaultValue = "1") int pageNo,
                       @RequestParam(defaultValue = "3") int pageSize){
            System.out.println(nickName+" "+deviceNumber+" "+agentId+" "+cabinetNumber+" "+pageNo+" "+pageSize);

            Page<Cabinet_switch> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(cabinetSer.getCabCount(nickName, deviceNumber, agentId, cabinetNumber, start, end));
            page.setRows(cabinetSer.cabList(nickName, deviceNumber, agentId, cabinetNumber, start, end, pageNo, pageSize));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            return DtoUtil.returnSuccess(page);
    }

    @ApiOperation(httpMethod = "GET",value = "补货记录表",notes = "补货记录表")
    @RequestMapping("/getReplenishmentList")
    public Dto getReplenishmentList(@RequestParam(defaultValue = "",required = false) String deviceNumber,
                                    @RequestParam(defaultValue = "",required = false) String hospitalName,
                                    @RequestParam(defaultValue = "0",required = false) int agentId,
                                    @RequestParam(defaultValue = "",required = false) String goodsName,
                                    @RequestParam(defaultValue = "",required = false) String realName,
                                    @RequestParam(defaultValue = "",required = false) String userPhone,
                                    @RequestParam(defaultValue = "0") int replenishmentType,
                                    String start,
                                    String end,
                                    @RequestParam(defaultValue = "1") int pageNo,
                                    @RequestParam(defaultValue = "5") int pageSize){
        Page<Replenishment_Record> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(replenSer.getReplenishmentList(deviceNumber, hospitalName, agentId, goodsName, realName, userPhone, replenishmentType,start,end, pageNo, pageSize));
        page.setTotalCount(replenSer.getReplenishmentCount(deviceNumber, hospitalName, agentId, goodsName, realName, userPhone, replenishmentType,start,end));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }



}
