package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Hospital;
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


    @ApiOperation(httpMethod = "POST",value = "hospList",notes = "医院列表")
    @RequestMapping(value = "/hospList")
    public Dto hospList(@RequestParam(defaultValue = "",required = false) String hospitalName,
                        @RequestParam(defaultValue = "",required = false) String address,
                        @RequestParam(defaultValue = "",required = false) String linkName,
                        @RequestParam(defaultValue = "",required = false) String linkPhone,
                        @RequestParam(defaultValue = "",required = false) String companyName,
                        @RequestParam(defaultValue = "0")Integer pageNo,
                        @RequestParam(defaultValue = "3")Integer pageSize){
        System.out.println(hospitalName+" "+address+" "+linkName+" "+linkPhone+" "+companyName);
        List<Hospital> hospitalList=hospSer.hospList(hospitalName, address, linkName, linkPhone, companyName, pageNo, pageSize);
        System.out.println(hospitalList);
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


    @ApiOperation(httpMethod = "POST",value = "delHosp",notes = "删除医院")
    @RequestMapping(value = "/delHosp")
    public Dto delHosp(@RequestParam("id") int id){
        System.out.println(id);
        int result=hospSer.delHosp(id);
        if(result>0){
            return DtoUtil.returnSuccess(hospSer.delHosp(id));
        }
        return DtoUtil.returnSuccess("删除失败","404");
    }



}
