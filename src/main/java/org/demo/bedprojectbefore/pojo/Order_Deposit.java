package org.demo.bedprojectbefore.pojo;

public class Order_Deposit {

    private  int orderId;  /*订单编号*/
    private String outTradeNo;  /*支付流水号*/
    private int hospitalId;         /*医院id*/
    private int userId;         /*用户id*/
    private double amount;      /*支付金额*/
    private int status; /*押金订单状态*/
    private int isFlag;  /*1.有效2.无效*/
    private String cTime; /*创建时间*/
    private String nickName; /*用户名=users表*/
    private String address; //医院地址
    private String hospitalName; //医院名称
    private String userPhone; /*联系方式*/

    private String flagStr="";  /*订单状态1.退押金2.缴纳押金*/

    @Override
    public String toString() {
        return "Order_Deposit{" +
                "orderId=" + orderId +
                ", outTrandeNo='" + outTradeNo + '\'' +
                ", hospitalId=" + hospitalId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", status=" + status +
                ", isFlag=" + isFlag +
                ", cTime='" + cTime + '\'' +
                ", NickName='" + nickName + '\'' +
                ", address='" + address + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", flagStr='" + flagStr + '\'' +
                '}';
    }

    public String getFlagStr() {
        return flagStr;
    }

    public void setFlagStr(String flagStr) {
        this.flagStr = flagStr;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if(status==1){
            flagStr="缴纳押金";
        }else if(status==2){
            flagStr="退押金";

        }
        this.status = status;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {

        this.isFlag = isFlag;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }
}
