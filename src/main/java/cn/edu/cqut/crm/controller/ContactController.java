package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.Contact;
import cn.edu.cqut.crm.model.Customer;
import cn.edu.cqut.crm.service.ContactService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;

    /**
     * 新增客户联系人
     * @param contact Contact对象
     * @return 提示信息
     */
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public ReturnObject<Object> addContact(Contact contact){
        //System.out.println("cusId  "+cusId);
        contactService.addContact(contact);
        return ReturnUtil.success("新增联系人成功",null);
    }

    /**
     * 联系人信息的分页查询功能
     * @param page 当前页号
     * @param rows 页面容量
     * @param customerId 客户Id
     * @return 返回联系人列表
     */
    @RequestMapping(value = "/contact/{page}/{rows}/{customerId}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllContact(@PathVariable() int page, @PathVariable() int rows, @PathVariable() Integer customerId) {

        PageHelper.startPage(page, rows);
        List<Contact> contacts = contactService.getAllContact(customerId);
        PageInfo<Contact> pageInfo = new PageInfo<>(contacts);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", contacts, total);
    }

    /**
     * 修改联系人信息
     * @param contact Contact对象
     * @return 提示信息
     */
    @RequestMapping(value = "/contact", method = RequestMethod.PUT)
    public ReturnObject<Object> editContact(Contact contact){
        contactService.editContact(contact);
        return ReturnUtil.success("修改联系人成功",null);
    }

    /**
     * 删除联系人信息
     * @param contact Contact对象
     * @return 提示信息
     */
    @RequestMapping(value = "/contact", method = RequestMethod.DELETE)
    public ReturnObject<Object> deleteContact(Contact contact){
        contactService.deleteContact(contact);
        return ReturnUtil.success("删除联系人成功",null);
    }
}
