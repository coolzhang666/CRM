package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactMapper {
    /**
     * 查询所有的联系人
     * @return 返回联系人列表
     */
    List<Contact> selectAll(Integer customerId);

    /**
     * 新增客户联系人
     * @param contact
     */
    void insertContact(Contact contact);

    /**
     * 修改客户联系人
     * @param contact
     */
    void updateContact(Contact contact);

    /**
     * 删除客户联系人
     * @param contact
     */
    void deleteContact(Contact contact);
}
