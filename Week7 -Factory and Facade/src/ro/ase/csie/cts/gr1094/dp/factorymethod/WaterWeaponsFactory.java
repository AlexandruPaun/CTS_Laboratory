package ro.ase.csie.cts.gr1094.dp.factorymethod;

import ro.ase.csie.cts.gr1094.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.gr1094.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractFactory{

public AbstractWeapon getWeapon(WeaponType type, String description) {
		
		
	AbstractWeapon weapon=null;
	switch(type) {
	case PISTOL:
		weapon=new WaterPistol();
		break;
	case MACHINE_GUN:
		weapon=new WaterBaloon();
		break;
	case BAZOOKA:
		weapon=new WaterBucket();
		break;
	default:
		throw new UnsupportedOperationException();

	}return weapon;
}
	
}
