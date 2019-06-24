package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

public class Customer {
    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "customerNo")
    private String customerNo;

    @JSONField(name = "customerName")
    private String customerName;

    @JSONField(name = "customerAddress")
    private String customerAddress;

    @JSONField(name = "customerEmail")
    private String customerEmail;

    @JSONField(name = "customerRegion")
    private String customerRegion;

    @JSONField(name = "customerPhone")
    private String customerPhone;

    @JSONField(name = "customerCooperation")
    private String customerCooperation;

    @JSONField(name = "customerGrade")
    private String customerGrade;

    @JSONField(name = "customerCredit")
    private String customerCredit;

    @JSONField(name = "customerSatisfaction")
    private String customerSatisfaction;

    @JSONField(name = "customerStatus")
    private String customerStatus;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerRegion() {
        return customerRegion;
    }

    public void setCustomerRegion(String customerRegion) {
        this.customerRegion = customerRegion;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCooperation() {
        return customerCooperation;
    }

    public void setCustomerCooperation(String customerCooperation) {
        this.customerCooperation = customerCooperation;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(String customerCredit) {
        this.customerCredit = customerCredit;
    }

    public String getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    public void setCustomerSatisfaction(String customerSatisfaction) {
        this.customerSatisfaction = customerSatisfaction;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerNo='" + customerNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerRegion='" + customerRegion + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerCooperation='" + customerCooperation + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", customerCredit='" + customerCredit + '\'' +
                ", customerSatisfaction='" + customerSatisfaction + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                '}';
    }
}
