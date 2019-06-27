package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.EscapeRecordMapper;
import cn.edu.cqut.crm.model.Customer;
import cn.edu.cqut.crm.model.DelayRecord;
import cn.edu.cqut.crm.model.EscapeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class EscapeRecordService {
    @Autowired
    private EscapeRecordMapper escapeRecordMapper;
    @Autowired
    private DelayRecordService delayRecordService;
    @Autowired
    private CustomerService customerService;

    @Transactional(rollbackFor = Exception.class)
    public Integer addEscapeRecord(EscapeRecord escapeRecord) {
        // 1. 验证是否有进行暂缓措施
        List<DelayRecord> delayRecords = delayRecordService.getByCustomerId(escapeRecord.getCustomerId());
        if (delayRecords.size() > 0) {
            // 2. 新增流失记录
            escapeRecord.setCreateTime(new Date());
            escapeRecordMapper.insert(escapeRecord);
            // 3. 修改用户状态
            Customer customer = customerService.getCustomerById(escapeRecord.getCustomerId());
            customer.setCustomerStatus("已流失");
            customerService.updateCustomer(customer);
            return 1;
        } else {
            return -1;
        }
    }
}
