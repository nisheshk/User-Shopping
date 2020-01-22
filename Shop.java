/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

import java.util.*;
public class Shop {
	private ArrayList<Item> itemList; // Stores list of items available in the shop
	public Shop(){
		itemList=new ArrayList<Item>();
	}
	
	// adds an item to the shop
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	// Displays available items in the shop in ascending order of the prices
	public void displayItems() {
		Collections.sort(itemList,new Comparator<Item>() {
			public int compare(Item item1, Item item2) {
				return Integer.compare(item1.getPrice(), item2.getPrice());
			}
		});
		System.out.println("Shop Items");
		for(Item item: itemList) {
			item.display();
		}
		if(itemList.size()==0) System.out.println("No items in the shop");
	}
	
	public Item returnItem(int id) {
		Item item=null;
		for(Item i:itemList) {
			if(i.getID()==id) {
				item=i;break;
			}
		}
		return item;
	}
}
