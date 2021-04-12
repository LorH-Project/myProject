package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Goods_Order_Share;

import java.util.List;

/**
 * Author:LiaoZhen
 * Date:  2021/3/30/11:59
 */
@Mapper
public interface Goods_Order_ShareMapper {
    List<Goods_Order_Share> getGoodsOrderShareList(@Param("orderNo") String orderNo,
                                                   @Param("deviceNumber") String deviceNumber,
                                                   @Param("address") String address,
                                                   @Param("openCabinetNumber") String openCabinetNumber,
                                                   @Param("goodsName") String goodsName,
                                                   @Param("agentId") int agentId,
                                                   @Param("start") String start,
                                                   @Param("end") String end,
                                                   @Param("outTradeNo") String outTradeNo,
                                                   @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    int getGoodsOrderShareCount(@Param("orderNo") String orderNo,@Param("deviceNumber") String deviceNumber,@Param("address") String address,@Param("openCabinetNumber") String openCabinetNumber,@Param("goodsName") String goodsName,@Param("agentId") int agentId,@Param("start") String start,
                                @Param("end") String end,@Param("outTradeNo") String outTradeNo);
}
