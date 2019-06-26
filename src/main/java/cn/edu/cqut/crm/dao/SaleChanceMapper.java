package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.SaleChance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleChanceMapper {
    /**
     * 查询所有的销售机会
     * @return 返回销售机会列表
     */
    List<SaleChance> selectAll();

    void insert(SaleChance saleChance);

    void delete(Integer chanceid);

    void update(SaleChance saleChance);

    void updateSend(SaleChance saleChance);
}
