package org.demo.bedprojectbefore.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping(value = "/suuccess")
    public String login(){
        return "登录成功";
    }

}
