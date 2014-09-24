//ProblemSolving3PoundsAndOunces.java
/*This program reads in a quantity in ounces and converts it to pounds and ounces*/

import java.util.Scanner;

public class ProblemSolving3PoundsAndOunces{
	public static void main(String args[])
	{
     int ounces,pounds,remainingOunces;
     
     Scanner input = new Scanner(System.in);

     System.out.print("Please enter an amount in ounces: "); //prompt for the original amount of ounces
     ounces = input.nextInt(); //read in the original amount of ounces

     pounds = ounces/16; // calculate the whole pounds (excludes the fractional part)

     remainingOunces = ounces % 16; // calculate the remaining ounces

     System.out.println("\n" + ounces + "oz is equivalent to " + pounds + "lbs " + remainingOunces + "oz\n\n\n"); //display the result

				                 		
	}
}

