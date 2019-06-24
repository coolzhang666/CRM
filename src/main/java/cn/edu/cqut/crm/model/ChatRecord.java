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

    @JSONField(name = "dealId")
    private Integer dealId;

    @JSONField(name = "dealName")
    private String dealName;

    @JSONField(name = "shortDescription")
    private String shortDescription;

    @JSONField(name = "longDescription")
    private String longDescription;

    @JSONField(name = "createDate")
    private Date createDate;

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

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
                ", dealId=" + dealId +
                ", dealName='" + dealName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", createDate=" + createDate +
                ", chatAddress='" + chatAddress + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
