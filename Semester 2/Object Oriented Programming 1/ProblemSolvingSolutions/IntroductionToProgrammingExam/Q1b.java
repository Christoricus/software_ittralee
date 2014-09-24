//Q1b.java
/*This program calculates and displays the surface area of a cylinder based on user-supplied
 *radius and height values*/

import java.util.Scanner;

public class Q1b {
	public static void main(String args[])
		{					
			float radius,height,surfaceArea;
			final float PI = 3.142f;
			
			Scanner input = new Scanner(System.in);
				
			System.out.print("Please enter the radius of the cylinder: ");
			radius = input.nextFloat();
			
			System.out.print("Please enter the height of the cylinder: ");
			height = input.nextFloat();
			
			surfaceArea = 2*PI*radius*radius + 2*PI*radius*height;
			
			System.out.println("\n\nThe surface area of the cylinder is " + String.format("%.3f",surfaceArea) + 
				               "m" + (char)253);	
		 }
}	



