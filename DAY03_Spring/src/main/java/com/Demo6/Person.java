package com.Demo6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "clothes=" + clothes +
                '}';
    }
    @Resource
    private Clothes clothes;
}