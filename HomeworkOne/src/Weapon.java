//Created by Daniel Hug
//Class for all weapons in RPG
public class Weapon extends Item {
	private int damage;
	private String[] weaponType = {"Sword", "Axe", "Mace"};
	
	
	public Weapon(String name, 
			      int weight, 
			      int damage, 
			      String[] weaponType){ 
		super(name, weight);
		this.damage = damage;
		this.weaponType = weaponType;
	}
	
	public int getDamage(){
		return this.damage;

	}
	public String[] getWeaponType(){
		return this.weaponType;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public void setWeaponType(String[] weaponType){
		this.weaponType = weaponType;
	}
}
