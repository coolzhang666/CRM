package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class DelayRecord {
    @JSONField(name = "delayId")
    private Integer delayId;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "delayMethod")
    private String delayMethod;

    @JSONField(name = "creatorId")
    private Integer creatorId;

    @JSONField(name = "creatorName")
    private String creatorName;

    @JSONField(name = "createTime")
    private Date createTime;

    public Integer getDelayId() {
        return delayId;
    }

    public void setDelayId(Integer delayId) {
        this.delayId = delayId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDelayMethod() {
        return delayMethod;
    }

    public void setDelayMethod(String delayMethod) {
        this.delayMethod = delayMethod;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DelayRecord{" +
                "delayId=" + delayId +
                ", customerId=" + customerId +
                ", delayMethod='" + delayMethod + '\'' +
                ", creatorId=" + creatorId +
                ", creatorName='" + creatorName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
