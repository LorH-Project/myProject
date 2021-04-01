package org.demo.bedprojectbefore.pojo;

import java.text.DecimalFormat;
import java.util.Date;

public class Finance {
    private int financeId;
    private int userFinanceId;
    private int orderId;
    private int outTradeNo;
    private DecimalFormat balance;
    private DecimalFormat fee;
    private int type;
    private Date cTime;

    public Finance() {
    }

    public Finance(int financeId, int userFinanceId, int orderId, int outTradeNo, DecimalFormat balance, DecimalFormat fee, int type, Date cTime) {
        this.financeId = financeId;
        this.userFinanceId = userFinanceId;
        this.orderId = orderId;
        this.outTradeNo = outTradeNo;
        this.balance = balance;
        this.fee = fee;
        this.type = type;
        this.cTime = cTime;
    }

    public int getFinanceId() {
        return financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }

    public int getUserFinanceId() {
        return userFinanceId;
    }

    public void setUserFinanceId(int userFinanceId) {
        this.userFinanceId = userFinanceId;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
