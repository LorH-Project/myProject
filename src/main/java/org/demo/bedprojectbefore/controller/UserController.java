package org.demo.bedprojectbefore.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;

import org.demo.bedprojectbefore.pojo.Agent;
import org.demo.bedprojectbefore.pojo.Maintain_users;
import org.demo.bedprojectbefore.pojo.Sms_message;
import org.demo.bedprojectbefore.pojo.User;
import org.demo.bedprojectbefore.service.MainUserSer;
import org.demo.bedprojectbefore.service.SmsSer;
import org.demo.bedprojectbefore.service.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@Api("用户管理")
@RestController
@CrossOrigin
public class UserController {

    @Resource
    private UserSer userSer;
    @Resource
    private MainUserSer mainUserSer;
    @Resource
    private SmsSer smsSer;

    @ApiOperation(httpMethod = "GET",value = "查询用户列表",notes = "查询用户列表")
    @RequestMapping(value = "/getUserList")
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

    @ApiOperation(httpMethod = "GET",value = "分页查询用户列表",notes = "分页查询用户列表")
    @RequestMapping(value = "/pageUserList")
    public Dto pageUserList(@Param("pageNo") String pageNo,
                            @Param("pageSize") String pageSize,
                            @RequestParam(defaultValue = "",required = false) String nickName,
                            @RequestParam(defaultValue = "",required = false) String userPhone,
                            @RequestParam(defaultValue = "",required = false) String isDeposit,
                            @RequestParam(defaultValue = "",required = false) String isFlag){
        System.out.println("pageNo:"+pageNo+"pageSize:"+pageSize+"nickName:"+nickName+"userPhone:"+userPhone+"isDeposit:"+isDeposit+"isFlag："+isFlag);
        if(pageNo==null){
            pageNo="1";
        }
        if(pageSize==null){
            pageSize="3";
        }
        List<User> userList=userSer.pageUserList(nickName, userPhone, isDeposit, isFlag, Integer.parseInt(pageNo), Integer.parseInt(pageSize));
        if(userList!=null){
            Page<User> page=new Page<>();
            page.setPageNo(Integer.parseInt(pageNo));
            page.setPageSize(Integer.parseInt(pageSize));
            page.setTotalCount(userSer.getPageUserCount(nickName, userPhone, isDeposit, isFlag));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            page.setRows(userList);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "GET",value = "短信列表",notes = "短信列表")
    @RequestMapping(value = "/smsManagerList")
    public Dto smsManagerList(@RequestParam(defaultValue = "",required = false)String content,
                              @RequestParam(defaultValue = "1")Integer pageNo,
                              @RequestParam(defaultValue = "3")Integer pageSize){
        List<Sms_message> smsList=smsSer.smsList(content, pageNo, pageSize);
        if(smsList!=null){
            Page<Sms_message> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(smsSer.getSmsCount(content));
            page.setRows(smsList);
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "GET",value = "删除短信",notes = "删除短信")
    @RequestMapping(value = "/delSms")
    public Dto delSms(@RequestParam("messageId")int messageId){
           return DtoUtil.returnSuccess(smsSer.delSms(messageId));
    }

    @ApiOperation(httpMethod = "GET",value = "维护人员列表查询",notes = "维护人员列表查询")
    @RequestMapping(value = "/mainUserList")
    public Dto mainUserList(@RequestParam(defaultValue = "",required = false) String realName,
                            @RequestParam(defaultValue = "",required = false) String userPhone,
                            @RequestParam(defaultValue = "",required = false) Integer agentId,
                            @RequestParam(defaultValue = "1") Integer pageNo,
                            @RequestParam(defaultValue = "3") Integer pageSize){
        List<Maintain_users> maintainUsersList=mainUserSer.mainUserList(realName, userPhone, agentId, pageNo, pageSize);
        for (Maintain_users maintain_user : maintainUsersList) {
            String[] Ids = maintain_user.getHospitalIds().split(",");
            maintain_user.setHospitalNames(mainUserSer.getHospitalList(Ids));
        }
        if(maintainUsersList!=null){
            Page<Maintain_users> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(mainUserSer.getMainCount(realName, userPhone, agentId));
            page.setRows(maintainUsersList);
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "GET",value = "删除维护人员",notes = "删除维护人员")
    @RequestMapping(value = "/delMain")
    public Dto delMain(@RequestParam("maintainId")int maintainId){
          return  DtoUtil.returnSuccess(mainUserSer.delMain(maintainId));
    }





}
