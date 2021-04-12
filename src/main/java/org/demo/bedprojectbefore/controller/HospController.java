package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Dept;
import org.demo.bedprojectbefore.pojo.Hospital;
import org.demo.bedprojectbefore.service.DeptSer;
import org.demo.bedprojectbefore.service.HospSer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api("医院管理")
@RestController
@CrossOrigin
public class HospController {

    @Resource
    private HospSer hospSer;

    @Resource
    private DeptSer deptSer;


    @ApiOperation(httpMethod = "GET",value = "医院列表",notes = "医院列表")
        @RequestMapping(value = "/hospList")
    public Dto hospList(@RequestParam(defaultValue = "",required = false) String hospitalName,
                        @RequestParam(defaultValue = "",required = false) String address,
                        @RequestParam(defaultValue = "",required = false) String linkName,
                        @RequestParam(defaultValue = "",required = false) String linkPhone,
                        @RequestParam(defaultValue = "",required = false) String companyName,
                        @RequestParam(defaultValue = "1")Integer pageNo,
                        @RequestParam(defaultValue = "3")Integer pageSize){
        System.out.println(hospitalName+" "+address+" "+linkName+" "+linkPhone+" "+companyName);
        List<Hospital> hospitalList=hospSer.hospList(hospitalName, address, linkName, linkPhone, companyName, pageNo, pageSize);
        if(hospitalList!=null){
            Page<Hospital> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(hospSer.getHospCount(hospitalName, address, linkName, linkPhone, companyName));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            page.setRows(hospitalList);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }


    @ApiOperation(httpMethod = "GET",value = "删除医院",notes = "删除医院")
    @RequestMapping(value = "/delHosp")
    public Dto delHosp(@RequestParam("hospitalId") int hospitalId){
        System.out.println(hospitalId);
        int result=hospSer.delHosp(hospitalId);
        if(result>0){
            return DtoUtil.returnSuccess(hospSer.delHosp(hospitalId));
        }
        return DtoUtil.returnSuccess("删除失败","404");
    }

    @ApiOperation(httpMethod = "GET",value = "科室列表",notes = "科室列表")
    @RequestMapping(value = "/deptList")
    public Dto deptList(@RequestParam(defaultValue = "",required = false)String hospitalName,
                        @RequestParam(defaultValue = "",required = false)String address,
                        @RequestParam(defaultValue = "",required = false)String deptName,
                        @RequestParam(defaultValue = "1")Integer pageNo,
                        @RequestParam(defaultValue = "3")Integer pageSize){
        List<Dept> deptList=deptSer.deptList(hospitalName, address, deptName, pageNo, pageSize);
        if(deptList!=null){
            Page<Dept> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(deptSer.getDeptCount(hospitalName, address, deptName));
            page.setRows(deptList);
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }

    @ApiOperation(httpMethod = "GET",value = "删除科室",notes = "删除科室")
    @RequestMapping(value = "/delDept")
    public Dto delDept(@RequestParam("id") int id) {
        return DtoUtil.returnSuccess(deptSer.delDept(id));
    }



}