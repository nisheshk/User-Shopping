/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;
abstract class Item {
	private int id; // stores id of an item
	private int price; // stores price of an item
	private static int uniqueIdGenerator=0; // stores last id assigned
	
	public Item(int p) {
		uniqueIdGenerator++;
		id=uniqueIdGenerator;
		price=p;
	}
	// return price of an item
	public int getPrice() {
		return price;
	}
	// return id of an item
	public int getID() {
		return id;
	}
	// displays item information
	public void display() {
		System.out.print("ID no: "+id +", price: "+price+" ");
	}
}
