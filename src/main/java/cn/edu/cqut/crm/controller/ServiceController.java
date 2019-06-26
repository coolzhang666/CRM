package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.Service;
import cn.edu.cqut.crm.service.ServiceService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    /**
     * 服务单据的分页查询功能
     * @param page 当前页面
     * @param rows 页面容量
     * @return 服务单据
     */
    @RequestMapping(value = "/service/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllService(@PathVariable() int page, @PathVariable() int rows){
        PageHelper.startPage(page, rows);
        List<Service> services = serviceService.getAllService();
        PageInfo<Service> pageInfo = new PageInfo<>(services);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功",services,total);
    }

    /**
     * 增加指派人Id和指派时间，修改服务状态
     * @param service 服务管理实体类
     * @return 提示信息
     */
    @RequestMapping(value = "/service", method = RequestMethod.PUT)
    public ReturnObject<Object> editService(Service service){
        service.setDispatchTime(new Date());
        service.setServiceStatus("已分配");
        serviceService.editService(service);
        return ReturnUtil.success("指派成功",null);
    }

    @RequestMapping(value = "/listHandleService/{page}/{rows}/{handlerId}",method = RequestMethod.GET)
    public ReturnObject<Object> listHandleService (@PathVariable() int page, @PathVariable() int rows, @PathVariable() int handlerId) {
        PageHelper.startPage(page, rows);
        List<Service> services = serviceService.getHandleService(handlerId);
        PageInfo<Service> pageInfo = new PageInfo<>(services);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", services, total);
    }


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
