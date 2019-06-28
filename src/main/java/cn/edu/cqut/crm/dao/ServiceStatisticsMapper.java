package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.ServiceStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceStatisticsMapper {
    List<ServiceStatistics> getServiceType();

    List<ServiceStatistics> getDateCount(String create_time);
}
