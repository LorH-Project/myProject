package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Order_DepositMapper;
import org.demo.bedprojectbefore.pojo.Order_Deposit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Order_DepositSer{

    @Resource
    private Order_DepositMapper order_depositMapper;

    public List<Order_Deposit> OrderList(String outTradeNo, String NickName, String userPhone, int isFlag, String hospitalName, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return order_depositMapper.OrderList(outTradeNo,NickName,userPhone,isFlag,hospitalName,pageNo,pageSize);
    }

    public int getOrder_DeposityCount(String outTradeNo, String NickName, String userPhone, int isFlag, String hospitalName) {
        return order_depositMapper.getOrder_DeposityCount(outTradeNo,NickName,userPhone,isFlag,hospitalName);
    }
}
