//Created by Daniel Hug
//Class for all food in the RPG
public class Food extends Item {
	private String[] foodType = {"Fruit", "Meat", "Bread", "Cheese"};
	private int nutrition; //How healthy the food 
	private int quantity; //How much food
	
	//Constructor for food class
	public Food(String name, int weight,String[] foodType, int nutrition, int quantity ){
		super(name, weight);
		this.foodType = foodType;
		this.nutrition = nutrition;
		this.quantity = quantity;
		
	}
	
	//Method to get the type of food
	public String[] getFoodType(){
		return this.foodType;
		
	}
	
	//Method to get nutrition value
	public int getNutrition(){
		return this.nutrition;
		
	}
	
	//Method that gets quantity of food
	public int getQuantity(){
		return this.quantity;
		
	}
	
	//Method to set the food type
	public void setFoodType(String[] foodType){
		this.foodType = foodType;
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
