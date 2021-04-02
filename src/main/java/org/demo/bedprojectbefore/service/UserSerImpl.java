package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.UserMapper;
import org.demo.bedprojectbefore.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserSerImpl implements UserSer {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUserList(String nickName, String userPhone, int isDeposit, int isFlag) {
        return userMapper.getUserList(nickName,userPhone,isDeposit,isFlag);
    }
}
