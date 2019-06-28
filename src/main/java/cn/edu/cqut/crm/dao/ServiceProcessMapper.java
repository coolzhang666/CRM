package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.ServiceProcess;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ServiceProcessMapper {

    List<ServiceProcess> selectAll();

    void addServiceProcess(int serviceId, int handlerId, String handlerName, int customerId, Date handTime, String handMethod,String handResult,String customerSatisfaction);

    void deleteService(int serviceId);

    void changServiceProcess(int serviceId, String customerSatisfaction, String handResult);
}
