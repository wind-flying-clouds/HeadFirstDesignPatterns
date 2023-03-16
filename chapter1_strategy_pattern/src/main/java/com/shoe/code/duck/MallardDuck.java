package com.shoe.code.duck;


import com.shoe.code.duck.fly.FlyWithWings;
import com.shoe.code.duck.quack.Quack;

/**
 * created by: Omar
 * description: 绿头鸭
 * created time: 2023/3/11 21:44
 */

public class MallardDuck extends Duck{
	
	
	public MallardDuck() {
		// 默认行为
		quackBehavior = new Quack();
		
		flyBehavior = new FlyWithWings();
		
	}
}
