package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Replenishment_Record;

import java.util.List;

@Mapper
public interface ReplenMapper {
    /**
     * 补货记录表
     * @param deviceNumber
     * @param hospitalName
     * @param agentId
     * @param goodsName
     * @param realName
     * @param userPhone
     * @param replenishmentType
     * @param start
     * @param end
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Replenishment_Record> getReplenishmentList(@Param("deviceNumber") String deviceNumber, @Param("hospitalName") String hospitalName, @Param("agentId") int agentId, @Param("goodsName") String goodsName, @Param("realName") String realName, @Param("userPhone") String userPhone, @Param("replenishmentType") int replenishmentType, @Param("start") String start, @Param("end") String end, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    int getReplenishmentCount(@Param("deviceNumber") String deviceNumber,@Param("hospitalName") String hospitalName,@Param("agentId") int agentId,@Param("goodsName") String goodsName,@Param("realName") String realName,@Param("userPhone") String userPhone,@Param("replenishmentType") int replenishmentType,@Param("start") String start,@Param("end") String end);

}
