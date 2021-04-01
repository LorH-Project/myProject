package org.demo.bedprojectbefore.pojo;

import java.text.DecimalFormat;
import java.util.Date;

public class Goods_order_share {
    private int orderId;
    private String orderNo;
    private String outTradeNo;
    private int userId;
    private int deviceId;
    private int goodsId;
    private int hospitalId;
    private DecimalFormat amount;
    private Date cTime;
    private Date payTime;
    private int orderStatus;
    private String orderAddress;
    private String openCabinetNumber;
    private int isFlag;
    private int isDel;

    public Goods_order_share() {
    }

    public Goods_order_share(int orderId, String orderNo, String outTradeNo, int userId, int deviceId, int goodsId, int hospitalId, DecimalFormat amount, Date cTime, Date payTime, int orderStatus, String orderAddress, String openCabinetNumber, int isFlag, int isDel) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.outTradeNo = outTradeNo;
        this.userId = userId;
        this.deviceId = deviceId;
        this.goodsId = goodsId;
        this.hospitalId = hospitalId;
        this.amount = amount;
        this.cTime = cTime;
        this.payTime = payTime;
        this.orderStatus = orderStatus;
        this.orderAddress = orderAddress;
        this.openCabinetNumber = openCabinetNumber;
        this.isFlag = isFlag;
        this.isDel = isDel;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public DecimalFormat getAmount() {
        return amount;
    }

    public void setAmount(DecimalFormat amount) {
        this.amount = amount;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOpenCabinetNumber() {
        return openCabinetNumber;
    }

    public void setOpenCabinetNumber(String openCabinetNumber) {
        this.openCabinetNumber = openCabinetNumber;
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
}
