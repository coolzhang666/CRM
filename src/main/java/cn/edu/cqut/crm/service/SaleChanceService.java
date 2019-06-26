package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.SaleChanceMapper;
import cn.edu.cqut.crm.model.Contact;
import cn.edu.cqut.crm.model.Customer;
import cn.edu.cqut.crm.model.SaleChance;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SaleChanceService {
    @Autowired
    private SaleChanceMapper saleChanceMapper;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ContactService contactService;

    public void addSaleChance(SaleChance saleChance) {
        saleChance.setCreateTime(new Date());
//        System.out.println(saleChance.getChanceStatus());
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


    public void addSendPerson(SaleChance saleChance) {
        System.out.println(saleChance.getChanceStatus());
        saleChance.setChanceStatus("已分配");
        saleChance.setDispatchTime(new Date());
        saleChanceMapper.updateSend(saleChance);
    }

    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> developSuccess(SaleChance saleChance) {
        HashMap<String, Object> map = new HashMap<>();
        // 1. 创建新客户
        Customer customer = new Customer();
        customer.setCustomerName(saleChance.getCustomerName());
        customer.setCustomerPhone(saleChance.getCustomerPhone());
        Customer customer1 = customerService.insertByName(customer);
        map.put("customer", customer1);
        // 2. 创建客户联系人
        Contact contact = new Contact();
        contact.setCustomerId(customer1.getCustomerId());
        contact.setContactName(saleChance.getContactName());
        contact.setContactPhone(saleChance.getContactPhone());
        Contact contact1 = contactService.insertByName(contact);
        map.put("contact", contact1);
        // 3. 修改销售机会状态
        saleChance.setChanceStatus("开发成功");
        saleChanceMapper.update(saleChance);
        return map;
    }

    public Integer developFailed(SaleChance saleChance) {
        saleChance.setChanceStatus("开发失败");
        saleChanceMapper.update(saleChance);

        return 0;
    }
}
