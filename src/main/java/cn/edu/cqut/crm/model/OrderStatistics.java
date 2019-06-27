package cn.edu.cqut.crm.model;

import com.alibaba.fastjson.annotation.JSONField;

public class OrderStatistics {
    @JSONField(name = "statisticsCustomerName")
    private String statisticsCustomerName;

    @JSONField(name = "statisticsTotalPrice")
    private Double statisticsTotalPrice;

    public String getStatisticsCustomerName() {
        return statisticsCustomerName;
    }

    public void setStatisticsCustomerName(String statisticsCustomerName) {
        this.statisticsCustomerName = statisticsCustomerName;
    }

    public Double getStatisticsTotalPrice() {
        return statisticsTotalPrice;
    }

    public void setStatisticsTotalPrice(Double statisticsTotalPrice) {
        this.statisticsTotalPrice = statisticsTotalPrice;
    }

    @Override
    public String toString() {
        return "OrderStatistics{" +
                "statisticsCustomerName='" + statisticsCustomerName + '\'' +
                ", statisticsTotalPrice=" + statisticsTotalPrice +
                '}';
    }
}
