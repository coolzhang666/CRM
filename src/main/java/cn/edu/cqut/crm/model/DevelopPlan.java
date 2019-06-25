package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DevelopPlan {
    @JSONField(name = "planId")
    private Integer planId;

    @JSONField(name = "chanceId")
    private Integer chanceId;

    @JSONField(name = "creatorId")
    private Integer creatorId;

    @JSONField(name = "creatorName")
    private String creatorName;

    @JSONField(name = "planContent")
    private String planContent;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JSONField(name = "createTime")
    private Date createTime;

    @JSONField(name = "planStatus")
    private String planStatus;

    @JSONField(name = "planResult")
    private String planResult;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getChanceId() {
        return chanceId;
    }

    public void setChanceId(Integer chanceId) {
        this.chanceId = chanceId;
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

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public String getPlanResult() {
        return planResult;
    }

    public void setPlanResult(String planResult) {
        this.planResult = planResult;
    }

    @Override
    public String toString() {
        return "DevelopPlan{" +
                "planId=" + planId +
                ", chanceId=" + chanceId +
                ", creatorId=" + creatorId +
                ", creatorName='" + creatorName + '\'' +
                ", planContent='" + planContent + '\'' +
                ", createTime=" + createTime +
                ", planStatus='" + planStatus + '\'' +
                ", planResult='" + planResult + '\'' +
                '}';
    }
}
