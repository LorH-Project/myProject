package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Goods {
    private int goodsId;
    private String goodsName;
    private String goodsPic;
    private String goodsSpec;
    private String goodsManufactor;
    private String goodsRegistration;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date uTime;
    private int isFlag;

    public Goods() {
    }

    public Goods(int goodsId, String goodsName, String goodsPic, String goodsSpec, String goodsManufactor, String goodsRegistration, Date cTime, Date uTime, int isFlag) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPic = goodsPic;
        this.goodsSpec = goodsSpec;
        this.goodsManufactor = goodsManufactor;
        this.goodsRegistration = goodsRegistration;
        this.cTime = cTime;
        this.uTime = uTime;
        this.isFlag = isFlag;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
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

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }
}
