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

    public List<OrderStatistics> getYear16(){ return orderMapper.selectYear16();}

    public List<OrderStatistics> getYear17(){ return orderMapper.selectYear17();}

    public List<OrderStatistics> getYear18(){ return orderMapper.selectYear18();}

    public List<OrderStatistics> getYear19(){ return orderMapper.selectYear19();}
}
