package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class User {
    private int userId;
    private String userNo;
    private String nickName;
    private String avatarUrl;
    private String userPhone;
    private String openId;
    private int isDeposit;
    private int isFlag;
    private Date cTime;
    private int agentId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public int getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(int isDeposit) {
        this.isDeposit = isDeposit;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public User() {
    }

    public User(int userId, String userNo, String nickName, String avatarUrl, String userPhone, String openId, int isDeposit, int isFlag, Date cTime, int agentId) {
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
