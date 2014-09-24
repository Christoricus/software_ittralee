package week1;
import java.util.Scanner;

/* This program asks for a word with exactly 9 characters in length.
 * If the word passes the initial test it should check whether the word is a palindrome or not.
 * charAt() SHOULD BE USED.
 */

public class Lab1Exercise6 {
	
	public static void main( String[] args ) {
		
		String word;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a word 9 characters long: " );
		word = input.nextLine();
		
		word = word.toLowerCase(); //Converting to lower case
		
		if( word.length() == 9 ) {
			
			if( word.charAt(0) == word.charAt(8) && word.charAt(1) == word.charAt(7) && word.charAt(2) == word.charAt(6) && word.charAt(3) == word.charAt(5)
					&& word.charAt(4) >= 'a' && word.charAt(4) <= 'z' ) {
				
				System.out.println( "\nThe word you entered is a palindrome!" );
				
			} else
				System.out.println( "\nThe word you entered is not a palindrome! " );
			
		} else
			System.out.println( "\nInvalid word! Quitting program now..." );
		
		input.close();
	
	}

}
