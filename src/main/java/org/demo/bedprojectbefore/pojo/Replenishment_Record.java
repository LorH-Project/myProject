package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Author:LiaoZhen
 * Date:  2021/4/2/13:54
 */
public class Replenishment_Record {
    private int replenishmentId;
    private int goodsId;
    private int hospitalId;
    private String deviceNumber;
    private String cabinetNumber;
    private String realName;
    private String userPhone;
    private int replenishmentType;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    //代理商名称
    private String companyName;
    //商品名称
    private String goodsName;
    //医院名称
    private String hospitalName;
    //商品规格
    private String goodsSpec;
    //厂家名称
    private String goodsManufactor;
    //注册文号
    private String goodsRegistration;

    public int getReplenishmentId() {
        return replenishmentId;
    }

    public void setReplenishmentId(int replenishmentId) {
        this.replenishmentId = replenishmentId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getReplenishmentType() {
        return replenishmentType;
    }

    public void setReplenishmentType(int replenishmentType) {
        this.replenishmentType = replenishmentType;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getGoodsManufactor() {
        return goodsManufactor;
    }

    public void setGoodsManufactor(String goodsManufactor) {
        this.goodsManufactor = goodsManufactor;
    }

    public String getGoodsRegistration() {
        return goodsRegistration;
    }

    public void setGoodsRegistration(String goodsRegistration) {
        this.goodsRegistration = goodsRegistration;
    }
}
