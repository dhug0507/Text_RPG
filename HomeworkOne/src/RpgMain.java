//Created by Daniel Hug
//Main class for RPG
public class RpgMain {

 public static void main(String[] args) {
   int[] defense = {15,25,20,10,12}; //{"Helmet", "Breast_Plate", "Legs", "Gloves", "Boots"};
   int armorWeight = 100;
   
   
      Armor invetory = new Armor("Plate Armor", armorWeight, defense);
      System.out.println("Armor name: " + invetory.getName());
      System.out.println("Total Armor Weight: " + invetory.getWeight() + " pounds");
      System.out.println("Total Armor Defense: " + (invetory.getDefense()[0]+
                                                    invetory.getDefense()[1]+
                                                    invetory.getDefense()[2]+
                                                    invetory.getDefense()[3]+
                                                    invetory.getDefense()[4]));     
      System.out.println("Helmet Defense: " +  invetory.getDefense()[0]);
      System.out.println("Breast Plate Defense: " +  invetory.getDefense()[1]);
      System.out.println("Leg Defense: " +  invetory.getDefense()[2]);
      System.out.println("Gloves Defense: " +  invetory.getDefense()[3]);
      System.out.println("Boots Defense: " +  invetory.getDefense()[4]);
      
  
  
  
  

 }

}
