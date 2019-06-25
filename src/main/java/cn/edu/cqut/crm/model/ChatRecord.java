package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ChatRecord {
    @JSONField(name = "chatId")
    private Integer chatId;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "customerName")
    private String customerName;

    @JSONField(name = "handlerId")
    private Integer handlerId;

    @JSONField(name = "handlerName")
    private String handlerName;

    @JSONField(name = "shortDescription")
    private String shortDescription;

    @JSONField(name = "longDescription")
    private String longDescription;

    @JSONField(name = "createTime")
    private Date createTime;

    @JSONField(name = "chatAddress")
    private String chatAddress;

    @JSONField(name = "moreInfo")
    private String moreInfo;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getChatAddress() {
        return chatAddress;
    }

    public void setChatAddress(String chatAddress) {
        this.chatAddress = chatAddress;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return "ChatRecord{" +
                "chatId=" + chatId +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", handlerId=" + handlerId +
                ", handlerName='" + handlerName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", createTime=" + createTime +
                ", chatAddress='" + chatAddress + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
