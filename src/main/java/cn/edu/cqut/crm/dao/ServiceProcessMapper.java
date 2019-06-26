package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.ServiceProcess;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceProcessMapper {

    List<ServiceProcess> selectAll();
}
