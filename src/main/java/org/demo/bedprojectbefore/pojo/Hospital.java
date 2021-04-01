package org.demo.bedprojectbefore.pojo;

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
    private DecimalFormat longitude;
    private DecimalFormat latitude;
    private DecimalFormat overTimePrice;
    private DecimalFormat deposit;
    private int isDel;
    private Date cTime;
    private String androidScreenStartTime;
    private String androidScreenEndTime;

    public Hospital() {
    }

    public Hospital(int hospitalId, String hospitalName, String province, String city, String area, String address, String directorName, String directorPhone, String servicePhone, int agentId, DecimalFormat longitude, DecimalFormat latitude, DecimalFormat overTimePrice, DecimalFormat deposit, int isDel, Date cTime, String androidScreenStartTime, String androidScreenEndTime) {
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

    public DecimalFormat getLongitude() {
        return longitude;
    }

    public void setLongitude(DecimalFormat longitude) {
        this.longitude = longitude;
    }

    public DecimalFormat getLatitude() {
        return latitude;
    }

    public void setLatitude(DecimalFormat latitude) {
        this.latitude = latitude;
    }

    public DecimalFormat getOverTimePrice() {
        return overTimePrice;
    }

    public void setOverTimePrice(DecimalFormat overTimePrice) {
        this.overTimePrice = overTimePrice;
    }

    public DecimalFormat getDeposit() {
        return deposit;
    }

    public void setDeposit(DecimalFormat deposit) {
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
