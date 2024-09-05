package com.Demo5.controller;

import com.Demo5.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    public void doLogin(){
        System.out.println("UserController:开始执行登录业务");
        boolean success =userService.login("菠萝吹雪","123456");
        if(success){
            System.out.println("UserController:登录成功");
        }else {
            System.out.println("UserController:登录失败");
        }


    }
}
