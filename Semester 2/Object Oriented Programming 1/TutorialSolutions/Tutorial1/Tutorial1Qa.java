//TutorialQa.java
/*A program which calculates the area of a circle*/

import java.util.Scanner;

public class Tutorial1Qa {

	public static void main(String args[]) 	
	{
		float radius;
		final float PI = 3.142f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the radius of the circle: ");
		radius = input.nextFloat();
		
		System.out.println("\nThe area of the circle is " + String.format("%.3f",PI*radius*radius));
	}
}