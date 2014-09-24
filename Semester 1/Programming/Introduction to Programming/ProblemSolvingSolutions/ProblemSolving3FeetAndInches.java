//ProblemSolving3FeetAndInches.java
/*This program reads in a quantity in inches and converts it to feet and inches*/

import java.util.Scanner;

public class ProblemSolving3FeetAndInches{
	public static void main(String args[])
	{
     int inches,feet,remainingInches;
     
     Scanner input = new Scanner(System.in);

     System.out.print("Please enter an amount in inches: "); //prompt for the original amount of inches
     inches = input.nextInt(); //read in the original amount of inches

     feet = inches/12; // calculate the whole feet (excludes the fractional part)

     remainingInches = inches % 12; // calculate the remaining inches

     System.out.println("\n" + inches + "\" is equivalent to " + feet + "\'" + remainingInches + "\"\n\n\n"); //display the result

				                 		
	}
}

