package org.demo.bedprojectbefore.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Order_Deposit;

import java.util.List;

@Mapper
public interface Order_DepositMapper {

    /*查询押金所有订单列表*/
    List<Order_Deposit>OrderList(@Param("outTradeNo") String outTradeNo,
                                 @Param("nickName")String NickName,
                                 @Param("userPhone") String userPhone,
                                 @Param("status") int isFlag,
                                 @Param("hospitalName")String hospitalName,
                                 @Param("pageNo") int pageNo,
                                 @Param("pageSize") int pageSize);
    /*查询押金所有订单条数*/
    int getOrder_DeposityCount(@Param("outTradeNo") String outTradeNo,
                      @Param("nickName")String NickName,
                      @Param("userPhone") String userPhone,
                      @Param("status") int isFlag,
                      @Param("hospitalName")String hospitalName);

}
