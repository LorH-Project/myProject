package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Order_Cash;

import java.util.List;

@Mapper
public interface Order_CashMapper {
    List<Order_Cash> getOrderCashList(@Param("orderId") int orderId, @Param("companyName") String companyName, @Param("linkPhone") String linkPhone, @Param("reservePhone") String reservePhone, @Param("bankNumber") String bankNumber, @Param("status") int status, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    int getOrderCashCount(@Param("orderId") int orderId,@Param("companyName") String companyName,@Param("linkPhone") String linkPhone,@Param("reservePhone") String reservePhone,@Param("bankNumber") String bankNumber,@Param("status") int status);
}
