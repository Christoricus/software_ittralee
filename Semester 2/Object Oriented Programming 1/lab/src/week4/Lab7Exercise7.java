//Exercise7.java
/*This program uses a user-defined method to return the last 3 characters contained in a
 *piece of user-supplied text*/

package week4;

import java.util.Scanner;

public class Lab7Exercise7 {
	public static void main(String args[])
	{	
		String text;

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a piece of text: ");
		text = input.nextLine();

		String result = last3Characters(text);

		if(result.equals(""))
			System.out.println("\nInvalid! What you entered contains fewer than 3 characters");
		else
			System.out.println("\nThe last 3 characters in the text you entered is \"" + result + "\"");
		
		input.close();
	}

	public static String last3Characters(String txt)
	{
		String last3 = "";

		if(txt.length()<3)
			return "";

		last3 += txt.charAt(txt.length()-3) + "" + txt.charAt(txt.length()-2) + "" + txt.charAt(txt.length()-1);

		return last3;
	}

}