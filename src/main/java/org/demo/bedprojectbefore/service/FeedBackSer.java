package org.demo.bedprojectbefore.service;

import org.demo.bedprojectbefore.mapper.FeedBackMapper;
import org.demo.bedprojectbefore.pojo.FeedBack;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Date:  2021/3/29/20:25
 */
@Service
public class FeedBackSer{
    @Resource
    private FeedBackMapper feedBackMapper;
    public List<FeedBack> getFeedBackList(String userName, String phone, String commonProblemTitle, int feedbackStatus, int pageNo, int pageSize) {
        pageNo = (pageNo-1)*pageSize;
        return feedBackMapper.getFeedBackList(userName, phone, commonProblemTitle, feedbackStatus, pageNo, pageSize);
    }

    public List<String> getCommonProblemTitleList() {
        return feedBackMapper.getCommonProblemTitleList();
    }

    public int getFeedBackTotal(String userName, String phone, String commonProblemTitle, int feedbackStatus) {
        return feedBackMapper.getFeedBackTotal(userName, phone, commonProblemTitle, feedbackStatus);
    }

    public int updateDescById(int feedbackId, String feedbackDesc) {
        return feedBackMapper.updateDescById(feedbackId, feedbackDesc);
    }

    public String getDescById(int feedbackId) {
        return feedBackMapper.getDescById(feedbackId);
    }

    public FeedBack getContentById(int feedbackId) {
        return feedBackMapper.getContentById(feedbackId);
    }
}
