//PS1Qm.java
/*This program reads in 2 user-supplied integers and calculates the value of the first number divided by
 *the second, expressing the result as a decimal value and a percentage */

import java.util.Scanner;

public class PS1Qm {
	public static void main(String args[])
	{
		int num1,num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Please enter the second number: ");
		num2 = input.nextInt();
			
		System.out.println("\n\nThe value of first number/second number expressed to 2 d.p. is " + 
			               String.format("%.2f",(float)num1/num2) + "\nExpressed as a percentage to the " + 
			               "nearest whole number is " + String.format("%.0f",(float)num1/num2*100) + "%");
	}
}