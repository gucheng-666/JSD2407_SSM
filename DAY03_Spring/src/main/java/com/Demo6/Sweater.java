package com.Demo6;

import org.springframework.stereotype.Component;

@Component("winner")
public class Sweater implements Clothes{
    @Override
    public String toString() {
        return "毛衣";
    }
}
