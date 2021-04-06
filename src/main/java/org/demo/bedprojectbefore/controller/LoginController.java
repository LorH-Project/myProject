package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import org.demo.bedprojectbefore.pojo.Sys_manager;
import org.demo.bedprojectbefore.service.ManagerSer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("用户登录")
@RestController
@RequestMapping(value = "user/*")
@CrossOrigin
public class LoginController {

    @Resource
    private ManagerSer managerSer;

    @GetMapping(value = "/toLogin")
    public String toLogin(){
        return "redirect:/login";
    }

    @GetMapping(value = "/login")
    public String login(String username,String password){
        Sys_manager manager=managerSer.login(username,password);
        if(manager!=null){
            System.out.println("登陆成功");
        }
        return "";
    }

}
