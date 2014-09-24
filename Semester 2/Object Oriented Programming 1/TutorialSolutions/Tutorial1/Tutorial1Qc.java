//TutorialQc.java
/*A program reads in 2 numbers and determines a number of things about them*/

import java.util.Scanner;

public class Tutorial1Qc {

	public static void main(String args[]) 	
	{
		float number1,number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		number1 = input.nextFloat();
		
		System.out.print("Please enter the second number: ");
		number2 = input.nextFloat();
		
		System.out.println("\n\n");
		
		if(number1==number2)
			System.out.println("The numbers are equal");
		else if(number1<number2)
			System.out.println("The first number is less than the second number");
	    else
	    	System.out.println("The first number is greater than the second number");
	    	
	    	
	    if(number1%number2==0)
	    	System.out.println("The first number is exactly divisible by the second number");
	    else
	    	System.out.println("The first number is not exactly divisible by the second number");
	    	
	    	
	    if((int)number1 == (int)number2)
	    	System.out.println("The numbers have the same whole part");
	    else
	    	System.out.println("The numbers do not have the same whole part");
	    	
	    	
	    if(number1<0 && number2<0)
	    	System.out.println("Both numbers are negative");
	    else if(number1<0 || number2<0)
	    	System.out.println("One of the numbers is negative");
	    else
	    	System.out.println("Neither number is negative");
	    	
		
	}
}