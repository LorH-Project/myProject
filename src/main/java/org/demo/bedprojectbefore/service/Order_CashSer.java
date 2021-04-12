package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Order_CashMapper;
import org.demo.bedprojectbefore.pojo.Order_Cash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Date:  2021/4/6/9:06
 */
@Service
public class Order_CashSer{
    @Resource
    private Order_CashMapper order_cashMapper;

    public List<Order_Cash> getOrderCashList(int orderId, String companyName, String linkPhone, String reservePhone, String bankNumber, int status, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return order_cashMapper.getOrderCashList(orderId, companyName, linkPhone, reservePhone, bankNumber, status, pageNo, pageSize);
    }

    public int getOrderCashCount(int orderId, String companyName, String linkPhone, String reservePhone, String bankNumber, int status) {
        return order_cashMapper.getOrderCashCount(orderId, companyName, linkPhone, reservePhone, bankNumber, status);
    }
}
