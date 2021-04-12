package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Order_Share;
import org.demo.bedprojectbefore.pojo.Order_Share2;

import java.util.List;

@Mapper
public interface Order_shareMapper {

    List<Order_Share>OrderShareList(@Param("orderNo") String orderNo,
                                    @Param("NickName")String NickName,
                                    @Param("userPhone") String userPhone,
                                    @Param("address") String address,
                                    @Param("deviceNumber") String deviceNumber,
                                    @Param("companyName")String companyName,
                                    @Param("outTradeNo")String outTradeNo,
                                    @Param("orderStatus")int orderStatus,
                                    @Param("overTime")int overTime,
                                    @Param("start") String start,
                                    @Param("end") String end,
                                    @Param("pageNo") int pageNo,
                                    @Param("pageSize") int pageSize);
    int getOrderShareCount(@Param("orderNo") String orderNo,
                           @Param("NickName")String NickName,
                           @Param("userPhone") String userPhone,
                           @Param("address") String address,
                           @Param("deviceNumber") String deviceNumber,
                           @Param("companyName")String companyName,
                           @Param("outTradeNo")String outTradeNo,
                           @Param("orderStatus")int orderStatus,
                           @Param("overTime")int overTime,
                           @Param("start") String start,
                           @Param("end") String end);

    /**
     * 分成明细
     * @param orderNo
     * @param nickName
     * @param userPhone
     * @param deviceNumber
     * @param orderType
     * @param start
     * @param end
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Order_Share2> getOrderList(@Param("orderNo") String orderNo,
                                    @Param("nickName") String nickName,
                                    @Param("userPhone") String userPhone,
                                    @Param("deviceNumber") String deviceNumber,
                                    @Param("orderType") int orderType,
                                    @Param("start") String start,
                                    @Param("end") String end,
                                    @Param("pageNo") int pageNo,
                                    @Param("pageSize") int pageSize);
    int getOrderCount(@Param("orderNo") String orderNo,@Param("nickName") String nickName,@Param("userPhone") String userPhone,@Param("deviceNumber") String deviceNumber,@Param("orderType") int orderType,@Param("start") String start,@Param("end") String end);
}
