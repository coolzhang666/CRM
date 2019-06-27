package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.ServiceStatistics;
import cn.edu.cqut.crm.service.ServiceStatisticsService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ServiceStatisticsController {

    @Autowired
    private ServiceStatisticsService serviceStatisticsService;

    @RequestMapping(value="/getServiceType",method = RequestMethod.GET)
    public ReturnObject<Object> getServiceType() {
        Map<String ,List<String>> map = serviceStatisticsService.getServiceType();

       return ReturnUtil.success(map);
    }

}
