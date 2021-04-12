package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.ReplenMapper;
import org.demo.bedprojectbefore.pojo.Replenishment_Record;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReplenSer {
    @Resource
    private ReplenMapper replenMapper;

    public List<Replenishment_Record> getReplenishmentList(String deviceNumber, String hospitalName, int agentId, String goodsName, String realName, String userPhone, int replenishmentType, String start, String end, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return replenMapper.getReplenishmentList(deviceNumber, hospitalName, agentId, goodsName, realName, userPhone, replenishmentType,start,end, pageNo, pageSize);
    }

    public int getReplenishmentCount(String deviceNumber, String hospitalName, int agentId, String goodsName, String realName, String userPhone, int replenishmentType,String start,String end) {
        return replenMapper.getReplenishmentCount(deviceNumber, hospitalName, agentId, goodsName, realName, userPhone, replenishmentType,start,end);
    }

}
