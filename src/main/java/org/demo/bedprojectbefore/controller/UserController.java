package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.pojo.User;
import org.demo.bedprojectbefore.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("用户管理")
@RestController
@RequestMapping(value = "user/*")
public class UserController {

    @Autowired
    private UserSer userSer;

    @GetMapping(value = "/selUser")
    public String selUser(){
        return "redirect:/userList";
    }

    @GetMapping(value = "/getUserList")
    public Dto getUserList(String nickName, String userPhone, String isDeposit, String isFlag){
        List<User> userList=userSer.getUserList(nickName, userPhone, isDeposit, isFlag);
        if(userList!=null){
            return DtoUtil.returnSuccess(userList);
        }
        return DtoUtil.returnSuccess("未查到数据","500");
    }
}
