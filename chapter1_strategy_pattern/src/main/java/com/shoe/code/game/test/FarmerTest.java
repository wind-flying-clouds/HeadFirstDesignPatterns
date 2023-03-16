package com.show.code.game.test;


import com.show.code.game.Farmer;
import com.show.code.game.weapon.CannonWeaponImpl;
import com.show.code.game.weapon.KnifeWeaponImpl;

/**
 * created by: Omar
 * description: 农民去战斗
 * created time: 2023/3/12 23:50
 */

public class FarmerTest {

	public static void main(String[] args) {
		
		Farmer farmer = new Farmer(new KnifeWeaponImpl());
		// 农民只能用小刀去战斗
		farmer.doExecute("农奴只能");

		System.out.println();
		System.out.println("..............翻身农奴把歌唱..........");
		System.out.println();

		// 农民只能用小刀去战斗？？？？
		farmer.setWeapon(new CannonWeaponImpl());
		farmer.doExecute("农奴照样能");
	}
	
}
