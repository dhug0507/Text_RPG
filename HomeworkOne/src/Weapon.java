//Created by Daniel Hug
//Class for all weapons in RPG
public class Weapon extends Item {
  private int damage;// = new int[3];//Sword, Axe, Mace
 private int speed; //= new int[3];//The speed of the Sword, Axe, Mace
 
 
 //Constructor for the Wepons class
 public Weapon(String name, 
         int weight, 
         int damage,
         int speed){ 
  super(name, weight);
  this.damage = damage;
  this.speed = speed;
  
 }
 
 //Method that gets the Damage stat
 public int getDamage(){
  return this.damage;

 }
 
 //Method that gets the speed stat
 public int getSpeed(){
  return this.speed;

 }

 //Method that sets the Damage stat
 public void setDamage(int damage){
  this.damage = damage;
 }
 
 //Method that sets the speed stat
  public void setSpeed(int speed){
  this.speed = speed;
 }
 

}
