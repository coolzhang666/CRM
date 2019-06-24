package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ChatRecordMapper;
import cn.edu.cqut.crm.model.ChatRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRecordService {
    @Autowired
    private ChatRecordMapper chatRecordMapper;

    /**
     * 查询所有的交往记录
     * @return 返回交往记录列表
     */
    public List<ChatRecord> getAllChatRecord() {
        return chatRecordMapper.selectAll();
    }
}
