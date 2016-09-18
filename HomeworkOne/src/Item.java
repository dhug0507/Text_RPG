//Created by Daniel Hug
//Parent class for all Items in RPG
public class Item {
	//Initialize properties
	private String name = ""; //Name of the Item
	//made a String array, separated weight into 3 different categories light, medium, and heavy.
	private String[] weight = {"Light", "Medium", "Heavy"}; 
	
	//Constructor
	public Item(String name, String[] weight){
		this.name = name;
		this.weight = weight;
		
	}
	

}
