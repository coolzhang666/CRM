package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.OrderMapper;
import cn.edu.cqut.crm.model.Order;
import cn.edu.cqut.crm.model.OrderStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<OrderStatistics> getAllOrder() {
        return orderMapper.selectAll();
    }

    public List<Order> getAllInfo(){ return orderMapper.selectAllInfo();}

    public Double getYear16Total() {
        return orderMapper.selectYear16Total();
    }
    public Double getYear17Total() {
        return orderMapper.selectYear17Total();
    }
    public Double getYear18Total() {
        return orderMapper.selectYear18Total();
    }
    public Double getYear19Total() {
        return orderMapper.selectYear19Total();
    }
}
