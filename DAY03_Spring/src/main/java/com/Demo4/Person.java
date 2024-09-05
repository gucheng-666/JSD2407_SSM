package com.Demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("winner")
//    private String shirt;
    private Clothes clothes;
    @Override
    public String toString() {
        return "Person [clothes=" + clothes + "]";
    }
}
