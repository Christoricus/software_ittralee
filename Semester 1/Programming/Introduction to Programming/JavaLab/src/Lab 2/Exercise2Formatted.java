/**
 * @(#)Exercise2.java
 *
 *
 * @author 
 * @version 1.00 2013/9/26
 */

public class Exercise2Formatted {
        
    public static void main(String[] args) {
        // TODO code application logic here
        String titleName = "Title:", pageName = "Author:", pageNumber = "Number of Page:", year = "Year Published:", pricing = "Price:";
        String title = "Harry Potter and the Prisoner of Azkaban", author = "J.K. Rowling";
        int pages = 317, yearOfPublication = 1999; 
        float price = 35.50f;
        
        String formatString = String.format("%-45s%-15s\n%-45s%-15s\n%-45s%-15d\n%-45s%-15d\n%-45s%-15.2f", titleName,title,pageName,author,pageNumber,pages,year,yearOfPublication,pricing,price);
        
        
        System.out.println(formatString);
    }
}