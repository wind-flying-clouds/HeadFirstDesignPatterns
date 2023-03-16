package com.show.code.duck.quack;

/**
 * created by: Omar
 * description:
 * created time: 2023/3/11 22:06
 */

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("安静");
	}
}
