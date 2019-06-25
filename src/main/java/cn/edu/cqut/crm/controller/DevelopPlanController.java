package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.DevelopPlan;
import cn.edu.cqut.crm.service.DevelopPlanService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DevelopPlanController {
    @Autowired
    private DevelopPlanService developPlanService;

    @RequestMapping(value = "/developPlan/{chanceId}/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getDevelopPlanByChanceId(@PathVariable() Integer chanceId, @PathVariable() Integer page, @PathVariable Integer rows) {
        PageHelper.startPage(page, rows);
        List<DevelopPlan> developPlans = developPlanService.getDevelopPlanByChanceId(chanceId);
        PageInfo<DevelopPlan> pageInfo = new PageInfo<>(developPlans);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", developPlans, total);
    }

    @RequestMapping(value = "/developPlan", method = RequestMethod.POST)
    public ReturnObject<Object> addDevelopPlan(DevelopPlan developPlan) {
        developPlanService.addDevelopPlan(developPlan);
        return ReturnUtil.success("添加成功", null);
    }

    @RequestMapping(value = "/developPlan/{planId}", method = RequestMethod.DELETE)
    public ReturnObject<Object> deleteById(@PathVariable() Integer planId) {
        developPlanService.deleteById(planId);
        return ReturnUtil.success("删除成功", null);
    }

    @RequestMapping(value = "/developPlan", method = RequestMethod.PUT)
    public ReturnObject<Object> updateDevelopPlan(DevelopPlan developPlan) {
        developPlanService.updateDevelopPlan(developPlan);
        return ReturnUtil.success("更新成功", null);
    }
}
