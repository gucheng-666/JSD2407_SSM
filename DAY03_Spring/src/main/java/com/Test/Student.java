package com.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    @Qualifier("Hamburger")
    private food food;
    @Override
    public String toString() {
        return "Student [food=" + food + "]";
    }
}
