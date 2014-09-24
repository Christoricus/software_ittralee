/* This program check if the string provided is a positive whole number.
 * Lab 7
 */
package Lab7;
import java.util.Scanner;
public class Exercise4Improved {

	public static void main(String[] args) {
		String sentence = "";
		char character = 'a';
		int index = 0, totIterate = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a piece of text: ");
		sentence = input.nextLine();
		while(index < sentence.length()) {
			 character = sentence.charAt(index);
			 /*Why should you use || instead of &&
			 if(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z' || character == ' ') {
				System.out.println("\nYou did not enter a positive whole number.");
			 	break;
			 }else */
			 if(character >= '0' && character <= '9'){
				totIterate++;
			 }else {
				System.out.println("\nYou did not enter a positive whole number.");
			 	break; 
			 }
			 
			index++;
		}
		
		if(totIterate == sentence.length())
			System.out.println("\nYou entered a positive whole number.");

		input.close();
	}

}
