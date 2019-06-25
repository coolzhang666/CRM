package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.DevelopPlanMapper;
import cn.edu.cqut.crm.model.DevelopPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DevelopPlanService {
    @Autowired
    private DevelopPlanMapper developPlanMapper;

    /**
     * 查询所有的开发计划
     * @return 返回开发计划列表
     */
    public List<DevelopPlan> getAllDevelopPlan() {
        return developPlanMapper.selectAll();
    }

    /**
     * 根据销售机会查询开发计划
     * @param chanceId 销售计划id
     * @return 返回开发计划列表
     */
    public List<DevelopPlan> getDevelopPlanByChanceId(Integer chanceId) {
        return developPlanMapper.selectByChanceId(chanceId);
    }

    /**
     * 新增开发计划
     * @param developPlan 开发计划对象
     * @return 返回受影响的行数
     */
    public Integer addDevelopPlan(DevelopPlan developPlan) {
        developPlan.setCreateTime(new Date());
        developPlan.setPlanStatus("未执行");
        return developPlanMapper.insert(developPlan);
    }

    /**
     * 根据开发计划id删除开发计划
     * @param planId 开发计划id
     * @return 返回受影响的行数
     */
    public Integer deleteById(Integer planId) {
        return developPlanMapper.deleteById(planId);
    }
}
