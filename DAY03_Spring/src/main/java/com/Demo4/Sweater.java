package com.Demo4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("winner")
public class Sweater implements Clothes{
    @Override
    @Qualifier
    public String toString() {
        return "毛衣";
    }
}
