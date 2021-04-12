package org.demo.bedprojectbefore.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Finance_User;
import org.demo.bedprojectbefore.pojo.Order_Cash;
import org.demo.bedprojectbefore.pojo.Order_Share2;
import org.demo.bedprojectbefore.service.Finance_UserSer;
import org.demo.bedprojectbefore.service.Order_CashSer;
import org.demo.bedprojectbefore.service.Order_shareSer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("财务管理")
@RestController
@CrossOrigin
public class Finance_UserController {
    @Resource
    private Finance_UserSer finance_userSer;

    @Resource
    private Order_shareSer order_shareSer;

    @Resource
    private Order_CashSer order_cashService;

    @ApiOperation(httpMethod = "POST",value = "财务明细",notes = "财务明细")
    @RequestMapping("/Finance_UserList")
    public Dto getFinaList(@RequestParam(defaultValue = "",required = false) String outTradeNo,
                           @RequestParam(defaultValue = "",required = false) String nickName,
                           @RequestParam(defaultValue = "0") int financeType,
                           String start,
                           String end,
                           @RequestParam(defaultValue = "1")int pageNo,
                           @RequestParam(defaultValue = "5") int pageSize){
        Page<Finance_User> page=new Page();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(finance_userSer.FinaList(outTradeNo,nickName,financeType,start,end,pageNo,pageSize));
        page.setTotalCount(finance_userSer.getFinaCount(outTradeNo,nickName,financeType,start,end));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }


    @ApiOperation(httpMethod = "POST",value = "分成明细",notes = "分成明细")
    @RequestMapping("/getOrderList")
    public Dto getOrderList(@RequestParam(defaultValue = "",required = false) String orderNo,
                            @RequestParam(defaultValue = "",required = false) String nickName,
                            @RequestParam(defaultValue = "",required = false) String userPhone,
                            @RequestParam(defaultValue = "",required = false) String deviceNumber,
                            @RequestParam(defaultValue = "0") int orderType,
                            @RequestParam(defaultValue = "",required = false) String start,
                            @RequestParam(defaultValue = "",required = false) String end,
                            @RequestParam(defaultValue = "1") int pageNo,
                            @RequestParam(defaultValue = "5") int pageSize){
        Page<Order_Share2> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(order_shareSer.getOrderList(orderNo, nickName, userPhone, deviceNumber, orderType, start, end, pageNo, pageSize));
        page.setTotalCount(order_shareSer.getOrderCount(orderNo, nickName, userPhone, deviceNumber, orderType, start, end));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }

    @ApiOperation(httpMethod = "POST",value = "代理商提现记录列表",notes = "代理商提现记录列表")
    @RequestMapping("/getOrderCashList")
    public Dto getOrderCashList(@RequestParam(defaultValue = "0") int orderId,
                                @RequestParam(defaultValue = "",required = false) String companyName,
                                @RequestParam(defaultValue = "",required = false) String linkPhone,
                                @RequestParam(defaultValue = "",required = false) String reservePhone,
                                @RequestParam(defaultValue = "",required = false) String bankNumber,
                                @RequestParam(defaultValue = "0") int status,
                                @RequestParam(defaultValue = "1") int pageNo,
                                @RequestParam(defaultValue = "5") int pageSize){
        Page<Order_Cash> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(order_cashService.getOrderCashList(orderId, companyName, linkPhone, reservePhone, bankNumber, status, pageNo, pageSize));
        page.setTotalCount(order_cashService.getOrderCashCount(orderId, companyName, linkPhone, reservePhone, bankNumber, status));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }

}
