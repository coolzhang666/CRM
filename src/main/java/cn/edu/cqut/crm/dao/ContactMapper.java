package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactMapper {
    List<Contact> selectAll();
}