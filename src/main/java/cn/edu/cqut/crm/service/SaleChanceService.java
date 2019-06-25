package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.SaleChanceMapper;
import cn.edu.cqut.crm.model.SaleChance;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SaleChanceService {
    @Autowired
    private SaleChanceMapper saleChanceMapper;
    public void addSaleChance(SaleChance saleChance) {
        saleChance.setCreateTime(new Date());
        System.out.println(saleChance.getChanceStatus());
        if (saleChance.getChanceStatus().equals("已分配")) {
//            System.out.println("aaaa");
            saleChance.setDispatchTime(new Date());
        }else{
            Date date = null;
            saleChance.setDispatchTime(date);
        }
        saleChanceMapper.insert(saleChance);
    }
    /**
     * 查询所有的销售机会
     * @return 返回销售机会列表
     */
    public List<SaleChance> getAllSaleChance() {
        return saleChanceMapper.selectAll();
    }

    public void removeSaleChance(Integer chanceid) {
        saleChanceMapper.delete(chanceid);
    }

    public void changeSaleChance(SaleChance saleChance) {
        saleChanceMapper.update(saleChance);
    }
}
