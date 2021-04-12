package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.Fault_FeedbackMapper;
import org.demo.bedprojectbefore.pojo.Fault_Feedback;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Fault_FeedbackSer{
    @Resource
    private Fault_FeedbackMapper fault_feedbackMapper;

    public List<Fault_Feedback> getFaultList(String deviceNumber, int feedbackType, String nickName, String userPhone, int status, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return fault_feedbackMapper.getFaultList(deviceNumber, feedbackType, nickName, userPhone, status, pageNo, pageSize);
    }

    public int getFaultCount(String deviceNumber, int feedbackType, String nickName, String userPhone, int status) {
        return fault_feedbackMapper.getFaultCount(deviceNumber, feedbackType, nickName, userPhone, status);
    }

    public int updateDesc(int feedbackId, String feedbackDesc) {
        return fault_feedbackMapper.updateDesc(feedbackId, feedbackDesc);
    }
}
