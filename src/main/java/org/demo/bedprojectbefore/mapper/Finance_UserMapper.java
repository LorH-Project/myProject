package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Finance_User;

import java.util.List;

@Mapper
public interface Finance_UserMapper {

    List<Finance_User> FinaList(@Param("outTradeNo")String outTradeNo,
                                @Param("nickName")String nickName,
                                @Param("financeType")int financeType,
                                @Param("start")String start,
                                @Param("end")String end,
                                @Param("pageNo") int pageNo,
                                @Param("pageSize") int pageSize
                                );

    int getFinaCount(@Param("outTradeNo")String outTradeNo,
                     @Param("nickName")String nickName,
                     @Param("financeType")int financeType,
                     @Param("start")String start,
                     @Param("end")String end);

}
