//NestedIfImproved.java
/*This program uses a nested if statement to make decisions about dividing one number by another
 *It also uses if-else statements to improve on efficiency*/

import java.util.Scanner;

public class NestedIfImproved {
	 public static void main(String args[])
		{
			float number1,number2=-1;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the first number: ");
			number1 = input.nextFloat();
							
			if (number1 != 0)
				{
					System.out.print("Please enter the second number: ");
					number2 = input.nextFloat();
					
					if (number2 != 0)
						System.out.println(number1 + " divided by " + number2 + " is " + (number1/number2));
					else
						System.out.println("The answer must be infinity since anything divided by zero is infinity");
				}		
			else
				System.out.println("The answer must be zero since zero divided by anything (except zero) is zero");
								
		}
}