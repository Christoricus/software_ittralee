//ArithmeticOperatorsWithFormatting.java
/*This program reads in 2 user-supplied numbers and uses the arithmetic operators
 *to perform some calculations on them. It then uses the format() method to display
 *all results to 3 decimal places*/

import java.util.Scanner;

public class ArithmeticOperatorsWithFormatting {
	 public static void main(String args[])
		{
			float firstNumber, secondNumber;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter any number: ");
			firstNumber = input.nextFloat();
			
			System.out.print("Please enter another number: ");
			secondNumber = input.nextFloat();
			
							
			System.out.println("\n\n***********Results of Arithmetic Calculations**********\n\n" +
			     firstNumber + " + " + secondNumber + " is " + String.format("%.3f",(firstNumber + secondNumber)) + "\n" +
			     firstNumber + " - " + secondNumber + " is " + String.format("%.3f",(firstNumber - secondNumber)) + "\n" + 
			     firstNumber + " x " + secondNumber + " is " + String.format("%.3f",(firstNumber * secondNumber)) + "\n" + 
			     firstNumber + " / " + secondNumber + " is " + String.format("%.3f",(firstNumber / secondNumber)) + "\n" + 
			     firstNumber + " % " + secondNumber + " is " + String.format("%.3f",(firstNumber % secondNumber)));
					
			
		}
}