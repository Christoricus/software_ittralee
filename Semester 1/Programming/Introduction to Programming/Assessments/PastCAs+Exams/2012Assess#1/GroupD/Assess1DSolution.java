//Assess1DSolution.java
/*The following program reads in the coordinates of 2 points, ensures that they are valid
 and, if so, determines whether they describe a sqaure or not*/

import java.util.Scanner;

public class Assess1DSolution{
	public static void main(String args[])
		{
			int upperLeftX, upperLeftY,bottomRightX,bottomRightY;
			
			Scanner input = new Scanner(System.in);

			System.out.println("---------------Square Determinator--------------\n\n");

			System.out.print("Please enter the x-coordinate of the upper-left point: ");
			upperLeftX = input.nextInt();
			
			System.out.print("Please enter the y-coordinate of the upper-left point: ");
			upperLeftY = input.nextInt();
			
			System.out.print("Please enter the x-coordinate of the bottom-right point: ");
			bottomRightX = input.nextInt();
			
			System.out.print("Please enter the y-coordinate of the bottom-right point: ");
			bottomRightY = input.nextInt();
		
			
			System.out.println("\n\n");
			
			if (bottomRightX > upperLeftX) 
			    if (bottomRightY < upperLeftY)
			        // if both conditions are true then we have valid points so we can check to see whether they
			        // describe a square
			
			        if (bottomRightX - upperLeftX == upperLeftY - bottomRightY)
			            System.out.print("The rectangle described by these points is a square");
			        else
			            System.out.print("The rectangle described by these points is not a square");
			       
			    else
			        System.out.print("Error! The bottom right y coordinate is invalid ...... quitting program");
			     
			else
			     System.out.print("Error! The bottom right x coordinate is invalid ...... quitting program");
		
	        System.out.println("\n\n");
		}
}

