package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ServiceStatisticsMapper;
import cn.edu.cqut.crm.model.ServiceStatistics;
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

    public Map<String,List<String>> getServiceType() {
        List<ServiceStatistics> list = serviceStatisticsMapper.getServiceType();
        List<String> countlist = new ArrayList<>();
        List<String> typelist = new ArrayList<>();
        for(ServiceStatistics service:list) {
            countlist.add(service.getCountService());
            typelist.add(service.getServiceType());
        }
        Map<String ,List<String>> map = new HashMap<>();
        map.put("count",countlist);
        map.put("type",typelist);

        return map;
    }
}
