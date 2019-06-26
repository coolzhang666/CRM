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
     * @param customerId 客户Id
     */
    public List<Contact> getAllContact(Integer customerId) {
        return contactMapper.selectAll(customerId);
    }

    /**
     * 新增客户联系人
     * @param contact
     */
    public void addContact(Contact contact) {
        contactMapper.insertContact(contact);
    }

    /**
     * 修改联系人
     * @param contact
     */
    public void editContact(Contact contact) {
        contactMapper.updateContact(contact);
    }

    /**
     * 删除联系人
     * @param contact
     */
    public void deleteContact(Contact contact) {
        contactMapper.deleteContact(contact);
    }

    public Contact insertByName(Contact contact) {
        contactMapper.insertByName(contact);
        return contact;
    }
}
