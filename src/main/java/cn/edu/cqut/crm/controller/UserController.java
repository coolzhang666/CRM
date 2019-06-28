package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.User;
import cn.edu.cqut.crm.service.UserService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import cn.edu.cqut.crm.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userId}")
    public ReturnObject<Object> getUserById(@PathVariable() Integer userId) {
        User user = userService.getUserById(userId);
        return ReturnUtil.success("啊啊啊啊", user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ReturnObject<Object> login(String userNo, String userPassword, HttpServletResponse response, HttpServletRequest request) {
        User user = userService.getUserByNo(userNo);
        if (user != null) {
            if (userPassword.equals(user.getUserPassword())) {
                String token = TokenUtil.sign(userNo);
                Cookie cookie = new Cookie("token", token);
                cookie.setPath("/");
                response.addCookie(cookie);
                HttpSession session = request.getSession();
                session.setAttribute("token", token);
                return ReturnUtil.success("登录成功", user);
            } else {
                return ReturnUtil.fail("密码错误", null);
            }
        } else {
            return ReturnUtil.fail("用户不存在", null);
        }
    }

    @RequestMapping(value = "/checkOnline", method = RequestMethod.GET)
    public ReturnObject<Object> checkOnline(HttpServletRequest request) {
        String token = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if ("token".equals(cookie.getName())) {
                token = cookie.getValue();
            }
        }
        HttpSession session = request.getSession();
        if (token != null) {
            String userNo = TokenUtil.getUserNo(token);
            if (TokenUtil.verify(token, userNo)) {
                String token1 = (String) session.getAttribute("token");
                if (token.equals(token1)) {
                    User user = userService.getUserByNo(userNo);
                    return ReturnUtil.success("验证成功", user);
                } else {
                    return ReturnUtil.fail("身份过期", null);
                }
            } else {
                return ReturnUtil.fail("验证失败", null);
            }
        } else {
            return ReturnUtil.fail("您还未登录", null);
        }
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ReturnObject<Object> listUserByRole(){
        return ReturnUtil.success(userService.listUserByRole());
    }
}
