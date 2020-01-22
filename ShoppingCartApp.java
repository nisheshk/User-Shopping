/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

import java.util.*;
public class ShoppingCartApp {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		boolean exit=false;
		Shop shop=new Shop(); // creates a shop instance
		while(!exit) {
			System.out.println();
			// Displays choices for simulation
			System.out.println("Please choose one of the following options:");
			System.out.println("1. Enter as Shop Manager");
			System.out.println("2. Enter as a customer");
			System.out.println("3. Exit");
			System.out.println("Enter your choice(1/2/3):");
			int choice=in.nextInt();
			// Validation
			while(choice !=1 && choice !=2 && choice!=3) {
				System.out.println("Invalid Choice. Please enter your choice again (1/2/3):");
				choice=in.nextInt();
			}
			
			if(choice==1) {
				ShopManager manager=new ShopManager(); // instantiates a manager for the shop
				manager.simulateAction(shop); // simulates action for the manager
				
			}
			else if(choice==2) {
				Customer customer=new Customer(); // instantiates customer for the shop
				customer.simulateAction(shop); // simulates action for the customer
			}
			else {
				exit=true;
			}
			
		}
		
	}

}
