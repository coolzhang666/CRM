package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.ChatRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRecordMapper {
    /**
     * 查询所有的交往记录
     * @return 返回交往记录列表
     */
    List<ChatRecord> selectAll();
    List<ChatRecord> getMsg(Integer cusId);
    void update(ChatRecord chatRecord);
    void remove(Integer chat_id);
    void insert(Integer chat_id);
}
