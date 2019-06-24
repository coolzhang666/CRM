package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    /**
     * 查询所有的客户
     * @return 返回客户列表
     */
    List<Customer> selectAll();
}
