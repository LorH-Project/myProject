package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.DecimalFormat;
import java.util.Date;

public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String province;
    private String city;
    private String area;
    private String address;
    private String directorName;
    private String directorPhone;
    private String servicePhone;
    private int agentId;
    private String longitude;
    private String latitude;
    private String overTimePrice;
    private String deposit;
    private int isDel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    private String androidScreenStartTime;
    private String androidScreenEndTime;
    private String linkName;
    private String linkPhone;
    private Integer deviceCount;
    private String companyName;

    public Hospital() {
    }

    public Hospital(int hospitalId, String hospitalName, String province, String city, String area, String address, String directorName, String directorPhone, String servicePhone, int agentId, String longitude, String latitude, String overTimePrice, String deposit, int isDel, Date cTime, String androidScreenStartTime, String androidScreenEndTime) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.directorName = directorName;
        this.directorPhone = directorPhone;
        this.servicePhone = servicePhone;
        this.agentId = agentId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.overTimePrice = overTimePrice;
        this.deposit = deposit;
        this.isDel = isDel;
        this.cTime = cTime;
        this.androidScreenStartTime = androidScreenStartTime;
        this.androidScreenEndTime = androidScreenEndTime;
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

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorPhone() {
        return directorPhone;
    }

    public void setDirectorPhone(String directorPhone) {
        this.directorPhone = directorPhone;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getOverTimePrice() {
        return overTimePrice;
    }

    public void setOverTimePrice(String overTimePrice) {
        this.overTimePrice = overTimePrice;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public String getAndroidScreenStartTime() {
        return androidScreenStartTime;
    }

    public void setAndroidScreenStartTime(String androidScreenStartTime) {
        this.androidScreenStartTime = androidScreenStartTime;
    }

    public String getAndroidScreenEndTime() {
        return androidScreenEndTime;
    }

    public void setAndroidScreenEndTime(String androidScreenEndTime) {
        this.androidScreenEndTime = androidScreenEndTime;
    }
}
