package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.ServiceStatistics;
import cn.edu.cqut.crm.service.ServiceStatisticsService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ServiceStatisticsController {

    @Autowired
    private ServiceStatisticsService serviceStatisticsService;




    @RequestMapping(value = "/getServiceCount",method = RequestMethod.GET)
    public ReturnObject<Object> getServiceType() {
        System.out.println("ewewe");
        Map<String ,List<String>> map = serviceStatisticsService.getServiceType();
        System.out.println(map);
       return ReturnUtil.success(map);
    }

    @RequestMapping(value = "/getDateCount/{create_time}",method = RequestMethod.GET)
    public ReturnObject<Object> getDateCounts(@PathVariable() String create_time) {
        Map<String ,List<String>> map = serviceStatisticsService.getDateCount(create_time);
        System.out.println(map);
        return ReturnUtil.success(map);
    }



}
