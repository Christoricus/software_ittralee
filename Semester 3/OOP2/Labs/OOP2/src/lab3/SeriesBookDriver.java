package lab3;

/* Write a driver for SeriesBook which creates
 * some books, sets the standard book price, outputs their details, changes the standard book price
 * and displays it, then outputs the details of the books again.
 */
public class SeriesBookDriver {
	public static void main(String[] args) {
		SeriesBook java = new SeriesBook();
		SeriesBook php = new SeriesBook();
		SeriesBook.setPrice(12.99);

		java.setTitle("Big Java");
		php.setTitle("PHP & MySQL");
		
		java.setISBN("978-3-16-148410-0");
		php.setISBN("99921-58-10-7");
		
		java.setPages(450);
		php.setPages(230);
		
		System.out.println(java.toString());
		System.out.println("\n" + php.toString());
		
		//Changing the standard book price
		SeriesBook.setPrice(9.99);
		System.out.print("\nBook price after changing the standard price: \n");
		System.out.println(java.toString());
		System.out.println("\n" + php.toString());
	}
}
