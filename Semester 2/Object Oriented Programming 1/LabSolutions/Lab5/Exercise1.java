//Exercise1.java
/*This program uses a user-defined method called minimum() to determine the smaller of
 *2 user-supplied float values*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			float number1,number2;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a first number: ");
			number1 = input.nextFloat();
			
			System.out.print("Please enter a second number: ");
			number2 = input.nextFloat();
			
				
			System.out.println("\n\nThe smaller of the 2 numbers you entered is " +
			                   minimum(number1,number2) + "\n\n");
		}
		
	public static float minimum(float a, float b)
		{
			float minimum = a;
			
			if(b < a)
				minimum = b;
		
			return minimum;
		}			
}


