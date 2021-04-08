package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class Device {
    private int deviceId;
    private String deviceNumber;
    private int hospitalId;
    private int agentId;
    private int departmentId;
    private String deviceAddress;
    private int deviceStatus;
    private String deviceQrcode;
    private int isBinding;
    private int isStock;
    private int isDel;
    private int isFlag;
    private Date cTime;

    public Device() {
    }

    public Device(int deviceId, String deviceNumber, int hospitalId, int agentId, int departmentId, String deviceAddress, int deviceStatus, String deviceQrcode, int isBinding, int isStock, int isDel, int isFlag, Date cTime) {
        this.deviceId = deviceId;
        this.deviceNumber = deviceNumber;
        this.hospitalId = hospitalId;
        this.agentId = agentId;
        this.departmentId = departmentId;
        this.deviceAddress = deviceAddress;
        this.deviceStatus = deviceStatus;
        this.deviceQrcode = deviceQrcode;
        this.isBinding = isBinding;
        this.isStock = isStock;
        this.isDel = isDel;
        this.isFlag = isFlag;
        this.cTime = cTime;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public int getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(int deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceQrcode() {
        return deviceQrcode;
    }

    public void setDeviceQrcode(String deviceQrcode) {
        this.deviceQrcode = deviceQrcode;
    }

    public int getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(int isBinding) {
        this.isBinding = isBinding;
    }

    public int getIsStock() {
        return isStock;
    }

    public void setIsStock(int isStock) {
        this.isStock = isStock;
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

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
