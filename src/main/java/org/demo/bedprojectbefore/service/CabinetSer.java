package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.CabinetMapper;
import org.demo.bedprojectbefore.pojo.Cabinet_switch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CabinetSer {

    @Resource
    private CabinetMapper cabinetMapper;

    public List<Cabinet_switch> cabList(@Param("nickName")String nickName, @Param("deviceNumber")String deviceNumber,
                                        @Param("agentId")int agentId, @Param("cabinetNumber")String cabinetNumber,
                                        @Param("start")String start, @Param("end")String end,
                                        @Param("pageNo")int pageNo, @Param("pageSize")int pageSize){
        pageNo = (pageNo-1)*pageSize;
        return cabinetMapper.cabList(nickName, deviceNumber, agentId, cabinetNumber, start, end, pageNo, pageSize);
    }
    public int getCabCount(@Param("nickName")String nickName,@Param("deviceNumber")String deviceNumber,
                           @Param("agentId")int agentId,@Param("cabinetNumber")String cabinetNumber,
                           @Param("start")String start,@Param("end")String end){
        return cabinetMapper.getCabCount(nickName, deviceNumber, agentId, cabinetNumber, start, end);

    }


}
