package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Sys_manager;
import org.demo.bedprojectbefore.service.ManagerSer;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Api("权限管理")
@RestController
@CrossOrigin
public class Sys_ManagerController {
    @Resource
    private ManagerSer sys_managerService;

    @ApiOperation(httpMethod = "GET",value = "管理员列表",notes = "管理员列表")
    @RequestMapping("/getManagerList")
    public Dto getMangerList(@RequestParam(defaultValue = "",required = false) String userAccount,
                             @RequestParam(defaultValue = "",required = false) String userName,
                             @RequestParam(defaultValue = "",required = false) String userPhone,
                             @RequestParam(defaultValue = "1") int pageNo,
                             @RequestParam(defaultValue = "5") int pageSize){
        Page<Sys_manager> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setRows(sys_managerService.getManagerList(userAccount, userName, userPhone, pageNo, pageSize));
        page.setTotalCount(sys_managerService.getManagerCount(userAccount, userName, userPhone));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }
    @ApiOperation(httpMethod = "GET",value = "新增管理员",notes = "新增管理员")
    @RequestMapping("/insManager")
    public Dto insManager(@RequestBody Sys_manager sys_manager){
        return DtoUtil.returnSuccess(sys_managerService.insManager(sys_manager));
    }
    @ApiIgnore
    @RequestMapping("/updPassword")
    public Dto updPassword(String userAccount,String oldPassword,String newPassword){
        return DtoUtil.returnSuccess(sys_managerService.updPassword(userAccount,oldPassword,newPassword));
    }
    @ApiIgnore
    @RequestMapping("/delById")
    public Dto delById(int managerId){
        return DtoUtil.returnSuccess(sys_managerService.delById(managerId));
    }
    @ApiIgnore
    @RequestMapping("/updIsFlag")
    public Dto updIsFlag(int managerId,int isFlag){
        return DtoUtil.returnSuccess(sys_managerService.updIsFlag(managerId, isFlag));
    }
    @ApiIgnore
    @RequestMapping("/updPwd")
    public Dto updPwd(int managerId,String pwd){
        return DtoUtil.returnSuccess(sys_managerService.updPwd(managerId, pwd));
    }
    @ApiIgnore
    @RequestMapping("/updManager")
    public Dto updManager(int managerId,String userName,String userAccount,String userPhone){
        return DtoUtil.returnSuccess(sys_managerService.updManager(managerId, userName, userAccount, userPhone));
    }
    @ApiIgnore
    @RequestMapping("/insRole")
    public Dto insRole(int managerId,int roleId){
        return DtoUtil.returnSuccess(sys_managerService.insRole(managerId, roleId));
    }
}
