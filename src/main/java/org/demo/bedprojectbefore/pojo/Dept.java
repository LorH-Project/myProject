package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Dept {
    private int deptId;
    private String deptName;
    private int hospitalId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    private String hospitalName;
    private String address;
    private int deviceCount;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Dept(int deptId, String deptName, int hospitalId, Date cTime) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.hospitalId = hospitalId;
        this.cTime = cTime;
    }

    public Dept() {
    }
}
