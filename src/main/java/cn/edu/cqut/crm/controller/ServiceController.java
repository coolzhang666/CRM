package cn.edu.cqut.crm.controller;


import cn.edu.cqut.crm.model.Service;
import cn.edu.cqut.crm.service.ServiceService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ServiceController {


    @Autowired
    private ServiceService serviceService;


    /**
     *
     * @param service 传入参数对应Service类的字段
     * @return 返回查询结果
     */
    @RequestMapping(value = "/service",method = RequestMethod.POST)
    private ReturnObject<Object> insertService(Service service){
        service.setCreateTime(new Date());
        serviceService.insertService(service);
        return ReturnUtil.success("新增成功",null);
    }



}
