package ro.ase.csie.cts.gr1094.dp.simplefactory;

public abstract class AbstractWeapon {

	 String description;
	 int powerLevel;
	
	 
	 
	public void setDescription(String description) {
		this.description = description;
	}



	public abstract void pewPew();
}
