//PS1Ql.java
/*This program calculates the average of 3 user-supplied numbers*/

import java.util.Scanner;

public class PS1Ql {
	public static void main(String args[])
	{
		float num1,num2,num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		num1 = input.nextFloat();
		
		System.out.print("Please enter the second number: ");
		num2 = input.nextFloat();
		
		System.out.print("Please enter the third number: ");
		num3 = input.nextFloat();
		
		System.out.println("\n\nThe average of the 3 numbers you entered is " + String.format("%.3f",(num1+num2+num3)/3));
	}
}