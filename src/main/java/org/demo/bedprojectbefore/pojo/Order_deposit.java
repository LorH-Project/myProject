package org.demo.bedprojectbefore.pojo;

import java.text.DecimalFormat;

public class Order_deposit {
    private int orderId;
    private String outTradeNo;
    private int hospitalId;
    private int userId;
    private DecimalFormat amount;
    private int status;
    private int isFlag;
    private int cTime;

    public Order_deposit() {
    }

    public Order_deposit(int orderId, String outTradeNo, int hospitalId, int userId, DecimalFormat amount, int status, int isFlag, int cTime) {
        this.orderId = orderId;
        this.outTradeNo = outTradeNo;
        this.hospitalId = hospitalId;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
        this.isFlag = isFlag;
        this.cTime = cTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public DecimalFormat getAmount() {
        return amount;
    }

    public void setAmount(DecimalFormat amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }

    public int getcTime() {
        return cTime;
    }

    public void setcTime(int cTime) {
        this.cTime = cTime;
    }
}
