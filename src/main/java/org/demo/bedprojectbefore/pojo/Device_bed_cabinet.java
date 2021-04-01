package org.demo.bedprojectbefore.pojo;

public class Device_bed_cabinet {
    private int cabinetId;
    private int deviceId;
    private int cabinetNumber;
    private int lockNumber;
    private int cabinetStatus;
    private int isFlag;

    public int getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(int cabinetId) {
        this.cabinetId = cabinetId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public int getLockNumber() {
        return lockNumber;
    }

    public void setLockNumber(int lockNumber) {
        this.lockNumber = lockNumber;
    }

    public int getCabinetStatus() {
        return cabinetStatus;
    }

    public void setCabinetStatus(int cabinetStatus) {
        this.cabinetStatus = cabinetStatus;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }

    public Device_bed_cabinet() {
    }

    public Device_bed_cabinet(int cabinetId, int deviceId, int cabinetNumber, int lockNumber, int cabinetStatus, int isFlag) {
        this.cabinetId = cabinetId;
        this.deviceId = deviceId;
        this.cabinetNumber = cabinetNumber;
        this.lockNumber = lockNumber;
        this.cabinetStatus = cabinetStatus;
        this.isFlag = isFlag;
    }
}
