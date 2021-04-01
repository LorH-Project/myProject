package org.demo.bedprojectbefore.pojo;

import java.text.DecimalFormat;

public class Device_goods_cabinet {
    private int cabinetId;
    private int deviceId;
    private int goodsId;
    private DecimalFormat goodsPrice;
    private int cabinetNumber;
    private int lockNumber;
    private int isStock;
    private int isFault;
    private int isFlag;

    public Device_goods_cabinet() {
    }

    public Device_goods_cabinet(int cabinetId, int deviceId, int goodsId, DecimalFormat goodsPrice, int cabinetNumber, int lockNumber, int isStock, int isFault, int isFlag) {
        this.cabinetId = cabinetId;
        this.deviceId = deviceId;
        this.goodsId = goodsId;
        this.goodsPrice = goodsPrice;
        this.cabinetNumber = cabinetNumber;
        this.lockNumber = lockNumber;
        this.isStock = isStock;
        this.isFault = isFault;
        this.isFlag = isFlag;
    }

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

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public DecimalFormat getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(DecimalFormat goodsPrice) {
        this.goodsPrice = goodsPrice;
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

    public int getIsStock() {
        return isStock;
    }

    public void setIsStock(int isStock) {
        this.isStock = isStock;
    }

    public int getIsFault() {
        return isFault;
    }

    public void setIsFault(int isFault) {
        this.isFault = isFault;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }
}
