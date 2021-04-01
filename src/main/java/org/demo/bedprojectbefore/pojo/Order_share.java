package org.demo.bedprojectbefore.pojo;

import java.text.DecimalFormat;
import java.util.Date;

public class Order_share {
    private int orderId;
    private String orderNo;
    private String outTradeNo;
    private int userId;
    private int deviceId;
    private int hospitalId;
    private Date leaseStartTime;
    private Date leaseEndTime;
    private DecimalFormat amount;
    private int availableTime;
    private int useTime;
    private int overTime;
    private DecimalFormat overTimePrice;
    private DecimalFormat overTimeAmount;
    private Date cTime;
    private Date payTime;
    private int orderStatus;
    private String orderAddress;
    private DecimalFormat packagePrice;
    private Date openStartTime;
    private Date closeEndTime;
    private String openCabinetNumber;
    private String closeCabinetNumber;
    private int isFlag;
    private int isDel;

    public Order_share() {
    }

    public Order_share(int orderId, String orderNo, String outTradeNo, int userId, int deviceId, int hospitalId, Date leaseStartTime, Date leaseEndTime, DecimalFormat amount, int availableTime, int useTime, int overTime, DecimalFormat overTimePrice, DecimalFormat overTimeAmount, Date cTime, Date payTime, int orderStatus, String orderAddress, DecimalFormat packagePrice, Date openStartTime, Date closeEndTime, String openCabinetNumber, String closeCabinetNumber, int isFlag, int isDel) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.outTradeNo = outTradeNo;
        this.userId = userId;
        this.deviceId = deviceId;
        this.hospitalId = hospitalId;
        this.leaseStartTime = leaseStartTime;
        this.leaseEndTime = leaseEndTime;
        this.amount = amount;
        this.availableTime = availableTime;
        this.useTime = useTime;
        this.overTime = overTime;
        this.overTimePrice = overTimePrice;
        this.overTimeAmount = overTimeAmount;
        this.cTime = cTime;
        this.payTime = payTime;
        this.orderStatus = orderStatus;
        this.orderAddress = orderAddress;
        this.packagePrice = packagePrice;
        this.openStartTime = openStartTime;
        this.closeEndTime = closeEndTime;
        this.openCabinetNumber = openCabinetNumber;
        this.closeCabinetNumber = closeCabinetNumber;
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

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Date getLeaseStartTime() {
        return leaseStartTime;
    }

    public void setLeaseStartTime(Date leaseStartTime) {
        this.leaseStartTime = leaseStartTime;
    }

    public Date getLeaseEndTime() {
        return leaseEndTime;
    }

    public void setLeaseEndTime(Date leaseEndTime) {
        this.leaseEndTime = leaseEndTime;
    }

    public DecimalFormat getAmount() {
        return amount;
    }

    public void setAmount(DecimalFormat amount) {
        this.amount = amount;
    }

    public int getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }

    public int getUseTime() {
        return useTime;
    }

    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public DecimalFormat getOverTimePrice() {
        return overTimePrice;
    }

    public void setOverTimePrice(DecimalFormat overTimePrice) {
        this.overTimePrice = overTimePrice;
    }

    public DecimalFormat getOverTimeAmount() {
        return overTimeAmount;
    }

    public void setOverTimeAmount(DecimalFormat overTimeAmount) {
        this.overTimeAmount = overTimeAmount;
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

    public DecimalFormat getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(DecimalFormat packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Date getOpenStartTime() {
        return openStartTime;
    }

    public void setOpenStartTime(Date openStartTime) {
        this.openStartTime = openStartTime;
    }

    public Date getCloseEndTime() {
        return closeEndTime;
    }

    public void setCloseEndTime(Date closeEndTime) {
        this.closeEndTime = closeEndTime;
    }

    public String getOpenCabinetNumber() {
        return openCabinetNumber;
    }

    public void setOpenCabinetNumber(String openCabinetNumber) {
        this.openCabinetNumber = openCabinetNumber;
    }

    public String getCloseCabinetNumber() {
        return closeCabinetNumber;
    }

    public void setCloseCabinetNumber(String closeCabinetNumber) {
        this.closeCabinetNumber = closeCabinetNumber;
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
