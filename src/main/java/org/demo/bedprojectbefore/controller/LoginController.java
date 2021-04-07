package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.pojo.Sys_manager;
import org.demo.bedprojectbefore.service.ManagerSer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api("用户登录")
@RestController
@CrossOrigin
public class LoginController {

    @Resource
    private ManagerSer managerSer;

    @ApiOperation(httpMethod = "GET",value = "login",notes = "登录")
    @RequestMapping(value = "/login")
    public Dto login(@RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println(username+" "+password);
        Sys_manager manager=managerSer.login(username,password);
        System.out.println(manager);
        if(manager!=null){
            return DtoUtil.returnSuccess("登录成功");
        }
        return DtoUtil.returnSuccess("登录失败","404");
    }

}
