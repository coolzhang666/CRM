package cn.edu.cqut.crm.service;

import java.util.List;

import cn.edu.cqut.crm.dao.ServiceMapper;
import cn.edu.cqut.crm.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceMapper serviceMapper;

    public List<Service> getAllService() {
        return serviceMapper.selectAll();
    }

    public List<Service> getHandleService(int handlerId) {
        String serviceStatus = "已分配";
       return serviceMapper.getHandleService(handlerId,serviceStatus);
    }
}
