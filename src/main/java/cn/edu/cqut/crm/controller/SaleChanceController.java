package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.SaleChance;
import cn.edu.cqut.crm.service.SaleChanceService;
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
public class SaleChanceController {
    @Autowired
    private SaleChanceService saleChanceService;

    /**
     * 销售机会分页查询功能
     * @param page 当前页号
     * @param rows 页面容量
     * @return 返回销售机会列表
     */
    @RequestMapping(value = "/saleChance/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllSaleChance(@PathVariable() int page, @PathVariable() int rows) {
        PageHelper.startPage(page, rows);
        List<SaleChance> saleChances = saleChanceService.getAllSaleChance();
        PageInfo<SaleChance> pageInfo = new PageInfo<>(saleChances);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", saleChances, total);
    }
}
