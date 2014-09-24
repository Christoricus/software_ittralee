//Exercise2Formatted.java
/*This program declares variables of different types for storing the details of a
 *book - it uses the format() method to format the output*/

public class Exercise2Formatted {
	 public static void main(String args[])
		{
			String title = "Harry Potter and the Prisoner of Azkaban",author = "J.K. Rowling";
			int pages = 317,yearPublished = 1999;
			float price = 35.50f;
			
			String formatString = String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%d\n%-20sEUR%.2f\n",
			                      "Title: ",title,"Author: ",author,"Number of Pages: ",pages,
			                      "Year Published: ",yearPublished,"Price: ",price);
		    
		    System.out.println(formatString);
			
		}
}