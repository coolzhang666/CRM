package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.DevelopPlanMapper;
import cn.edu.cqut.crm.model.DevelopPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevelopPlanService {
    @Autowired
    private DevelopPlanMapper developPlanMapper;

    public List<DevelopPlan> getAllDevelopPlan() {
        return developPlanMapper.selectAll();
    }
}
