package com.Demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person  {
    @Autowired
    private String shirt;

    @Override
    public String toString() {
        return "Person [shirt=" + shirt + "]";
    }
}
