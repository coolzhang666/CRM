package cn.edu.cqut.crm.service;

import java.util.List;

import cn.edu.cqut.crm.dao.ServiceMapper;
import cn.edu.cqut.crm.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceMapper serviceMapper;

    /**
     * 查看所有新创建服务单据
     * @return 服务单据
     */
    public List<Service> getAllService() {
        return serviceMapper.selectAll();
    }

    public List<Service> getStatus(String status) {
        return serviceMapper.selectStatus(status);
    }
    
    public void editService(Service service) {
        serviceMapper.updateBelong(service);
    }

    public List<Service> getHandleService(int handlerId) {
        String serviceStatus = "已分配";
       return serviceMapper.getHandleService(handlerId,serviceStatus);
    }
    
    public void insertService(Service service){
        serviceMapper.insert(service);
    }
}
