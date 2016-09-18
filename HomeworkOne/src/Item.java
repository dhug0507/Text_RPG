//Created by Daniel Hug
//Parent class for all Items in RPG
public class Item {
	//Initialize properties
	private String name = ""; //Name of the Item
	private int weight; 
	
	//Constructor
	public Item(String name, int weight){
		this.name = name;
		this.weight = weight;
		
	}
	//Getters and Setters
	public String getName(){
		return this.name;
	}

	public int getWeight(){
		return this.weight;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	//Method that 
	public void examine(){
		getName();
		getWeight();
	}
}
