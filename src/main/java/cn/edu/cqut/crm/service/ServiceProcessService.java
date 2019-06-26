package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ServiceProcessMapper;
import cn.edu.cqut.crm.model.ServiceProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProcessService {
    @Autowired
    private ServiceProcessMapper processMapper;

    public List<ServiceProcess> getAllServiceProcess() {
        return processMapper.selectAll();
    }
}
