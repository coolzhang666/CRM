package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Order;
import cn.edu.cqut.crm.model.OrderStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<OrderStatistics> selectAll();

    List<Order> selectAllInfo();

    Double selectYear16Total();

    Double selectYear17Total();

    Double selectYear18Total();

    Double selectYear19Total();
}
