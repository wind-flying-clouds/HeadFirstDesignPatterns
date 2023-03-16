package com.shoe.code.game;


import com.shoe.code.game.weapon.Weapon;

/**
 * created by: Omar
 * description: 农民
 * created time: 2023/3/12 23:42
 */

public class Farmer extends Character{


	public Farmer(Weapon weapon) {
		super(weapon);
	}

	public void setWeapon(Weapon wea) {
		weapon = wea;
	}
	
}
