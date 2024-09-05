package com.Demo3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    public static void main(String[] args){
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO);
        AnnotationConfigApplicationContext contest =
                new AnnotationConfigApplicationContext("com.Demo3");
        UserDAO userDAO2 = contest.getBean(UserDAO.class);
        System.out.println(userDAO2);
    }
}
