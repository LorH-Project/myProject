package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class User {
    private Integer userId;
    private String userNo;
    private String nickName;
    private String avatarUrl;
    private String userPhone;
    private String openId;
    private Integer isDeposit;
    private Integer isFlag;
    private Date cTime;
    private Integer agentId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Integer isDeposit) {
        this.isDeposit = isDeposit;
    }

    public Integer getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(Integer isFlag) {
        this.isFlag = isFlag;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public User() {
    }

    public User(Integer userId, String userNo, String nickName, String avatarUrl, String userPhone, String openId, Integer isDeposit, Integer isFlag, Date cTime, Integer agentId) {
        this.userId = userId;
        this.userNo = userNo;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.userPhone = userPhone;
        this.openId = openId;
        this.isDeposit = isDeposit;
        this.isFlag = isFlag;
        this.cTime = cTime;
        this.agentId = agentId;
    }
}
