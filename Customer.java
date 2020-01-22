/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

import java.util.*;

public class Customer {
	
	
	ShoppingCart cart; // stores items added by the customer in the cart
	
	public Customer() {
		cart=new ShoppingCart();
	}
	// Simulates the action of a Customer 
	public void simulateAction(Shop shop) {
		boolean end=false; // tracks end of simulation
		Scanner in=new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome, Customer!");
		while(!end) {
			System.out.println();
			// Displays choices to the customer
			System.out.println("Enter one of the following choices");
			System.out.println("1. View all shop items");
			System.out.println("2. Add a new shop item to the cart");
			System.out.println("3. View all cart Items");
			System.out.println("4.Exit as Customer");
			System.out.println("Enter your choice(1/2/3/4):");
			int choice=in.nextInt();
			//Validation
			while(choice !=1 && choice !=2 && choice!=3 && choice!=4) {
				System.out.println("Invalid Choice. Please enter your choice again (1/2/3/4):");
				choice=in.nextInt();
			}
			
			if(choice==1) {
				System.out.println();
				shop.displayItems();
			}
			else if(choice==2) {
				System.out.println();
				System.out.println("Enter item id you want to select");
				int id=in.nextInt();
				Item item=shop.returnItem(id);
				if(item==null) {
					System.out.println("No such item available");
				}
				else cart.addItem(item); // add item to cart
				
			}
			else if(choice==3) {
				cart.displayItem(); // display items in cart
			}
			else {
				end=true;
			}
		}
	}
}
