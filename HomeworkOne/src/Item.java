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
 //Method that gets name
 public String getName(){
  return this.name;
 }
     //Method that gets weight
 public int getWeight(){
  return this.weight;
 }
 //Method that sets name
 public void setName(String name){
  this.name = name;
 }
 //Method that sets weight
 public void setWeight(int weight){
  this.weight = weight;
 }
 //Method that prints out description of item
 public void examine(){
  System.out.println(name + " " + weight + " pounds");
 }
}
