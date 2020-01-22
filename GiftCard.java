/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;
public class GiftCard extends Item{
	private String description, color; // Stores Gift card description and colour respectively
	
	public GiftCard(int price, String des, String col) {
		super(price);
		description=des;
		color=col;
	}
	
	// Displays Gift Card's Information
	@Override
	public void display() {
		super.display();
		System.out.println(", Item Type: GiftCard, Description: "+description+", color: "+color);
	}
}
