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

    /**
     * 删除指定用户
     * @param customer 删除用户的信息
     */
    public void deleteCustomer(Customer customer) {
        customerMapper.deleteCustomer(customer);
    }

    /**
     * 更新用户信息
     * @param customer 要更新用户的信息
     */
    public void updateCustomer(Customer customer) {
        customerMapper.updateCustomer(customer);
    }

    /**
     * 增加用户
     * @param customer 增加用户的信息
     */
    public void insertCustomer(Customer customer) {
        // 默认新增加用户状态为正常
        customer.setCustomerStatus("正常");
        customerMapper.insertCustomer(customer);
    }

    public Customer insertByName(Customer customer) {
        customerMapper.insertByName(customer);
        return customer;
    }
}
