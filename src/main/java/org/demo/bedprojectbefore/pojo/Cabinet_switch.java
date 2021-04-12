package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Cabinet_switch {
    private int swaitchId;
    private int userId;
    private int hospitalId;
    private String deviceNumber;
    private String cabinetNumber;
    private int deviceType;
    private int swaitchType;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;


    private String companyName;
    private String nickName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Cabinet_switch(int swaitchId, int userId, int hospitalId, String deviceNumber, String cabinetNumber, int deviceType, int swaitchType, Date cTime, String companyName, String nickName) {
        this.swaitchId = swaitchId;
        this.userId = userId;
        this.hospitalId = hospitalId;
        this.deviceNumber = deviceNumber;
        this.cabinetNumber = cabinetNumber;
        this.deviceType = deviceType;
        this.swaitchType = swaitchType;
        this.cTime = cTime;
        this.companyName = companyName;
        this.nickName = nickName;
    }

    public Cabinet_switch() {
    }

    public int getSwaitchId() {
        return swaitchId;
    }

    public void setSwaitchId(int swaitchId) {
        this.swaitchId = swaitchId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getSwaitchType() {
        return swaitchType;
    }

    public void setSwaitchType(int swaitchType) {
        this.swaitchType = swaitchType;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
