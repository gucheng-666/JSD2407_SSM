package com.Demo5;

import com.Demo5.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Demo {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);
        UserController controller = context.getBean(UserController.class);
        controller.doLogin();
    }
}
