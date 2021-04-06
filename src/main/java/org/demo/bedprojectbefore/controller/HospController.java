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
    @RequestMapping(value = "/hospList" , method = RequestMethod.POST)
    public Dto hospList(String hospitalName, String address, String linkName, String linkPhone, String companyName, @RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "3")Integer pageSize){
        List<Hospital> hospitalList=hospSer.hospList(hospitalName, address, linkName, linkPhone, companyName, pageNo, pageSize);
        if(hospitalList!=null){
            Page<Hospital> page=new Page<>();
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            page.setTotalCount(hospSer.getHospCount(hospitalName, address, linkName, linkPhone, companyName));
            page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
            page.setRows(hospSer.hospList(hospitalName, address, linkName, linkPhone, companyName, pageNo, pageSize));
            return DtoUtil.returnSuccess(page);
        }
        return DtoUtil.returnSuccess("未查到数据","404");
    }


    @ApiOperation(httpMethod = "POST",value = "delHosp",notes = "删除医院")
    @RequestMapping(value = "/delHosp", method = RequestMethod.POST)
    public Dto delHosp(int id){
        int result=hospSer.delHosp(id);
        if(result>0){
            return DtoUtil.returnSuccess(hospSer.delHosp(id));
        }
        return DtoUtil.returnSuccess("删除失败","404");
    }



}
