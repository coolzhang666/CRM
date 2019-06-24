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

    public List<Customer> getAllCustomer() {
        return customerMapper.selectAll();
    }
}
