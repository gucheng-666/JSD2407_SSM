package com.Demo5.service;

import com.Demo5.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDAO userDAO;
    @Override
    public boolean login(String username, String password) {
        System.out.println("UserService:开始处理用户登录信息");
        System.out.println("UserService:验证用户信息是否有误");
        System.out.println("UserService:获取用户信息...");
        boolean success =  userDAO.findUser();
        if(success){
            System.out.println("UserService:用户信息验证成功");
        }else {
            System.out.println("UserService:用户信息验证失败");
        }

        return success;
    }
}
