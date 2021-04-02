package org.demo.bedprojectbefore.controller;

import org.demo.bedprojectbefore.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserSer userSer;

    @GetMapping(value = "/selUser")
    public String selUser(){
        return "redirect:/userList";
    }

    @GetMapping(value = "/getUserList")
    public String getUserList(){
        return "hhh";
    }
}
