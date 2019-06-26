package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ServiceProcess {
    @JSONField(name = "processId")
    private Integer processId;

    @JSONField(name = "serviceId")
    private Integer serviceId;

    @JSONField(name = "handlerId")
    private Integer handlerId;

    @JSONField(name = "handlerName")
    private String handlerName;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "handTime")
    private Date handTime;

    @JSONField(name = "handMethod")
    private String handMethod;

    @JSONField(name = "handResult")
    private String handResult;

    @JSONField(name = "customerSatisfaction")
    private String customerSatisfaction;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getHandTime() {
        return handTime;
    }

    public void setHandTime(Date handTime) {
        this.handTime = handTime;
    }

    public String getHandMethod() {
        return handMethod;
    }

    public void setHandMethod(String handMethod) {
        this.handMethod = handMethod;
    }

    public String getHandResult() {
        return handResult;
    }

    public void setHandResult(String handResult) {
        this.handResult = handResult;
    }

    public String getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    public void setCustomerSatisfaction(String customerSatisfaction) {
        this.customerSatisfaction = customerSatisfaction;
    }

    @Override
    public String toString() {
        return "ServiceProcess{" +
                "processId=" + processId +
                ", serviceId=" + serviceId +
                ", handlerId=" + handlerId +
                ", handlerName='" + handlerName + '\'' +
                ", customerId=" + customerId +
                ", handTime=" + handTime +
                ", handMethod='" + handMethod + '\'' +
                ", handResult='" + handResult + '\'' +
                ", customerSatisfaction='" + customerSatisfaction + '\'' +
                '}';
    }
}
