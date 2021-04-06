package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.UserMapper;
import org.demo.bedprojectbefore.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserSer {

    @Resource
    private UserMapper userMapper;
    
    public List<User> getUserList(String nickName, String userPhone, String isDeposit, String isFlag) {
        return userMapper.getUserList(nickName,userPhone,isDeposit,isFlag);
    }
    public List<User> pageUserList(String nickName, String userPhone, String isDeposit, String isFlag,Integer pageNo,Integer pageSize){
        return userMapper.pageUserList(nickName, userPhone, isDeposit, isFlag, pageNo, pageSize);
    }

    public int getPageUserCount(@Param("nickName") String nickName,
                                @Param("userPhone") String userPhone,
                                @Param("isDeposit") String isDeposit,
                                @Param("isFlag") String isFlag) {
        return userMapper.getPageUserCount(nickName, userPhone, isDeposit, isFlag);
    }
}
