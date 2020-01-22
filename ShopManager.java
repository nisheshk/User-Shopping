/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

import java.util.*;

public class ShopManager {

	
	public ShopManager() {} 
	
	// Simulates the action of a shop Manager 
	public void simulateAction(Shop shop) {
		boolean end=false; // tracks the end of the simulation
		Scanner in=new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome, Manager!");
		// simulates action
		while(!end) {
			System.out.println();
			// Offer choices
			System.out.println("Enter one of the following choices");
			System.out.println("1. View all shop items");
			System.out.println("2. Add a new item to the shop");
			System.out.println("3.Exit as Manager");
			System.out.println("Enter your choice(1/2/3):");
			int choice=in.nextInt();
			// Valdiation
			while(choice !=1 && choice !=2 && choice!=3) {
				System.out.println("Invalid Choice. Please enter your choice again (1/2/3):");
				choice=in.nextInt();
			}
			
			if(choice==1) {
				shop.displayItems(); 
			}
			else if(choice==2) {
				// Displays more options
				System.out.println();
				System.out.println("Select one of the following choices");
				System.out.println("1. Add a book");
				System.out.println("2. Add a Gift Card");
				System.out.println("Enter your choice (1/2) :");
				int choice2=in.nextInt();
				//Validation
				while(choice2 !=1 && choice2 !=2) {
					System.out.println("Invalid Choice. Please enter your choice again (1/2):");
					choice2=in.nextInt();
				}
				// Adds required item to the shop
				if(choice2==1) {
					System.out.println("Enter price for the book ");
					int price=in.nextInt();
					while(price<0) {
						System.out.println("Price should be a non negative integer. Please enter again: ");
						price=in.nextInt();
					}
					
					System.out.println("Enter author name: ");
					in.nextLine();
					String authorName=in.nextLine();
					System.out.println("Enter book title: ");
					//in.nextLine();
					String title= in.nextLine();
					
					Item newitem= new Book(price,authorName,title);
					shop.addItem(newitem);
				}
				else {
					System.out.println("Enter price for the gift card ");
					int price=in.nextInt();
					while(price<0) {
						System.out.println("Price should be a non negative integer. Please enter again: ");
						price=in.nextInt();
					}
					
					System.out.println("Enter the description of gift card");
					in.nextLine();
					String description=in.nextLine();
					
					System.out.println("Enter the color of giftcard");
					String color= in.nextLine();
					
					Item newitem= new GiftCard(price,description,color);
					shop.addItem(newitem);
				}
				
			}
			else {
				end=true;
			}
		}
	}
}
