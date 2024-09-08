package atividade1;

public class Product {
  String name;
  double price;
  int amount = 0;
  
  public Product(String name, double price) {
	  this.name = name;
	  this.price = price;
	  this.amount += 1;
  }
  
  public void addItems(int amount)  {
	  this.amount += amount;
  }
  public void removeItems(int amount) {
	  if(this.amount < amount) {
		  System.out.println("Você não tem a quantidade de produtos no estoque!");
		  return;
	  }
	  
	  this.amount -= amount;	 	
  }
  
  public double getPrice() {
	  return this.price;
  }
  
  public String getName() {
	  return this.name;
  }
  
  public int getAmount() {
	  return this.amount;
  }
  
  public void setPrice(double price) {
	  this.price = price;
  }
  
  public void setName(String name) {
	  this.name = name;
  }    
}
