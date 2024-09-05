package com.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.Test");
        Student student =context.getBean(Student.class);
        System.out.println(student);
    }
}