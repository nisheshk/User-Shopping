/**
 * @author Nishesh
 * Date: 15th Jan 2020
 * 
 */

package lab1;

public class Book extends Item{
	private String authorName,title; 
	
	
	//Creating a parameterized constructor to initialize author name and title
	public Book(int price, String autName, String Title) {
		super(price);
		authorName=autName;
		title=Title;
	}
	
	// Displays information about the book
	@Override
	public void display() {
		super.display();
		System.out.println(", Item Type: Book, AuthorName: "+authorName +", title: "+title);
	}
	
}
