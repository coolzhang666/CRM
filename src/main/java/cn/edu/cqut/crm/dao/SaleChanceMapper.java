package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.SaleChance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleChanceMapper {
    List<SaleChance> selectAll();
}
