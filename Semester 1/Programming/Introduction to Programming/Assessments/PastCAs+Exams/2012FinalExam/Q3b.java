//Q3b.java
/*This program asks the user to supply a piece of text and then a do-while loop is used
 *to help determine whether the text constitutes a binary number*/

import java.util.Scanner;

public class Q3b {
	public static void main(String args[])
		{
			String text;
			char character;
			int i=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();

			do{
				  character = text.charAt(i);
				   	
				  if(character != '0' && character != '1')
				   	break;
				   	
				  i++;	
			}while(i<text.length());
				
			if(i == text.length())		
				System.out.println("\nYou entered a binary number");
			else
				System.out.println("\nYou did not enter a binary number");													
		}		
}

