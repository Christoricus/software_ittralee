//Tutorial6Qa.java
/*A program that reads an arbitrary number of positive integers, terminated by -1 and
 *displays the values entered back to the user*/

import java.util.Scanner;

public class Tutorial6Qa {
	public static void main(String args[]) 	
	{
		String allNumbers = "";
		int number;
		
		Scanner input = new Scanner(System.in);
			
		do {		
			 System.out.print("Please enter a positive integer number (-1 to exit): ");
			 number = input.nextInt();
			 
			 if(number!=-1)
			 	allNumbers += number + " ";
						
		}while(number!=-1);
		
		System.out.println("\n\nThe numbers you entered were: " + allNumbers);
		
	}
}