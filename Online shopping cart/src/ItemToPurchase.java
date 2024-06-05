/*
Author: Jennifer Vo
Course: COP 2210
Date: 06/02/2024
Assignment: Online Shooping cart assignment
Instructor: Sergio Pisano
Description: Using other Class Methods to get and set variables.
*/

public class ItemToPurchase {
	private String itemName; // creates itemName class variable
	private int itemPrice; // creates itemPrice class variable
	private int itemQuantity; // creates itemQuantity class variable
	
	public ItemToPurchase() { // creates default constructors and initializes variable values
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	public void setName(String name) { // method to set name
		itemName = name;
	}
	
	public String getName() { // method to return name
		return itemName;
	}
	
	public void setPrice(int price) { // method to set price
		itemPrice = price;
	}
	
	public int getPrice() {
		return itemPrice; // method to return price
	}
	
	public void setQuantity(int quantity) { // method to set quantity
		itemQuantity  = quantity;
	}
	
	public int getQuantity() {
		return itemQuantity; // method to return quantity
	}
}
