package com.Test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Hamburger")
public class Hamburger implements food{
    @Override
    @Qualifier
    public String toString() {
        return "汉堡包";
    }
}
