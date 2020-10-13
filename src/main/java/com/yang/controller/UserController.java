package com.yang.controller;

import com.yang.pojo.Books;
import com.yang.pojo.User;
import com.yang.service.BookService;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //controller 调用 service
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService UserService;

    //查询用户
    @RequestMapping("/query")
    public String list(Model model,User user){
        User  u= UserService.getLoginUser(user.getUserName());
        System.out.println(user);
        String p = u.getUserPassword();
        if(p.equals(user.getUserPassword())){
            System.out.println("匹配正确");
            return "redirect:/book/allbook";
        }
        else {
            System.out.println("error");
            return "login";
        }

    }
}
