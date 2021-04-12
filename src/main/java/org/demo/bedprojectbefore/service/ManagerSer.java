package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.ManagerMapper;
import org.demo.bedprojectbefore.pojo.Sys_manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerSer{

    @Resource
    private ManagerMapper managerMapper;
    public Sys_manager login(String userAccount, String passWord)
    {
        return managerMapper.login(userAccount,passWord);
    }

    public int insManager(Sys_manager sys_manager) {
        return managerMapper.insManager(sys_manager);
    }

    public List<Sys_manager> getManagerList(String userAccount, String userName, String userPhone, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return managerMapper.getManagerList(userAccount, userName, userPhone, pageNo, pageSize);
    }

    public int getManagerCount(String userAccount, String userName, String userPhone) {
        return managerMapper.getManagerCount(userAccount, userName, userPhone);
    }

    public int updPassword(String userAccount, String oldPassword, String newPassword) {
        return managerMapper.updPassword(userAccount, oldPassword, newPassword);
    }

    public int updatePassword(int agentId) {
        return managerMapper.updatePassword(agentId);
    }

    public Sys_manager sys_manager(int agentId) {
        return managerMapper.sys_manager(agentId);
    }

    public List<Sys_manager> getSys_manager_ByPhone(String userPhone) {
        return managerMapper.getSys_manager_ByPhone(userPhone);
    }

    public int delById(int managerId) {
        return managerMapper.delById(managerId);
    }

    public int updIsFlag(int managerId, int isFlag) {
        if(isFlag==2){
            isFlag=1;
        }else{
            isFlag=2;
        }
        return managerMapper.updIsFlag(managerId,isFlag);
    }

    public int updPwd(int managerId, String pwd) {
        return managerMapper.updPwd(managerId, pwd);
    }

    public int updManager(int managerId, String userName, String userAccount, String userPhone) {
        return managerMapper.updManager(managerId, userName, userAccount, userPhone);
    }

    public int insRole(int managerId, int roleId) {
        return managerMapper.insRole(managerId, roleId);
    }




}
