package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoseCount {


    @JSONField(name = "totalNum")
    private int totalNum;

    @JSONField(name = "type")
    private String type;

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoseCount{" +
                "totalNum=" + totalNum +
                ", type='" + type + '\'' +
                '}';
    }
}
