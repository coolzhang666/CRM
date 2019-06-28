package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.service.ServiceProcessService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProcessController {
    @Autowired
    private ServiceProcessService serviceProcessService;

    @RequestMapping(value="/addServiceProcess/{serviceId}/{handlerId}/{handlerName}/{customerId}/{handMethod}/{handResult}/{customerSatisfaction}",
            method = RequestMethod.POST)
    public ReturnObject<Object> addServiceProcess(@PathVariable() int serviceId, @PathVariable() int handlerId,
     @PathVariable()  String handlerName,@PathVariable()  int customerId,@PathVariable()  String handMethod,
            @PathVariable() String handResult, @PathVariable() String customerSatisfaction) {
        System.out.println(serviceId+" "+handlerId+" "+handlerName+" "+customerId+" "+handMethod+" "+handResult+" "+customerSatisfaction);
        serviceProcessService.addServiceProcess(serviceId,handlerId,handlerName,customerId,handMethod,handResult,customerSatisfaction);
        return ReturnUtil.success("处理成功",null);
    }

    @RequestMapping(value = "feedBackService/{serviceId}/{customerSatisfaction}/{handResult}",method = RequestMethod.PUT)
    public ReturnObject<Object> feedBackService(@PathVariable() int serviceId,
                                                @PathVariable()String customerSatisfaction,@PathVariable() String handResult) {
        serviceProcessService.feedBackService(serviceId,customerSatisfaction,handResult);
        return  ReturnUtil.success("反馈成功",null);
    }
}
