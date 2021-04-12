package org.demo.bedprojectbefore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demo.bedprojectbefore.config.Dto;
import org.demo.bedprojectbefore.config.DtoUtil;
import org.demo.bedprojectbefore.config.Page;
import org.demo.bedprojectbefore.pojo.Fault_Feedback;
import org.demo.bedprojectbefore.pojo.FeedBack;
import org.demo.bedprojectbefore.service.Fault_FeedbackSer;
import org.demo.bedprojectbefore.service.FeedBackSer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;

@Api("意见反馈管理")
@RestController
@CrossOrigin
public class FeedBackController {
    @Resource
    private FeedBackSer feedBackService;

    @Resource
    private Fault_FeedbackSer fault_feedbackService;

    @ApiOperation(httpMethod = "GET",value = "意见反馈列表",notes = "意见反馈列表")
    @RequestMapping("/getFeedBackList")
    public Dto getFeedBackList(@RequestParam(defaultValue = "",required = false) String userName,
                               @RequestParam(defaultValue = "",required = false) String phone,
                               @RequestParam(defaultValue = "",required = false) String commonProblemTitle,
                               @RequestParam(defaultValue = "0") int feedbackStatus,
                               @RequestParam(defaultValue = "1") int pageNo,
                               @RequestParam(defaultValue = "5") int pageSize){
        Page<FeedBack> page = new Page<>();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setTotalCount(feedBackService.getFeedBackTotal(userName, phone, commonProblemTitle, feedbackStatus));
        page.setRows(feedBackService.getFeedBackList(userName, phone, commonProblemTitle, feedbackStatus, pageNo, pageSize));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }
    @ApiIgnore
    @RequestMapping("/getCommonProblemTitleList")
    public Dto getCommonProblemTitleList(){
        return DtoUtil.returnSuccess(feedBackService.getCommonProblemTitleList());
    }
    @ApiIgnore
    @RequestMapping("/updateDescById")
    public Dto updateDescById(@RequestParam("feedbackId") int feedbackId,@RequestParam("feedbackDesc") String feedbackDesc){
        return DtoUtil.returnSuccess(feedBackService.updateDescById(feedbackId,feedbackDesc));
    }
    @ApiIgnore
    @RequestMapping("/getDescById")
    public Dto getDescById(@RequestParam("feedbackId") int feedbackId){
        return DtoUtil.returnSuccess(feedBackService.getDescById(feedbackId));
    }
    @ApiIgnore
    @RequestMapping("/getContentById")
    public Dto getContentById(@RequestParam("feedbackId") int feedbackId){
        FeedBack feedBack = feedBackService.getContentById(feedbackId);
        //根据','将路径分割
        String[] pics = feedBack.getFeedbackPic().split(",");
        System.out.println(pics.length);
        for (String pic : pics) {
            System.out.println(pic);
            feedBack.getPicList().add(pic);
        }
        return DtoUtil.returnSuccess(feedBack);
    }

    @ApiOperation(httpMethod = "GET",value = "故障反馈列表",notes = "故障反馈列表")
    @RequestMapping("/getFaultList")
    public Dto getFaultList(@RequestParam(defaultValue = "",required = false) String deviceNumber,
                            @RequestParam(defaultValue = "0") int feedbackType,
                            @RequestParam(defaultValue = "",required = false) String nickName,
                            @RequestParam(defaultValue = "",required = false) String userPhone,
                            @RequestParam(defaultValue = "0") int status,
                            @RequestParam(defaultValue = "1") int pageNo,
                            @RequestParam(defaultValue = "5") int pageSize){
        System.out.println("deviceNumber"+deviceNumber);
        Page<Fault_Feedback> page = new Page<>();
        page.setRows(fault_feedbackService.getFaultList(deviceNumber, feedbackType, nickName, userPhone, status, pageNo, pageSize));
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setTotalCount(fault_feedbackService.getFaultCount(deviceNumber, feedbackType, nickName, userPhone, status));
        page.setPageCount(page.getTotalCount()%page.getPageSize()==0?page.getTotalCount()/page.getPageSize():page.getTotalCount()/page.getPageSize()+1);
        return DtoUtil.returnSuccess(page);
    }

    @ApiIgnore
    @RequestMapping("/updateDesc")
    public Dto updateDesc(int feedbackId,
                          String feedbackDesc){
        return DtoUtil.returnSuccess(fault_feedbackService.updateDesc(feedbackId, feedbackDesc));
    }
}
