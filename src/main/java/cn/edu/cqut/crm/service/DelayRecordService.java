package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.DelayRecordMapper;
import cn.edu.cqut.crm.model.DelayRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DelayRecordService {
    @Autowired
    private DelayRecordMapper delayRecordMapper;

    public List<DelayRecord> getAllDelayRecord() {
        return delayRecordMapper.selectAll();
    }

    public List<DelayRecord> getByCustomerId(Integer customerId) {
        return delayRecordMapper.selectByCustomerId(customerId);
    }

    public Integer addDelayRecord(DelayRecord delayRecord) {
        delayRecord.setCreateTime(new Date());
        return delayRecordMapper.insert(delayRecord);
    }

    public Integer changeDelayRecord(DelayRecord delayRecord) {
        return delayRecordMapper.update(delayRecord);
    }

    public Integer deleteById(Integer recordId) {
        return delayRecordMapper.deleteById(recordId);
    }
}
