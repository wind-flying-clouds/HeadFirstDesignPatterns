package com.shoe.code.duck;


import com.shoe.code.duck.fly.FlyNoWay;
import com.shoe.code.duck.quack.Squeak;

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
