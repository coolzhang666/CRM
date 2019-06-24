package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.SaleChanceMapper;
import cn.edu.cqut.crm.model.SaleChance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleChanceService {
    @Autowired
    private SaleChanceMapper saleChanceMapper;

    /**
     * 查询所有的销售机会
     * @return 返回销售机会列表
     */
    public List<SaleChance> getAllSaleChance() {
        return saleChanceMapper.selectAll();
    }
}
