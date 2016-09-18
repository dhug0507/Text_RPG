//Created by Daniel Hug
//Class for all food in the RPG
public class Food extends Item {
	int nutrition; //How healthy the food 
	int quantity; //How much food
	
	//Constructor for food class
	public Food(String name, int weight, int nutrition, int quantity ){
		super(name, weight);
		this.nutrition = nutrition;
		this.quantity = quantity;
		
	}
	
	//Method to get nutrition value
	public int getNutrition(){
		return this.nutrition;
		
	}
	
	//Method that gets quantity of food
	public int getQuantity(){
		return this.quantity;
		
	}
	
	//Method that sets nutrition value
	public void setNutrition(int nutrition){
		this.nutrition = nutrition;
	}
	
	//Method that sets the quantity
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	
	
	
	

}
