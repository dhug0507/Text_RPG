//Created by Daniel Hug
//Main class for RPG
public class RpgMain {

 public static void main(String[] args) {
   int[] defense = {15,25,20,10,12}; //{"Helmet", "Breast_Plate", "Legs", "Gloves", "Boots"};
   int armorWeight = 100;//The armors weight
   int damage = 10;//The weapons damage
   int speed = 2;//The speed of the weapon
   int weaponWeight = 30; //The weight of the weapon
   int nutrition = 5; //How healthy the food 
   int quantity = 10; //how much food there is
   int steakWeight = 1; //pounds
     
   
   //This object creation call the default armor constructor
      Armor invetory = new Armor("Plate Armor", armorWeight, defense);
      System.out.println("Armor name: " + invetory.getName()); //Test getName method, and prints out the armors name
      System.out.println("Total Armor Weight: " + invetory.getWeight() + " pounds");//prints out the armors weight
      System.out.println("Total Armor Defense: " + (invetory.getDefense()[0]+
                                                    invetory.getDefense()[1]+
                                                    invetory.getDefense()[2]+
                                                    invetory.getDefense()[3]+
                                                    invetory.getDefense()[4]));//Prints out the armors total defense     
      System.out.println("Helmet Defense: " +  invetory.getDefense()[0]);
      System.out.println("Breast Plate Defense: " +  invetory.getDefense()[1]);
      System.out.println("Leg Defense: " +  invetory.getDefense()[2]);
      System.out.println("Gloves Defense: " +  invetory.getDefense()[3]);
      System.out.println("Boots Defense: " +  invetory.getDefense()[4]);
      
      System.out.println();
      
      //This object creation call the default weapon constructor
      Weapon armory = new Weapon("Sword of a Thousand Truths", weaponWeight, damage, speed);
      System.out.println("Weapons name: " + armory.getName()); //prints out the weapons name
      System.out.println("Weapon's weight: " + armory.getWeight() + " Pounds");//prints out the weapons weight
      System.out.println("Attack Power: " + (armory.getDamage() * armory.getSpeed()));//Attack * Speed = Attack power
      
      System.out.println();
      
      //This object creation call the default Food constructor 
     Food supplies = new Food("Steak", steakWeight, nutrition, quantity);
     System.out.println("Food's name: " + supplies.getName());
     System.out.println("Food's nutrition: " + supplies.getNutrition() + " health points");
     System.out.println("Food's weight: " + (supplies.getWeight() * supplies.getQuantity()) + " pounds");
     
     System.out.println();
     
     supplies.examine();//Testing out the examine method
     invetory.examine();
     armory.examine();
     
     System.out.println();
     
     invetory.setName("Copper Armor");
     System.out.println(invetory.getName()); //Testing set name method
     armory.setName("Big Stick");
     System.out.println(armory.getName());
     supplies.setName("Sushi");
     System.out.println(supplies.getName());  
     
     System.out.println();
     
     invetory.setWeight(4200);
     System.out.println(invetory.getWeight()); //Testing set weight method
     armory.setWeight(80000000);
     System.out.println(armory.getWeight());
     supplies.setWeight(900000);
     System.out.println(supplies.getWeight());  
     
     
 }
}
  
  
  

 


