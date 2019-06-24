package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.Customer;
import cn.edu.cqut.crm.service.CustomerService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/{page}/{rows}")
    public ReturnObject<Object> getAllCustomer(@PathVariable() int page, @PathVariable int rows) {
        PageHelper.startPage(page, rows);
        List<Customer> customers = customerService.getAllCustomer();
        PageInfo<Customer> pageInfo = new PageInfo<>(customers);
        int total = (int) pageInfo.getTotal();
        return ReturnUtil.success("查询成功", customers, total);
    }
}
