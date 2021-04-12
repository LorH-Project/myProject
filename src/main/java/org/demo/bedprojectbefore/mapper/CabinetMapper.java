package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Cabinet_switch;

import java.util.List;

@Mapper
public interface CabinetMapper {

    /**
     * 陪护床格子开关列表
     * @param nickName
     * @param deviceNumber
     * @param agentId
     * @param cabinetNumber
     * @param start
     * @param end
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<Cabinet_switch> cabList(@Param("nickName")String nickName,@Param("deviceNumber")String deviceNumber,
                                        @Param("agentId")int agentId,@Param("cabinetNumber")String cabinetNumber,
                                        @Param("start")String start,@Param("end")String end,
                                        @Param("pageNo")int pageNo,@Param("pageSize")int pageSize);
    public int getCabCount(@Param("nickName")String nickName,@Param("deviceNumber")String deviceNumber,
                           @Param("agentId")int agentId,@Param("cabinetNumber")String cabinetNumber,
                           @Param("start")String start,@Param("end")String end);
}
