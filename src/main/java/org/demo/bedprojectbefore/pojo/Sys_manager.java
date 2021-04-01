package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class Sys_manager {
    private String managerId;
    private String userName;
    private String userPhone;
    private String userAccount;
    private String passWord;
    private String managerPic;
    private int managerType;
    private Date ctime;
    private int isFlag;
    private int isDel;
    private int agentId;

    public Sys_manager() {
    }

    public Sys_manager(String managerId, String userName, String userPhone, String userAccount, String passWord, String managerPic, int managerType, Date ctime, int isFlag, int isDel, int agentId) {
        this.managerId = managerId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAccount = userAccount;
        this.passWord = passWord;
        this.managerPic = managerPic;
        this.managerType = managerType;
        this.ctime = ctime;
        this.isFlag = isFlag;
        this.isDel = isDel;
        this.agentId = agentId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getManagerPic() {
        return managerPic;
    }

    public void setManagerPic(String managerPic) {
        this.managerPic = managerPic;
    }

    public int getManagerType() {
        return managerType;
    }

    public void setManagerType(int managerType) {
        this.managerType = managerType;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }
}
