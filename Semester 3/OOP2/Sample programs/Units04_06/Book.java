/** class to model a book
 */
public class Book{
	private String title;
	private String isbn;
	private double price;
	
	public void setTitle(String title){
		this.title = title;
	}
	/** sets the ISBN number
	 *@param isbn the ISBN must be 10 or 13 chars long
	 */
	public void setIsbn(String isbn){
		if (isbn.length() == 10 || isbn.length() == 13)
			this.isbn = isbn;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	
	public Book(String title){
		this.title = title;
	}
	
	public Book(String title, String isbn){
		this.title = title;
		this.isbn = isbn;
	}
	
	public Book(String title, String isbn, double price){
		setTitle(title);
		setIsbn(isbn);
		setPrice(price);
	}
	
	public Book() {
		this("Title Unknown","0000000000",0.0);
	}
	
	public String toString() {
		return title + " " + " ISBN: " + isbn + " Price: " + price;
	}
}