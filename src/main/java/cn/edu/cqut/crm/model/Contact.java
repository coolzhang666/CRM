package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

public class Contact {
    @JSONField(name = "contactId")
    private Integer contactId;

    @JSONField(name = "customerId")
    private Integer customerId;

    @JSONField(name = "contactName")
    private String contactName;

    @JSONField(name = "contactGender")
    private String contactGender;

    @JSONField(name = "contactPhone")
    private String contactPhone;

    @JSONField(name = "contactJob")
    private String contactJob;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactGender() {
        return contactGender;
    }

    public void setContactGender(String contactGender) {
        this.contactGender = contactGender;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactJob() {
        return contactJob;
    }

    public void setContactJob(String contactJob) {
        this.contactJob = contactJob;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", customerId=" + customerId +
                ", contactName='" + contactName + '\'' +
                ", contactGender='" + contactGender + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactJob='" + contactJob + '\'' +
                '}';
    }
}
