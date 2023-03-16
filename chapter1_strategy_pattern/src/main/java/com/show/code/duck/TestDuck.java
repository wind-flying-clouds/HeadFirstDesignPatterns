package com.show.code.duck;


import com.show.code.duck.fly.FlyNoWay;
import com.show.code.duck.quack.Squeak;

/**
 * created by: Omar
 * description: 
 * created time: 2023/3/11 22:13
 */

public class TestDuck {

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();

		duck.setFlyBehavior(new FlyNoWay());
		
		duck.setQuackBehavior(new Squeak());
		
		duck.performFly();
		
		duck.performQuack();

	}
	
	
}
