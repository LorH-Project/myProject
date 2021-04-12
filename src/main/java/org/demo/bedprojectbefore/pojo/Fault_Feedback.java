package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Fault_Feedback {
    private int feedbackId;
    private int userId;
    private String deviceNumber;
    private String feedbackPic;

    private int feedbackType;
    private String feedbackType2;

    private String faultContext;

    private int status;
    private String status2 = "未处理";
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eTime;
    private String feedbackDesc;

    private String nickName;
    private String userPhone;

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

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getFeedbackPic() {
        return feedbackPic;
    }

    public void setFeedbackPic(String feedbackPic) {
        this.feedbackPic = feedbackPic;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public int getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(int feedbackType) {
        switch(feedbackType){
            case 1:
                feedbackType2 = "屏幕";
                 break;
            case 2:
                feedbackType2 = "锁";
                break;
            case 3:
                feedbackType2 = "柜门";
                break;
            case 4:
                feedbackType2 = "扶手";
                break;
            case 5:
                feedbackType2 = "椅腿";
                break;
            case 6:
                feedbackType2 = "床面";
                break;
            case 7:
                feedbackType2 = "螺丝";
                break;
            case 8:
                feedbackType2 = "其他";
                break;
        }
        this.feedbackType = feedbackType;
    }

    public String getFeedbackType2() {
        return feedbackType2;
    }

    public void setFeedbackType2(String feedbackType2) {
        this.feedbackType2 = feedbackType2;
    }

    public String getFaultContext() {
        return faultContext;
    }

    public void setFaultContext(String faultContext) {
        this.faultContext = faultContext;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if(status == 2){
            status2 = "已处理";
        }
        this.status = status;
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

    public String getFeedbackDesc() {
        return feedbackDesc;
    }

    public void setFeedbackDesc(String feedbackDesc) {
        this.feedbackDesc = feedbackDesc;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
