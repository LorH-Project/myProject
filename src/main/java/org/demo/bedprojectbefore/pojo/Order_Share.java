package org.demo.bedprojectbefore.pojo;

public class Order_Share {

    private int orderId;  /*消费订单主键*/
    private String orderNo; /*业务编号*/
    private String outTradeNo;/*支付流水号*/
    private int userId; /*用户主键*/
    private int deviceId;/*设备主键*/
    private int hospitalId;/*医院主键*/

    private String leaseStartTime;/*租用开始时间*/
    private String leaseEndTime;/*租用结束时间*/

    private double amount;/*支付费用*/
    private int availableTime;  /*可用时长 单位ms*/
    private int useTime; /*使用时长 单位ms*/
    private int overTime; /*超时时长 单位ms*/
    private double overTimePrice;/*每小时超时收费标准*/
    private String overTimeAmount; /*超时费用*/
    private String cTime;  /*创建时间*/
    private String payTime;/*支付时间*/
    private int orderStatus;/*1.待支付 2.进行中 3.已完成 4.已退款 订单状态*/
    private String orderAddress;/*下单地址(设备地址)*/
    private double packagePrice;/*套餐单价*/

/*    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")*/
    private String openStartTime;/*时间段开始时间*/
/*    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")*/
    private String closeEndTime; /*时间段结束时间*/
    private String openCabinetNumber; /*取床格子号*/
    private String closeCabinetNumber; /*还床格子号*/
    private int isFlag;/*1.无效 2.有效*/
    private int isDel; /*1.未删除 2.已删除*/

    private String nickName;   /*用户姓名*/
    private String userPhone;  /*用户号码*/
    private String deviceNumber; /*设备编号*/
    private String deviceAddress; /*设备地址*/
    private String companyName; //设备公司名称

    private String orStatus; /*订单状态转换*/
    private String boverTime;  /*是否超时转换*/



    public String getOpenStartTime() {
        return openStartTime;
    }

    public void setOpenStartTime(String openStartTime) {
        this.openStartTime = openStartTime;
    }

    public String getCloseEndTime() {
        return closeEndTime;
    }

    public void setCloseEndTime(String closeEndTime) {
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

    public String getBoverTime() {
        return boverTime;
    }

    public void setBoverTime(String boverTime) {
        this.boverTime = boverTime;
    }


    public String getOrStatus() {
        return orStatus;
    }

    public void setOrStatus(String orStatus) {
        this.orStatus = orStatus;
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

    public String getLeaseStartTime() {
        return leaseStartTime;
    }

    public void setLeaseStartTime(String leaseStartTime) {
        this.leaseStartTime = leaseStartTime;
    }

    public String getLeaseEndTime() {
        return leaseEndTime;
    }

    public void setLeaseEndTime(String leaseEndTime) {
        this.leaseEndTime = leaseEndTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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
        if(overTime>0){
            boverTime="已超时";
        }else if(overTime==0){
            boverTime="未超时";
        }
        this.overTime = overTime;
    }

    public double getOverTimePrice() {
        return overTimePrice;
    }

    public void setOverTimePrice(double overTimePrice) {
        this.overTimePrice = overTimePrice;
    }

    public String getOverTimeAmount() {
        return overTimeAmount;
    }

    public void setOverTimeAmount(String overTimeAmount) {
        this.overTimeAmount = overTimeAmount;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        if(orderStatus==1){
            orStatus="待支付";
        }else if(orderStatus==2){
            orStatus="进行中";
        }
        else if(orderStatus==3){
            orStatus="已完成";
        }
        else if(orderStatus==4){
            orStatus="已退款";
        }
        this.orderStatus = orderStatus;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
