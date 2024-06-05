/*
Author: Jennifer Vo
Course: COP 2210
Date: 06/02/2024
Assignment: Online Shooping cart assignment
Instructor: Sergio Pisano
Description: Using other Class Methods to get and set variables.
*/
import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); // creates Scanner object for user input
		ItemToPurchase item1 = new ItemToPurchase(); // creates item object 1
		ItemToPurchase item2 = new ItemToPurchase(); // creates item object 2
		
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		item1.setName(scnr.nextLine()); // takes user input and sets item name to input
		System.out.println("Enter the item price:");
		item1.setPrice(scnr.nextInt()); // takes user input and sets item price to input
		System.out.println("Enter the item quantity:");
		item1.setQuantity(scnr.nextInt()); // takes user input and sets item quantity to input
		System.out.println();
//		System.out.println(item1.getName() + " " + item1.getPrice() + " " + item1.getQuantity());   testing Methods
		
		System.out.println("Item 2");
		scnr.nextLine();
		System.out.println("Enter the item name:");
		item2.setName(scnr.nextLine()); // takes user input and sets item name to input
		System.out.println("Enter the item price:");
		item2.setPrice(scnr.nextInt()); // takes user input and sets item price to input
		System.out.println("Enter the item quantity:");
		item2.setQuantity(scnr.nextInt()); // takes user input and sets item quantity to input
		
		System.out.println();
		System.out.println("TOTAL COST");
		System.out.printf("%s %d @ $%d = $%d\n" , item1.getName(), item1.getQuantity(), item1.getPrice(), item1.getQuantity() * item1.getPrice());
		System.out.printf("%s %d @ $%d = $%d\n" , item2.getName(), item2.getQuantity(), item2.getPrice(), item2.getQuantity() * item2.getPrice());
		System.out.printf("\nTotal: $%d\n", (item1.getQuantity() * item1.getPrice()) + (item2.getQuantity() * item2.getPrice()));
	}
	
}

/* CODE OUTPUT
Item 1
Enter the item name:
Chocolate Chip:
Enter the item price:
3
Enter the item quantity:
1

Item 2
Enter the item name:
Bottled Water
Enter the item price:
1
Enter the item quantity:
10

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13

*/