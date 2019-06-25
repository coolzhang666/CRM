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
     * @param cusId
     */
    public List<Contact> getAllContact() {
        return contactMapper.selectAll();
    }

    /**
     * 新增客户联系人
     * @param contact
     */
    public void addContact(Contact contact) {
        contactMapper.insertContact(contact);
    }

    public void editContact(Contact contact) {
        contactMapper.updateContact(contact);
    }

    public void deleteContact(Contact contact) {
        contactMapper.deleteContact(contact);
    }
}
