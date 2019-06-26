package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Service {
    @JSONField(name = "serviceId")
    private Integer serviceId;

    @JSONField(name = "serviceType")
    private String serviceType;

    @JSONField(name = "creatorId")
    private Integer creatorId;

    @JSONField(name = "creatorName")
    private String creatorName;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "customerName")
    private String customerName;

    @JSONField(name = "createTime")
    private Date createTime;

    @JSONField(name = "belong")
    private Integer belong;

    @JSONField(name = "dispatchTime")
    private Date dispatchTime;

    @JSONField(name = "serviceStatus")
    private String serviceStatus;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceType='" + serviceType + '\'' +
                ", creatorId=" + creatorId +
                ", creatorName='" + creatorName + '\'' +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", createTime=" + createTime +
                ", belong=" + belong +
                ", dispatchTime=" + dispatchTime +
                ", serviceStatus='" + serviceStatus + '\'' +
                '}';
    }
}
