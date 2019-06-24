package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.DevelopPlan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevelopPlanMapper {
    /**
     * 查询所有的开发计划
     * @return 返回开发计划列表
     */
    List<DevelopPlan> selectAll();
}
