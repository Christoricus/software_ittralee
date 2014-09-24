//Exercise4.java
/*This program calculates the distance traveled by an object using its
 *initial speed, acceleration and the time it has spent traveling*/

import java.util.Scanner;

public class Exercise4 {
	 public static void main(String args[])
		{
			float u,t,a;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("***********Distance Calculator*************\n\n");
			
		    System.out.print("Please enter the initial speed: ");
		    u = input.nextFloat();
		    
		    System.out.print("Please enter the acceleration: ");
		    a = input.nextFloat();
		    
		    System.out.print("Please enter the time spent traveling: ");
		    t = input.nextFloat();		
					
			System.out.println("\n\nThe object traveled a distance of " + 
			String.format("%.2f",u*t + 0.5*a*t*t) + " metres");

		}
}