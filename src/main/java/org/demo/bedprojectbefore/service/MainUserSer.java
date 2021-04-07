package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.Maintain_users_Mapper;
import org.demo.bedprojectbefore.pojo.Maintain_users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MainUserSer {

    @Resource
    private Maintain_users_Mapper maintainUsersMapper;

    public List<Maintain_users> mainUserList(String realName,String userPhone,Integer agentId,Integer pageNo,Integer pageSize){
        return maintainUsersMapper.mainUserList(realName, userPhone, agentId,pageNo,pageSize);
    }

    public int getMainCount(@Param("realName") String realName,
                            @Param("userPhone") String userPhone,
                            @Param("agentId") Integer agentId){
        return maintainUsersMapper.getMainCount(realName, userPhone, agentId);
    }
    public int delMain(@Param("maintainId") int maintainId){
        return maintainUsersMapper.delMain(maintainId);
    }
}
