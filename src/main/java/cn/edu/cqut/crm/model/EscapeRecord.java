package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class EscapeRecord {
    @JSONField(name = "escapeId")
    private Integer escapeId;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "escapeReason")
    private String escapeReason;

    @JSONField(name = "creatorId")
    private Integer creatorId;

    @JSONField(name = "creatorName")
    private String creatorName;

    @JSONField(name = "createTime")
    private Date createTime;

    public Integer getEscapeId() {
        return escapeId;
    }

    public void setEscapeId(Integer escapeId) {
        this.escapeId = escapeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEscapeReason() {
        return escapeReason;
    }

    public void setEscapeReason(String escapeReason) {
        this.escapeReason = escapeReason;
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
        return "EscapeRecord{" +
                "escapeId=" + escapeId +
                ", customerId=" + customerId +
                ", escapeReason='" + escapeReason + '\'' +
                ", creatorId=" + creatorId +
                ", creatorName='" + creatorName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
