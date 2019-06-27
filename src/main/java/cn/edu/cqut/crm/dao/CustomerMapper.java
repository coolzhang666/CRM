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
     * 根据客户id查询客户
     * @param customerId 客户id
     * @return 返回客户信息
     */
    Customer selectById(Integer customerId);

    /**
     *
     * @param No 返回匹配的No
     */
    List<Customer> selectNo(String No);

    Integer insertByName(Customer customer);

    List<Customer> selectWillEscape();

    Integer selectVip(String rank);

    Integer selectCredit(String credit);

    Integer selectSatisfaction(String satisfaction);
}
