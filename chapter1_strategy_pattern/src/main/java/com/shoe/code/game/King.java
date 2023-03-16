package com.shoe.code.game;


import com.shoe.code.game.weapon.Weapon;

/**
 * created by: Omar
 * description: 国王
 * created time: 2023/3/12 23:31
 */

public class King extends Character {


	public King(Weapon weapon) {
		super(weapon);
	}

	/**
	 * 逆天改命
	 * @param wea
	 */
	@Override
	public void setWeapon(Weapon wea) {
		weapon = wea;
	}
}
