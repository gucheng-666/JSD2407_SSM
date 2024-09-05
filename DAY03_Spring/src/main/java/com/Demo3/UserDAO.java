package com.Demo3;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class UserDAO {
    //链接数据库时的地址
    //@Value注解可以被标注在属性上，Spring在创建对象时会同时根据该注解的参数来初始化该属性的值
    @Value("jdbc:mysql://localhost:3306/tedu")//url属性会被赋值为@Value()注解参数的值
    private String url;
    //数据库用户名
    @Value("root")
    private String username;
    //数据库密码
    @Value("root")
    private String password;

    @Override
    public String toString() {
        return "UserDAO{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}