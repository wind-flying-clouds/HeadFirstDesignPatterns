package com.shoe.code.game.weapon;

/**
 * created by: Omar
 * description:
 * created time: 2023/3/12 23:30
 */

public class CannonWeaponImpl implements Weapon {
	@Override
	public void fight(String name) {
		System.err.println(name + "用大炮去战斗");
	}
}
