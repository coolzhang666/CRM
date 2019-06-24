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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 客户信息的分页查询功能
     * @param page 当前页号
     * @param rows 页面容量
     * @return 返回客户列表
     */
    @RequestMapping(value = "/customer/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllCustomer(@PathVariable() int page, @PathVariable int rows) {
        PageHelper.startPage(page, rows);
        List<Customer> customers = customerService.getAllCustomer();
        PageInfo<Customer> pageInfo = new PageInfo<>(customers);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", customers, total);
    }
}
