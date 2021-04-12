package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Order_shareMapper;
import org.demo.bedprojectbefore.pojo.Order_Share;
import org.demo.bedprojectbefore.pojo.Order_Share2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class Order_shareSer{
    @Resource
    private Order_shareMapper order_shareMapper;

    public List<Order_Share> OrderShareList(String orderNo, String NickName, String userPhone, String address , String deviceNumber, String companyName, String outTradeNo, int orderStatus, int overTime, String start, String end, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return order_shareMapper.OrderShareList(orderNo, NickName, userPhone, address, deviceNumber, companyName, outTradeNo, orderStatus, overTime, start, end, pageNo, pageSize);
    }

    public int getOrderShareCount(String orderNo, String NickName, String userPhone,String address ,String deviceNumber, String companyName, String outTradeNo, int orderStatus, int overTime, String start, String end) {
        return order_shareMapper.getOrderShareCount(orderNo, NickName, userPhone, address, deviceNumber, companyName, outTradeNo, orderStatus, overTime, start, end);
    }

    public List<Order_Share2> getOrderList(String orderNo, String nickName, String userPhone, String deviceNumber, int orderType, String start, String end, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        List<Order_Share2> orderList1 = new ArrayList<>();
        if(orderType==1||orderType==2){
            orderList1 = order_shareMapper.getOrderList(orderNo, nickName, userPhone, deviceNumber, orderType, start, end, pageNo, pageSize);
        }else{
            orderList1 = order_shareMapper.getOrderList(orderNo, nickName, userPhone, deviceNumber, 1, start, end, pageNo, pageSize);
            List<Order_Share2> orderList2 = order_shareMapper.getOrderList(orderNo, nickName, userPhone, deviceNumber, 2, start, end, pageNo, pageSize);
            orderList1.addAll(orderList2);
        }
        return orderList1;
    }

    public int getOrderCount(String orderNo, String nickName, String userPhone, String deviceNumber, int orderType, String start, String end) {
        int result = 0;
        if(orderType==1||orderType==2){
            result = order_shareMapper.getOrderCount(orderNo, nickName, userPhone, deviceNumber, orderType, start, end);
        }else{
            result = order_shareMapper.getOrderCount(orderNo, nickName, userPhone, deviceNumber, 1, start, end);
            int result2 = order_shareMapper.getOrderCount(orderNo, nickName, userPhone, deviceNumber, 2, start, end);
            result+=result2;
        }
        return result;
    }
}
