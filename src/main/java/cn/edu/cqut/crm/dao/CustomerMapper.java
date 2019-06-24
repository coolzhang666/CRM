package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    List<Customer> selectAll();
}
