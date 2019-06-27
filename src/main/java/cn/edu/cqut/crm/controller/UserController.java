package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.User;
import cn.edu.cqut.crm.service.UserService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userId}")
    public ReturnObject<Object> getUserById(@PathVariable() Integer userId) {
        User user = userService.getUserById(userId);
        return ReturnUtil.success("啊啊啊啊", user);
    }
}
