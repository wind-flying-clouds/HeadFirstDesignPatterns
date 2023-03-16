package com.shoe.code.duck.quack;

/**
 * created by: Omar
 * description: 呱呱叫实现类
 * created time: 2023/3/11 21:47
 */

public class Quack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("我在呱呱叫");
	}
}
