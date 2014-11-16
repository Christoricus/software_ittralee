package lab3;

/* Including static attributes and methods in an instantiable class of your own. You will have written a 
 * class called Book, with attributes title, price, ISBN and number of pages, for Problem 
 * set 2, Q2. Now suppose you want a class to model the books in a uniform series, all of which will
 * have the same price. Make a version of your Book class called SeriesBook, in which the price
 * attribute and all related methods are made static. 
 */
public class SeriesBook {
	private String title;
	private static double price = 5.00;
	private String isbn;
	private int pages;

	public SeriesBook() {
		this("No Title", 0.00, "No ISBN", 0);
	}

	public SeriesBook(String title, double price, String isbn, int pages) {
		setTitle(title);
		setPrice(price);
		setISBN(isbn);
		setPages(pages);
	}

	// Setter
	public void setTitle(String title) {
		this.title = title;
	}

	public static void setPrice(double pr) {
		price = pr;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	// Getter
	public String getTitle() {
		return title;
	}

	public static double getPrice() {
		return price;
	}

	public String getISBN() {
		return isbn;
	}

	public int getPages() {
		return pages;
	}

	// Printing out
	public String toString() {
		return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: "
				+ getISBN() + "\nPages: " + getPages();
	}
}
