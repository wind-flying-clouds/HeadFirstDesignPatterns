package com.show.code.game;


import com.show.code.game.weapon.Weapon;

/**
 * created by: Omar
 * description: 角色
 * created time: 2023/3/12 23:23
 */

public abstract class Character {

	Weapon weapon;


	public Character(Weapon weapon) {
		this.weapon = weapon;
	}

	void setWeapon(Weapon wea) {
		weapon = wea;
	}

	public void doExecute(String name) {
		weapon.fight(name);
	}
	
}
