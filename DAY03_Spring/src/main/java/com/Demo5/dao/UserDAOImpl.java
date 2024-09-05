package com.Demo5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements IUserDAO {

    @Override
    public boolean findUser( ) {
        System.out.println("UserDAO:根据用户名，密码查找用户信息");
        double r=Math.random();
        if(r>0.5){
            System.out.println("用户信息查找成功");
            return true;
        }else {
            System.out.println("用户信息查找失败");
            return false;
        }
    }
}
