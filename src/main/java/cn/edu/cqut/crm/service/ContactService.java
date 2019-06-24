package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.ContactMapper;
import cn.edu.cqut.crm.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactMapper contactMapper;

    /**
     * 查询所有的联系人
     * @return 返回联系人列表
     */
    public List<Contact> getAllContact() {
        return contactMapper.selectAll();
    }
}
