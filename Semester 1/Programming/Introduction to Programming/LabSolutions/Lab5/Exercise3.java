//Exercise3.java
/*This program deals with creating a menu-based scenario using a 
switch statement*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			int choice;
			float radius;
			
			final float PI = 3.142f;
			
			Scanner input = new Scanner(System.in);
				
			String menu = "\t\t\t1.Calculate the area of a circle " +
			"\n\t\t\t2.Calculate the volume of a sphere\n\t\t\t" +
			"3.Quit\n\n\nPlease enter your choice (1-3): ";
				
			System.out.print(menu);
				
			choice = input.nextInt();
							
			switch(choice)
				{
					case 1:
					       System.out.print("\n\nPlease enter the radius of the circle: ");
					       radius = input.nextFloat();
						   System.out.println("\nThe area of the circle is " +
						   String.format("%.3f metres squared",PI*radius*radius)); 	   
						   break;
					case 2:
						   System.out.print("\n\nPlease enter the radius of the sphere: ");
					       radius = input.nextFloat();
						   System.out.println("\nThe volume of the sphere is " +
						   String.format("%.3f metres cubed",4f/3*PI*radius*radius*radius));
						   break;
					case 3:
						   System.out.print("\n\nThanks for using the system. Goodbye!\n");
					       break;
					default:
					       System.out.print("\n\nSorry - you must have entered " +
					       "an invalid choice - must be between 1 and 3\n");
				  }
			}
			
}


