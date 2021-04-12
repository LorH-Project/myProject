package org.demo.bedprojectbefore.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.DecimalFormat;
import java.util.Date;

public class Finance_manager {
    private int financeId;
    private int userFinanceId;
    private int agentId;
    private int orderId;
    private String outTradeNo;
    private DecimalFormat balance;
    private DecimalFormat fee;
    private int financeType;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cTime;

    public Finance_manager() {
    }

    public Finance_manager(int financeId, int userFinanceId, int agentId, int orderId, String outTradeNo, DecimalFormat balance, DecimalFormat fee, int financeType, Date cTime) {
        this.financeId = financeId;
        this.userFinanceId = userFinanceId;
        this.agentId = agentId;
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

    public int getUserFinanceId() {
        return userFinanceId;
    }

    public void setUserFinanceId(int userFinanceId) {
        this.userFinanceId = userFinanceId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
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
