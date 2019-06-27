package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

public class ServiceStatistics {

    @JSONField(name = "serviceType")
    private String serviceType;

    @JSONField( name = "countService")
    private String countService;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCountService() {
        return countService;
    }

    public void setCountService(String countService) {
        this.countService = countService;
    }

    @Override
    public String toString() {
        return "ServiceStatistics{" +
                "serviceType='" + serviceType + '\'' +
                ", countService='" + countService + '\'' +
                '}';
    }
}
