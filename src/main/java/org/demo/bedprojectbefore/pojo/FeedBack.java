package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Date:  2021/3/29/17:02
 */
public class FeedBack {
    private int feedbackId;
    private int userId;
    private String nickName;
    private String userPhone;
    private String commonProblemTitle;
    private String feedbackContent;
    private String feedbackPic;
    private int feedbackStatus;
    private String statusStr = "已处理";
    private String feedbackDesc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eTime;
    //存储图片路径
    private List<String> picList = new ArrayList<>();

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommonProblemTitle() {
        return commonProblemTitle;
    }

    public void setCommonProblemTitle(String commonProblemTitle) {
        this.commonProblemTitle = commonProblemTitle;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getFeedbackPic() {
        return feedbackPic;
    }

    public void setFeedbackPic(String feedbackPic) {
        this.feedbackPic = feedbackPic;
    }

    public int getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(int feedBackStatus) {
        if(feedBackStatus==1){
            statusStr = "未处理";
        }
        this.feedbackStatus = feedBackStatus;
    }

    public String getFeedbackDesc() {
        return feedbackDesc;
    }

    public void setFeedbackDesc(String feedbackDesc) {
        this.feedbackDesc = feedbackDesc;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }
}
