package com.Demo4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contest =
                new AnnotationConfigApplicationContext("com.Demo4");
        Person person = contest.getBean(Person.class);
        System.out.println(person);
    }
}
