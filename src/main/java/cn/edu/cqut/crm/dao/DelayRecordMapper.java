package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.DelayRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DelayRecordMapper {
    List<DelayRecord> selectAll();

    List<DelayRecord> selectByCustomerId(Integer customerId);

    Integer insert(DelayRecord delayRecord);

    Integer update(DelayRecord delayRecord);

    Integer deleteById(Integer delayId);
}
