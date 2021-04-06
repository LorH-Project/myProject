package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Maintain_users_Mapper;
import org.demo.bedprojectbefore.pojo.Maintain_users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MainUserSer {

    @Resource
    private Maintain_users_Mapper maintainUsersMapper;

    public List<Maintain_users> mainUserList(String realName,String userPhone,Integer agentId){
        return maintainUsersMapper.mainUserList(realName, userPhone, agentId);
    }
}
