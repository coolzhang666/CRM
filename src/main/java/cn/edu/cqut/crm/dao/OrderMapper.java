package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Order;
import cn.edu.cqut.crm.model.OrderStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<OrderStatistics> selectAll();

    List<OrderStatistics> selectYear16();

    List<OrderStatistics> selectYear17();

    List<OrderStatistics> selectYear18();

    List<OrderStatistics> selectYear19();
}
