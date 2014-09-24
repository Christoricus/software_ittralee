//Exercise2.java
/*This program asks the user to enter a single keyboard character and determines whether
 *it is a lowercase letter, an uppercase letter, a digit or none of these */

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{
			char character;
			String characterAsString;
			
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter a keyboard character: ");
            characterAsString = input.nextLine();
            
            character = characterAsString.charAt(0);
            
			if(character >= '0' && character <= '9')
				System.out.println("\nYou entered a digit");
			else if(character >= 'A' && character <= 'Z')
				System.out.println("\nYou entered an uppercase letter");
			else if(character >= 'a' && character <= 'z')
				System.out.println("\nYou entered a lowercase letter");
			else
				System.out.println("\nYou entered neither a letter nor a digit");
		}

}


