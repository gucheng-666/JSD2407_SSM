package com.Demo6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Demo {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Person.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
