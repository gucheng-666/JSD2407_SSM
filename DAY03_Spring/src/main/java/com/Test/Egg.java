package com.Test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("egg")
public class Egg implements food {
    @Override
    @Qualifier
    public String toString() {
        return "鸡蛋";
    }
}
