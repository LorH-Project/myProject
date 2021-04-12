package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Author:LiaoZhen
 * Date:  2021/3/30/15:50
 */
public class Agent {
    private int agentId;
    private String companyName;
    private double bedCommissionRatio;
    private double goodsCommissionRatio;
    private double serviceRatio;
    private String linkName;
    private String linkPhone;
    private String note;
    private String servicePhone;
    private int isDel;
    private int isFlag;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ctime;

    private String userAccount;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getBedCommissionRatio() {
        return bedCommissionRatio;
    }

    public void setBedCommissionRatio(double bedCommissionRatio) {
        this.bedCommissionRatio = bedCommissionRatio;
    }

    public double getGoodsCommissionRatio() {
        return goodsCommissionRatio;
    }

    public void setGoodsCommissionRatio(double goodsCommissionRatio) {
        this.goodsCommissionRatio = goodsCommissionRatio;
    }

    public double getServiceRatio() {
        return serviceRatio;
    }

    public void setServiceRatio(double serviceRatio) {
        this.serviceRatio = serviceRatio;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
