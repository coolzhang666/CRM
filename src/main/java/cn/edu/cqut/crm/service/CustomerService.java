package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.CustomerMapper;
import cn.edu.cqut.crm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有的客户
     * @return 返回客户列表
     */
    public List<Customer> getAllCustomer() {
        return customerMapper.selectAll();
    }
}
