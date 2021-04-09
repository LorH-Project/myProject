package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class Maintain_users {
    private int maintainId;
    private int userId;
    private int agentId;
    private String realName;
    private String hospitalIds;
    private int maintainType;
    private Date cTime;
    private String userPhone;
    private String companyName;

    public Maintain_users() {
    }

    public Maintain_users(int maintainId, int userId, int agentId, String realName, String hospitalIds, int maintainType, Date cTime) {
        this.maintainId = maintainId;
        this.userId = userId;
        this.agentId = agentId;
        this.realName = realName;
        this.hospitalIds = hospitalIds;
        this.maintainType = maintainType;
        this.cTime = cTime;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(int maintainId) {
        this.maintainId = maintainId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHospitalIds() {
        return hospitalIds;
    }

    public void setHospitalIds(String hospitalIds) {
        this.hospitalIds = hospitalIds;
    }

    public int getMaintainType() {
        return maintainType;
    }

    public void setMaintainType(int maintainType) {
        this.maintainType = maintainType;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
