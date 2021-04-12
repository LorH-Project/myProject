package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.DecimalFormat;
import java.util.Date;

public class Finance_user {
    private int financeId;
    private int userId;
    private int orderId;
    private int outTradeNo;
    private DecimalFormat balance;
    private DecimalFormat fee;
    private int financeType;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;

    public Finance_user() {
    }

    public Finance_user(int financeId, int userId, int orderId, int outTradeNo, DecimalFormat balance, DecimalFormat fee, int financeType, Date cTime) {
        this.financeId = financeId;
        this.userId = userId;
        this.orderId = orderId;
        this.outTradeNo = outTradeNo;
        this.balance = balance;
        this.fee = fee;
        this.financeType = financeType;
        this.cTime = cTime;
    }

    public int getFinanceId() {
        return financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(int outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public DecimalFormat getBalance() {
        return balance;
    }

    public void setBalance(DecimalFormat balance) {
        this.balance = balance;
    }

    public DecimalFormat getFee() {
        return fee;
    }

    public void setFee(DecimalFormat fee) {
        this.fee = fee;
    }

    public int getFinanceType() {
        return financeType;
    }

    public void setFinanceType(int financeType) {
        this.financeType = financeType;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
