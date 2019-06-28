package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ServiceStatisticsMapper;
import cn.edu.cqut.crm.model.ServiceStatistics;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceStatisticsService {
    @Autowired
    private ServiceStatisticsMapper serviceStatisticsMapper;


    public Map<String ,List<String>> getServiceType() {
        List<ServiceStatistics> list = serviceStatisticsMapper.getServiceType();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(ServiceStatistics serviceStatistics: list) {
            list1.add( serviceStatistics.getServiceType());
            list2.add(serviceStatistics.getCountService());
        }
        Map<String ,List<String>> map = new HashMap<>();
        map.put("type",list1);
        map.put("count",list2);
        return map;
    }

    public Map<String ,List<String>> getDateCount(String create_time) {
        List<ServiceStatistics> list = serviceStatisticsMapper.getDateCount(create_time);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(ServiceStatistics serviceStatistics: list) {
            list1.add( serviceStatistics.getServiceType());
            list2.add(serviceStatistics.getCountService());
        }
        Map<String ,List<String>> map = new HashMap<>();
        map.put("type",list1);
        map.put("count",list2);
        return map;
    }
}
