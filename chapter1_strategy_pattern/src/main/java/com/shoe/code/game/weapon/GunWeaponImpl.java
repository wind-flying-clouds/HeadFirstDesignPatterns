package com.shoe.code.game.weapon;

/**
 * created by: Omar
 * description:
 * created time: 2023/3/12 23:27
 */

public class GunWeaponImpl implements Weapon {
	@Override
	public void fight(String name) {
		System.out.println(name + "用枪战斗");
	}
}
