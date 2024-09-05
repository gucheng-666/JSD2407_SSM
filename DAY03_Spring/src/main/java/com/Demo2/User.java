package com.Demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class User {
    public void sayHello(){
        System.out.println("Hello!!!");
    }
}

