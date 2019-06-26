package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    /**
     * 查询所有的客户
     * @return 返回客户列表
     */
    List<Customer> selectAll();

    /**
     * 增加用户
     * @param customer 增加用户的信息
     */
    void insertCustomer(Customer customer);

    /**
     * 更新用户信息
     * @param customer 要更新用户的信息
     */
    void updateCustomer(Customer customer);

    /**
     * 删除指定用户
     * @param customer 删除用户的信息
     */
    void deleteCustomer(Customer customer);

    /**
     *
     * @param Id 返回匹配的id
     */
    List<Customer> selectId(Integer Id);

    /**
     *
     * @param No 返回匹配的No
     */
    List<Customer> selectNo(String No);

    Integer insertByName(Customer customer);
}
