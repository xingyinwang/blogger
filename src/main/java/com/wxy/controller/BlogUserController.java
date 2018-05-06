package com.wxy.controller;

import com.wxy.entity.BlogUser;
import com.wxy.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Cser_W on 2018/5/6.
 */
@Controller
@RequestMapping("wxy")
public class BlogUserController {

    @Autowired
    BlogUserService blogUserService;

    @RequestMapping("CheckLogin")
    public String checkLogin(Model model,BlogUser blogUser) {
        BlogUser blogUserByNameAndPassword = blogUserService.getBlogUserByNameAndPassword(blogUser.getUserName(), blogUser.getPassword());
        if (blogUserByNameAndPassword != null) {
            System.out.println(blogUserByNameAndPassword.toString());
            return "loginSuccess";
        }
        else {
            System.out.println("登录失败");
            return "redirect:/wxy/toLogin";
        }
    }
    @RequestMapping("toLogin")
    public String toLogin() {
        return "loginPage";
    }

    @RequestMapping("toRegister")
    public String toRegister(){
        return "registerPage";
    }

    @RequestMapping("register")
    public String register(Model model, BlogUser blogUser){

        // blogUser.setUserId(11);
        int i = blogUserService.blogUserRegister(blogUser);
        if (i == 1)
            return "loginSuccess";
        else
            return "registerPage";
    }
}
