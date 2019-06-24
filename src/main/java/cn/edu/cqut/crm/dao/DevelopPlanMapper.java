package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.DevelopPlan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevelopPlanMapper {
    List<DevelopPlan> selectAll();
}
