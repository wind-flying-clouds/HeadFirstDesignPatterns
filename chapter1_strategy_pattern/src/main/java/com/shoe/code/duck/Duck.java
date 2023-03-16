package com.shoe.code.duck;


import com.shoe.code.duck.fly.FlyBehavior;
import com.shoe.code.duck.quack.QuackBehavior;

/**
 * created by: Omar
 * description: 设计模式
 * created time: 2023/3/11 18:01
 */

public abstract class Duck {

	FlyBehavior flyBehavior;

	QuackBehavior quackBehavior;

	public Duck() {
	}


	void setFlyBehavior(FlyBehavior fly) {
		flyBehavior = fly;
	}

	void setQuackBehavior(QuackBehavior quack) {
		quackBehavior = quack;
	}


	void performFly() {
		quackBehavior.quack();
	}

	void performQuack() {
		flyBehavior.fly();
	}

}
