//Exercise4.java
/*This program asks the user to supply a piece of text and then a for loop is used
 *to help determine whether the text constitutes a binary number*/

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
		{
			String text;
			char character;
			int i;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();

			for(i=0;i<text.length();i++)
				{
				   	character = text.charAt(i);
				   	
				   	if(character != '0' && character != '1')
				   		break;  		
				}
				
			if(i == text.length())		
				System.out.println("\nYou entered a binary number");
			else
				System.out.println("\nYou did not enter a binary number");													
		}		
}


