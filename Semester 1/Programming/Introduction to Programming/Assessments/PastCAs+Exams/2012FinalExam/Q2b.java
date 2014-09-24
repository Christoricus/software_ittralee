//Q2b.java
/*The following program takes in the first name and surname of the user
 coverts them to lowercase and then validates the first character of each
 to ensure they are lowercase letters. If so, it then displays the initials of
 the user, if not an appropriate error message is displayed*/

import java.util.Scanner;

public class Q2b{
	public static void main(String args[])
		{
			String firstname,surname;
			char firstnameInitial,surnameInitial;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your first name: ");
			firstname = input.nextLine();
			
			System.out.print("Please enter your surname: ");
			surname = input.nextLine();

			firstname = firstname.toLowerCase();
			surname = surname.toLowerCase();
			
			firstnameInitial = firstname.charAt(0);
			surnameInitial = surname.charAt(0);


			if (firstnameInitial>='a' && firstnameInitial<='z' && 
			   surnameInitial>='a' && surnameInitial<='z')
			       System.out.println("\nYour initials are "  + firstnameInitial + "." + surnameInitial + ".");
			else
			   	   System.out.println("\nEither the initial of your first name or surname (or both) are invalid!");


		}
}

