package lab2;

public class BookDriver {
	public static void main(String[] args) {
		Book maths = new Book();
		Book english = new Book("Shakespeare", 12.09, "123S1515SD", 240);
		
		maths.setBookTitle("Javac");
		maths.setBookPages(541);
		maths.setBookISBN("oowowowoowoow");
		maths.setBookPrice(30.85);
		
		System.out.println(maths.toString()); //<< calling the empty object ~ Prints the default values
		System.out.println(english.toString()); // << calling the filled object
	}

}
