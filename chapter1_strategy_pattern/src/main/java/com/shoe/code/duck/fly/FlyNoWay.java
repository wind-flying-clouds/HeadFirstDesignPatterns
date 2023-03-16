package com.shoe.code.duck.fly;

/**
 * created by: Omar
 * description: 不会飞
 * created time: 2023/3/11 21:59
 */

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("我不会飞");
	}
}
