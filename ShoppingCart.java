/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

import java.util.*;

public class ShoppingCart {
	private ArrayList<Item> itemSelected; // Stores the list of items in the cart
	
	ShoppingCart(){
		itemSelected= new ArrayList<Item>();
	}
	
	// Adds an item to the cart
	public void addItem(Item item) {
		itemSelected.add(item);
	}
	
	// Displays item in the cart in ascending order of price
	public void displayItem() {
		Collections.sort(itemSelected,new Comparator<Item>() {
			public int compare(Item item1, Item item2) {
				return Integer.compare(item1.getPrice(), item2.getPrice());
			}
		});
		System.out.println("Cart Items");
		for(Item item: itemSelected) {
			item.display();
		}
		if(itemSelected.size()==0) System.out.println("Cart Empty!");
	}
	
}
