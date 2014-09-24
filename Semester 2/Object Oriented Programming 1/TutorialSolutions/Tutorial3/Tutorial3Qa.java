//Tutorial3Qa.java
/*A program that uses a user-defined method called squareArea() to calculate the area
 *of a square whose side is supplied by the user*/

import java.util.Scanner;

public class Tutorial3Qa {
	public static void main(String args[]) 	
	{
		float sideLength;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length of the square's side: ");
		sideLength = input.nextFloat();

		System.out.printf("\n\nThe area of the square is %.3f sq m\n\n",squareArea(sideLength));
		
	}
	
	public static float squareArea(float side)
	{
		return side*side;
	}
}