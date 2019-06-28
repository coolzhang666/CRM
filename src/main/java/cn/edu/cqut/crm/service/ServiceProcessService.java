package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ServiceMapper;
import cn.edu.cqut.crm.dao.ServiceProcessMapper;
import cn.edu.cqut.crm.model.ServiceProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ServiceProcessService {
    @Autowired
    private ServiceProcessMapper processMapper;

    @Autowired
    private ServiceMapper serviceMapper;

    public List<ServiceProcess> getAllServiceProcess() {
        return processMapper.selectAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void addServiceProcess(int serviceId, int handlerId, String handlerName, int customerId,String handMethod,String handResult,String customerSatisfaction) {
        String ServiceStatus = "已处理";
        serviceMapper.changeServiceStatus( ServiceStatus,serviceId);
        processMapper.addServiceProcess(serviceId,handlerId,handlerName,customerId,new Date(),handMethod,handResult,customerSatisfaction);
    }

    @Transactional(rollbackFor = Exception.class)
    public void feedBackService(int serviceId, String customerSatisfaction, String handResult) {
        if(Integer.parseInt(customerSatisfaction) > 3) {
            serviceMapper.changeServiceStatus("已归档",serviceId);
            processMapper.changServiceProcess(serviceId,customerSatisfaction,handResult);
        }
        else {
            processMapper.deleteService(serviceId);
            serviceMapper.changeServiceStatus("已分配",serviceId);
        }
    }
}
