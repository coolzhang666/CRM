package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper {

    List<Service> selectAll();

    List<Service> getHandleService(int handlerId,String serviceStatus);

    void changeServiceStatus(String ServiceStatus,int serviceId);
}
