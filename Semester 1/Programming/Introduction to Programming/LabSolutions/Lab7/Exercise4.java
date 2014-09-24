//Exercise4.java
/*This program uses a counter controlled while loop to analyse a user-supplied piece of
 *text, character by character, and determine whether this piece of text constitutes a
 *positive whole number*/

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
		{
			String text;
			char character;
			int index=0,digitCount=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();		
			
			while(index < text.length())
				{
					character = text.charAt(index);
					
					if(character >= '0' && character <= '9')
		            	digitCount++;
		            	
		            index++;
				}
		            
	
			if(digitCount == text.length())
				System.out.println("\nYou entered a positive whole number");
			else
				System.out.println("\nYou did not enter a positive whole number");
											
		}		
}


