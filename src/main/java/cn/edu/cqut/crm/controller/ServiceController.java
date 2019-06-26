package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.Service;
import cn.edu.cqut.crm.service.ServiceService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @RequestMapping(value = "/Service/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllSaleChance(@PathVariable() int page, @PathVariable() int rows) {
        System.out.println(page);
        PageHelper.startPage(page, rows);
        List<Service> service = serviceService.getAllService();
        PageInfo<Service> pageInfo = new PageInfo<>(service);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", service, total);
    }

    @RequestMapping(value = "/Service2/{page}/{rows}/", method = RequestMethod.GET)
    public ReturnObject<Object> getStatus(@PathVariable() int page, @PathVariable() int rows) {
        System.out.println(page);
        PageHelper.startPage(page, rows);
        List<Service> service = serviceService.getStatus();
        PageInfo<Service> pageInfo = new PageInfo<>(service);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", service, total);
    }
}
