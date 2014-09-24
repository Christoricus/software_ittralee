//ProblemSolving3ProductOf3Numbers.java
/*Program that reads in 3 user-supplied numbers and determines and displays their product to 3 decimal places*/

import java.util.Scanner;

public class ProblemSolving3ProductOf3Numbers{
	public static void main(String args[])
	{
		float num1,num2,num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a first number: ");
		num1 = input.nextFloat();
		
		System.out.print("Please enter a second number: ");
		num2 = input.nextFloat();
		
		System.out.print("Please enter a third number: ");
		num3 = input.nextFloat();
		
		System.out.printf("\nThe product of the 3 numbers is %.3f\n\n\n",num1*num2*num3);
				                 		
	}
}

