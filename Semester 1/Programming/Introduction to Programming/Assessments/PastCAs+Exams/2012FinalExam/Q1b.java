//Q1b.java
/*This program determines the period of a pendulum*/

import java.util.Scanner;

public class Q1b{
	public static void main(String args[])
		{
			final float PI = 3.142f, g = 9.8f;
			float length;
			double period; //must be double as Math.pow() returns a double answer
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("==========Pendulum Period Calculator==========\n\n" +
				"Please enter the length of the pendulum: ");
				
			length = input.nextFloat();
			
			period = 2*PI*Math.pow(length/g,0.5f);
			
			System.out.println("\nThe period of oscillation of the pendulum is " + String.format("%.4f",period) + " seconds");
			                   
		}
}

