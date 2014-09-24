//Exercise1.java
/*This program uses a user-defined method to determine the period of a pendulum*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			double length;

			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the length of the pendulum: ");
			length = input.nextDouble();
			
			System.out.println("\nThe period of the pendulum is " + 
				                String.format("%.3f",periodCalculator(length)) + " seconds");										

		}

	public static double periodCalculator(double l)
		{
			final double g = 9.8;
			
			return 2*Math.PI*Math.sqrt(l/g);	
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		