package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.ChatRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRecordMapper {
    List<ChatRecord> selectAll();
}
