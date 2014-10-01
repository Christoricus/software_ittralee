package lab2;

public class Book {
	//Declaring attributes
	private String title;
	private double price;
	private String ISBN;
	private int pages;
	
	//Constructors
	public Book() {
		title = "No Title";
		price = 0.00;
		ISBN = "No ISBN";
		pages = 0;
	}
	
	public Book(String ttl, double prc, String isbn, int pgs) {
		this.title = ttl;
		this.price = prc;
		this.ISBN = isbn;
		this.pages = pgs;
	}
	
	//Accessor methods
	public String getBookTitle() {
		return title;
	}
	
	public double getBookPrice() {
		return price;
	}
	
	public String getBookISBN() {
		return ISBN;
	}
	
	public int getBookPages() {
		return pages;
	}
	
	//Mutator methods
	public void setBookTitle(String ttl) {
		this.title = ttl;
	}
	
	public void setBookPrice(double prc) {
		this.price = prc;
	}
	
	public void setBookISBN(String isbn) {
		this.ISBN = isbn;
	}
	
	public void setBookPages(int pgs) {
		this.pages = pgs;
	}
	
	//Printing out method
	public String toString() {
		String msg = String.format("Book Title: %s\nBook Price: %.2f\nISBN: %s\nPages: %d\n"
									, title, price, ISBN, pages);
		
		return msg;
	}
}
