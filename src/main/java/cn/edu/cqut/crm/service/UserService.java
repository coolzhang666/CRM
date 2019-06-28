package cn.edu.cqut.crm.service;

import cn.edu.cqut.crm.dao.UserMapper;
import cn.edu.cqut.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId) {
        return userMapper.selectById(userId);
    }

    public User getUserByNo(String userNo) {
        return userMapper.selectByNo(userNo);
    }

    public List<User> listUserByRole(){return userMapper.selectByRole();}
}
