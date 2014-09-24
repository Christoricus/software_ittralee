//Exercise2.java
/*This program reads in the radius and height of a cylinder and uses these to
 *determine its volume*/

import java.util.Scanner;

public class Exercise2 {
	 public static void main(String args[])
		{
			float radius, height;
			final float PI = 3.142f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the radius of the cylinder: ");
			radius = input.nextFloat();
			
			System.out.print("Please enter the height of the cylinder: ");
			height = input.nextFloat();
					
							
			System.out.println("\n\n=====Calculation Result===== " + 
			                   "\n\nVolume of cylinder is " + String.format("%.2f",(PI*radius*radius*height)) +
			                   " metres squared");

			
		}
}