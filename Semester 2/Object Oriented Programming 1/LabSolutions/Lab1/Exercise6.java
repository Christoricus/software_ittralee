//Exercise6.java
/*This program reads in a word from the user and checks to ensure it contains exactly 9 characters.
 *If it does it then processes the word to see whether it is a palindrome*/
 
import java.util.Scanner;

public class Exercise6 {
	 public static void main(String args[])
		{
			String word;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a word 9 characters long: ");
			word = input.nextLine();
			
			if(word.length()!=9)
				System.out.println("\nInvalid word! Quitting program now...");
			else
				{
					if(word.charAt(0)==word.charAt(8) && word.charAt(1) == word.charAt(7) &&
					   word.charAt(2)==word.charAt(6) && word.charAt(3) == word.charAt(5))
					     System.out.println("\nThe word you entered is a palindrome");
				    else
				    	 System.out.println("\nThe word you entered is not a palindrome");
						
				}			               	
				               
		}
}