package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.OrderMapper;
import cn.edu.cqut.crm.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getAllOrder() {
        return orderMapper.selectAll();
    }
}
