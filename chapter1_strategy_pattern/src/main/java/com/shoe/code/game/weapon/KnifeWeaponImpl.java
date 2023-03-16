package com.shoe.code.game.weapon;

/**
 * created by: Omar
 * description:
 * created time: 2023/3/12 23:28
 */

public class KnifeWeaponImpl implements Weapon {
	@Override
	public void fight(String name) {
		System.out.println(name + "使用小刀战斗");
	}
}
