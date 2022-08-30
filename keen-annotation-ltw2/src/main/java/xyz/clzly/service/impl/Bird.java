package xyz.clzly.service.impl;

import xyz.clzly.service.Animal;
// @Keen
public class Bird implements Animal {

	public void move() {
		System.out.println("鸟在飞");
	}

	public void eat(Snake snake){
		System.out.println("鸟吃蛇："+snake);
	}
 
}