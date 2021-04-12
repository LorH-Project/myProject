package org.demo.bedprojectbefore.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Goods_Order_Share;
import org.demo.bedprojectbefore.pojo.Order_Deposit;
import org.demo.bedprojectbefore.pojo.Order_Share;
import org.demo.bedprojectbefore.pojo.Order_Share2;
import org.demo.bedprojectbefore.service.Goods_Order_ShareSer;
import org.demo.bedprojectbefore.service.Order_DepositSer;
import org.demo.bedprojectbefore.service.Order_shareSer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("订单管理")
@RestController
@CrossOrigin
public class Order_ShareController {
    @Resource
    private Order_shareSer order_shareService;
    @Resource
    private Goods_Order_ShareSer goods_order_shareSer;
    @Resource
    private Order_DepositSer order_depositSer;

    @ApiOperation(httpMethod = "POST",value = "陪护床订单列表",notes = "陪护床订单列表")
    @RequestMapping("/order_shareList")
    public Dto share(@RequestParam(defaultValue = "",required = false)String orderNo,
                     @RequestParam(defaultValue = "",required = false)String nickName,
                     @RequestParam(defaultValue = "",required = false)String userPhone,
                     @RequestParam(defaultValue = "",required = false) String address,
                     @RequestParam(defaultValue = "",required = false)String deviceNumber,
                     @RequestParam(defaultValue = "",required = false)String companyName,
                     @RequestParam(defaultValue = "",required = false)String outTradeNo,
                     @RequestParam(defaultValue = "0",required = false)int orderStatus,
                     @RequestParam(defaultValue = "0",required = false)int overTime,
                     String start,
                     String end,
                     @RequestParam(defaultValue = "1")int pageNo,
                     @RequestParam(defaultValue = "3") int pageSize){
        System.out.println("orderNo:"+orderNo);
        System.out.println("deviceNumber:"+deviceNumber);
        System.out.println("companyName:"+companyName);
        System.out.println("outTradeNo:"+outTradeNo);

        Page<Order_Share> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(order_shareService.OrderShareList(orderNo, nickName, userPhone, address, deviceNumber, companyName, outTradeNo, orderStatus, overTime, start, end, pageNo, pageSize));
        page.setTotalCount(order_shareService.getOrderShareCount(orderNo, nickName, userPhone, address, deviceNumber, companyName, outTradeNo, orderStatus, overTime, start, end));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }

    @ApiOperation(httpMethod = "GET",value = "商品订单列表信息",notes = "商品订单列表信息")
    @RequestMapping("/getGoodsOrderShareList")
    public Dto getGoodsOrderShareList(@RequestParam(defaultValue = "",required = false) String orderNo,
                                      @RequestParam(defaultValue = "",required = false) String deviceNumber,
                                      @RequestParam(defaultValue = "",required = false) String address,
                                      @RequestParam(defaultValue = "",required = false) String openCabinetNumber,
                                      @RequestParam(defaultValue = "",required = false) String goodsName,
                                      @RequestParam(defaultValue = "0") int agentId,
                                      @RequestParam(defaultValue = "",required = false) String outTradeNo,
                                      @RequestParam(defaultValue = "",required = false) String start,
                                      @RequestParam(defaultValue = "",required = false) String end,
                                      @RequestParam(defaultValue = "1") int pageNo,
                                      @RequestParam(defaultValue = "5") int pageSize){
        System.out.println("start:"+start+"\t"+"end:"+end);
        Page<Goods_Order_Share> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(goods_order_shareSer.getGoodsOrderShareList(orderNo, deviceNumber, address, openCabinetNumber, goodsName, agentId, start, end, outTradeNo, pageNo, pageSize));
        page.setTotalCount(goods_order_shareSer.getGoodsOrderShareCount(orderNo, deviceNumber, address, openCabinetNumber, goodsName,agentId, start, end,outTradeNo));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }

    @ApiOperation(httpMethod = "POST",value = "押金订单列表",notes = "押金订单列表")
    @RequestMapping("/getOrder_depositList")
    public Dto deposit(@RequestParam(defaultValue = "",required = false)String outTradeNo,
                       @RequestParam(defaultValue = "" ,required = false)String nickName,
                       @RequestParam(defaultValue = "" ,required = false)String userPhone,
                       @RequestParam(defaultValue = "0",required = false,value = "status2") int status,
                       @RequestParam(defaultValue = "",required = false) String hospitalName,
                       @RequestParam(defaultValue = "1")int pageNo,
                       @RequestParam(defaultValue = "5") int pageSize ){
        Page<Order_Deposit> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(order_depositSer.OrderList(outTradeNo, nickName, userPhone, status, hospitalName, pageNo, pageSize));
        page.setTotalCount(order_depositSer.getOrder_DeposityCount(outTradeNo,nickName,userPhone,status,hospitalName));
        page.setPageCount(page.getTotalCount()%pageSize==0?page.getTotalCount()/pageSize:page.getTotalCount()/pageSize+1);
        return DtoUtil.returnSuccess(page);
    }


}
