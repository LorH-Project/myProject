package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Goods_Order_ShareMapper;
import org.demo.bedprojectbefore.pojo.Goods_Order_Share;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:LiaoZhen
 * Date:  2021/3/30/13:24
 */
@Service
public class Goods_Order_ShareSer{
    @Resource
    private Goods_Order_ShareMapper goods_order_shareMapper;

    public List<Goods_Order_Share> getGoodsOrderShareList(String orderNo, String deviceNumber, String address, String openCabinetNumber, String goodsName, int agentId, String start, String end, String outTradeNo, int pageNo, int pageSize) {
        System.out.println("service:start:"+start);
        pageNo = (pageNo-1)*pageSize;
        return goods_order_shareMapper.getGoodsOrderShareList(orderNo, deviceNumber, address, openCabinetNumber, goodsName, agentId, start, end, outTradeNo, pageNo, pageSize);
    }

    public int getGoodsOrderShareCount(String orderNo, String deviceNumber, String address, String openCabinetNumber, String goodsName, int agentId,String start,String end, String outTradeNo) {
        return goods_order_shareMapper.getGoodsOrderShareCount(orderNo, deviceNumber, address, openCabinetNumber, goodsName, agentId, start, end, outTradeNo);
    }
}
