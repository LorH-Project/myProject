package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.mapper.GoodMapper;
import org.demo.bedprojectbefore.pojo.Goods;
import org.demo.bedprojectbefore.service.GoodSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("用户管理")
@RestController
@CrossOrigin
public class DeviceController {

    @Autowired
    private GoodSer goodSer;

    @ApiOperation(httpMethod = "GET",value = "商品列表",notes = "商品列表")
    @RequestMapping(value = "/goodList",method = RequestMethod.GET)
    public Dto goodList(@RequestParam(defaultValue = "",required = false) String goodsName,
                        @RequestParam(defaultValue = "",required = false) String goodsManufactor,
                        @RequestParam(defaultValue = "",required = false) String start,
                        @RequestParam(defaultValue = "",required = false) String end,
                        @RequestParam(defaultValue = "1") int pageNo,
                        @RequestParam(defaultValue = "3") int pageSize){
        List<Goods> goodsList=goodSer.goodList(goodsName, goodsManufactor, start, end, pageNo, pageSize);
        if(goodsList!=null){
            Page<Goods> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(goodSer.getGoodCount(goodsName,goodsManufactor,start,end));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            page.setRows(goodsList);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    public Dto selIdGood(@RequestParam("id") int id){
        Goods goods=goodSer.selIdGood(id);
        System.out.println(goods.getGoodsName()+" "+goods.getGoodsId());
        return DtoUtil.returnSuccess(goods);
    }

    @ApiOperation(httpMethod = "GET",value ="删除商品",notes = "删除商品")
    @RequestMapping(value = "/delGood",method = RequestMethod.GET)
    public Dto delGood(@RequestParam("id")int id){
        return DtoUtil.returnSuccess(goodSer.delGood(id));
    }




}
