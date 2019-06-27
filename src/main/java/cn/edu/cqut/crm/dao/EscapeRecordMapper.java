package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.EscapeRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface EscapeRecordMapper {
    Integer insert(EscapeRecord escapeRecord);
}
