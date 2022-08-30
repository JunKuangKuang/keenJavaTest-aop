package xyz.clzly.service.impl;

import xyz.clzly.component.Keen;
import xyz.clzly.service.Animal;

// @Keen
public class Snake implements Animal {
    @Keen
    public void move() {
        System.out.println("蛇在爬");
    }

}