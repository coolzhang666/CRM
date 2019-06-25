package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class SaleChance {
    @JSONField(name = "chanceId")
    private Integer chanceId;

    @JSONField(name = "customerName")
    private String customerName;

    @JSONField(name = "customerPhone")
    private String customerPhone;

    @JSONField(name = "contactName")
    private String contactName;

    @JSONField(name = "contactPhone")
    private String contactPhone;

    @JSONField(name = "chanceResource")
    private String chanceResource;

    @JSONField(name = "successRate")
    private Float successRate;

    @JSONField(name = "chanceDescription")
    private String chanceDescription;

    @JSONField(name = "creatorId")
    private String creatorId;

    @JSONField(name = "creatorName")
    private String creatorName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(name = "createTime")
    private Date createTime;

    @JSONField(name = "belong")
    private Integer belong;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(name = "dispatchTime")
    private Date dispatchTime;

    @JSONField(name = "chanceStatus")
    private String chanceStatus;

    public Integer getChanceId() {
        return chanceId;
    }

    public void setChanceId(Integer chanceId) {
        this.chanceId = chanceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getChanceResource() {
        return chanceResource;
    }

    public void setChanceResource(String chanceResource) {
        this.chanceResource = chanceResource;
    }

    public Float getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Float successRate) {
        this.successRate = successRate;
    }

    public String getChanceDescription() {
        return chanceDescription;
    }

    public void setChanceDescription(String chanceDescription) {
        this.chanceDescription = chanceDescription;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
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

    public String getChanceStatus() {
        return chanceStatus;
    }

    public void setChanceStatus(String chanceStatus) {
        this.chanceStatus = chanceStatus;
    }

    @Override
    public String toString() {
        return "SaleChance{" +
                "chanceId=" + chanceId +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", chanceResource='" + chanceResource + '\'' +
                ", successRate=" + successRate +
                ", chanceDescription='" + chanceDescription + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", creatorName='" + creatorName + '\'' +
                ", createTime=" + createTime +
                ", belong=" + belong +
                ", dispatchTime=" + dispatchTime +
                ", chanceStatus='" + chanceStatus + '\'' +
                '}';
    }
}
