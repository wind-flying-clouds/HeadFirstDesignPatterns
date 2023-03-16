package com.show.code.game.test;


import com.show.code.game.King;
import com.show.code.game.weapon.CannonWeaponImpl;
import com.show.code.game.weapon.GunWeaponImpl;

/**
 * created by: Omar
 * description: 角色战斗
 * created time: 2023/3/12 23:43
 */

public class KingTest {

	public static void main(String[] args) {
		King king = new King(new GunWeaponImpl());
		king.doExecute("王爷");

		System.out.println();
		System.out.println("王爷很生气，要用大炮去战斗");
		System.out.println();
		
		king.setWeapon(new CannonWeaponImpl());
		king.doExecute("王爷");
		

		King king1 = new King(new CannonWeaponImpl());
		king1.doExecute("皇上");
	}
	
}
