package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    @ResponseBody
    public String Login(User user, HttpSession session) {
        User user1 = userService.QueryUser(user.getName());
        if (user1 == null) {
            return "用户名不存在，请检查用户名或者注册";
        } else if (user.getPassword().equals(user1.getPassword())) {
            session.setAttribute("username", user1.getName());
            return "success";
        }
        return "密码错误";
    }

    @RequestMapping("/index")
    public String index(HttpSession session) {
        if (session.getAttribute("username") != null) {
            return "MainPage";
        } else {
            return "index";
        }
    }
}
