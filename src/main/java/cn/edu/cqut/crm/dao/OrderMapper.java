package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<Order> selectAll();
}
