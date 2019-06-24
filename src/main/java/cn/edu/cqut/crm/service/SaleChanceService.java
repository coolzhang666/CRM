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

    public List<SaleChance> getAllSaleChance() {
        return saleChanceMapper.selectAll();
    }
}
