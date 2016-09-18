//Class for all armor in the RPG
public class Armor extends Item {
 private int[] defense = new int[5]; //Helmet, Breast_Plate, Legs, Gloves, Boots};
 
 

 //Constructor for the Armor class
 public Armor(String name, int weight, int[] defense){
  super(name, weight);
  this.defense = defense;
  
 }
 
 //Method that gets the Armor's defense
 public int[] getDefense(){
  return this.defense;
 }
 
 
 
 //Method that sets the Armors defense stat
 public void setDefense(int[] defense){
  this.defense = defense;
 }
}
 
 

