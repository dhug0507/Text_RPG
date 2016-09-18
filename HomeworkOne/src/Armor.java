//Created by Daniel Hug
//Class for all armor in the RPG
public class Armor extends Item {
	private int defense;
	private String[] armorType = {"Helmet", "Breast_Plate", "Legs", "Gloves", "Boots"};

	//Constructor for the Armor class
	public Armor(String name, int weight, int defense, String[] armorType){
		super(name, weight);
		this.defense = defense;
		this.armorType = armorType;
	}
	
	//Method that gets the Armor's defense
	public int getDefense(){
		return this.defense;
	}
	
	//Method that gets the armor type
	public String[] getArmorType(){
		return this.armorType;
	}
	
	//Method that sets the Armors defense stat
	public void setDefense(int defense){
		this.defense = defense;
	}
	
	//Method that sets the armor type
	public void setArmorType(String[] armorType){
		this.armorType = armorType;
	}
}
