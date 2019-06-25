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

    /**
     * 根据销售机会查询开发计划
     * @param chanceId 销售计划id
     * @return 返回开发计划列表
     */
    List<DevelopPlan> selectByChanceId(Integer chanceId);

    /**
     * 新增开发计划
     * @param developPlan 开发计划对象
     * @return 返回受影响的行数
     */
    Integer insert(DevelopPlan developPlan);

    /**
     * 根据开发计划id删除开发计划
     * @param planId 开发计划id
     * @return 返回受影响的行数
     */
    Integer deleteById(Integer planId);
}
