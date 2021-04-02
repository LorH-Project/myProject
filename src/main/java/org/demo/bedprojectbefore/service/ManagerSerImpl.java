package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.ManagerMapper;
import org.demo.bedprojectbefore.pojo.Sys_manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerSerImpl implements ManagerSer {

    @Resource
    private ManagerMapper managerMapper;
    @Override
    public Sys_manager login(String username, String password) {
        return managerMapper.login(username,password);
    }
}