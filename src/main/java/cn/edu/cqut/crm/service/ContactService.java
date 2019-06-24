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

    public List<Contact> getAllContact() {
        return contactMapper.selectAll();
    }
}
