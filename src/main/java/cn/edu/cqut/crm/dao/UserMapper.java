package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User selectById(Integer userId);

    User selectByNo(String userNo);

    List<User> selectByRole();
}
