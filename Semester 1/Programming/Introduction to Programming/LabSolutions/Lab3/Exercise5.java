//Exercise5.java
/*This program determines the gravitational force exerted on one object by another*/

import java.util.Scanner;

public class Exercise5 {
	 public static void main(String args[])
		{
			float mass1, mass2;
			int distance;
			final float G = 6.67300E-11f;
			
			Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter the mass in kg of the first object: ");
			mass1 = input.nextFloat();
			
		    System.out.print("Please enter the mass in kg of the second object: ");
		    mass2 = input.nextFloat();
			
			System.out.print("Please enter the distance in " +
			"metres between the objects: ");
						
			distance = input.nextInt();
						
			System.out.println("\n\n******Results of Program******\n\nThe mass " +
			"of the first object is " + mass1 + " kg" + "\nThe mass of the second object is" +
			" " + mass2 + " kg\nThe distance between the two objects is " + distance + " m" +
			"\nThe force exerted on the objects is " + String.format("%.2f",G*mass1*mass2/
			(distance*distance)) + " N");
							
		}
}