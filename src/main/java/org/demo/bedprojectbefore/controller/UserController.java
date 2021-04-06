package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Maintain_users;
import org.demo.bedprojectbefore.pojo.User;
import org.demo.bedprojectbefore.service.MainUserSer;
import org.demo.bedprojectbefore.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Api("用户管理")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserSer userSer;
    @Autowired
    private MainUserSer mainUserSer;

    @GetMapping(value = "/selUser")
    public String selUser(){
        return "redirect:/userList";
    }

    @ApiOperation(httpMethod = "POST",value = "getUserList",notes = "查询用户列表")
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    public Dto getUserList(@RequestParam(defaultValue = "",required = false) String nickName,
                           @RequestParam(defaultValue = "",required = false) String userPhone,
                           @RequestParam(defaultValue = "",required = false) String isDeposit,
                           @RequestParam(defaultValue = "",required = false) String isFlag){
        List<User> userList=userSer.getUserList(nickName, userPhone, isDeposit, isFlag);
        if(userList!=null){
            return DtoUtil.returnSuccess(userList);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "POST",value = "pageUserList",notes = "分页查询用户列表")
    @RequestMapping(value = "/pageUserList", method = RequestMethod.POST)
    public Dto pageUserList(@RequestParam(defaultValue = "",required = false) String nickName,
                            @RequestParam(defaultValue = "",required = false) String userPhone,
                            @RequestParam(defaultValue = "",required = false) String isDeposit,
                            @RequestParam(defaultValue = "",required = false) String isFlag,
                            @RequestParam(defaultValue = "1")Integer pageNo,
                            @RequestParam(defaultValue = "3")Integer pageSize){
        List<User> userList=userSer.pageUserList(nickName, userPhone, isDeposit, isFlag, pageNo, pageSize);
        if(userList!=null){
            Page<User> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(userSer.getPageUserCount(nickName, userPhone, isDeposit, isFlag));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            page.setRows(userList);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "POST",value = "smsManagerList",notes = "短信列表")
    @RequestMapping(value = "/smsManagerList", method = RequestMethod.POST)
    public Dto smsManagerList(){
        return DtoUtil.returnSuccess("未查到数据","404");
    }
    //维护人员列表查询
    public Dto mainUserList(String realName,String userPhone,Integer agentId){
        List<Maintain_users> maintainUsersList=mainUserSer.mainUserList(realName, userPhone, agentId);
        if(maintainUsersList!=null){
            return DtoUtil.returnSuccess(maintainUsersList);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }
}
