//Exercise3.java
/*This program uses a pseudocode solution developed in parts (a), (b) and (c) to write
 *a menu-driven program involving user-defined methods*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			
			int choice;
			Scanner input = new Scanner(System.in);

		    do {
				 displayMenu();
				 System.out.print("\n\n\nEnter your choice: ");
				 choice = input.nextInt();
			
				 switch (choice)
				 {
				     case 1:
							cylinderArea();
							break;
				     case 2:
							semicircleArea();
							break;
				     case 3:
							triangleArea();
							break;
				     case 4:
							break;
				     default:
							System.out.print("Invalid choice -- please choose again\n");
				 }
		    } while (choice != 4);
		    System.out.println("\n\nThanks for using the system - goodbye!\n\n");
		}

	public static void displayMenu()
		{
			System.out.print("\n\n\n\t1. Find area of cylinder");
			System.out.print("\n\t2. Find area of semicircle");
			System.out.print("\n\t3. Find area of triangle");
			System.out.print("\n\t4. Quit \n\n\n\n\n\n\n\n");	
		}

	public static void cylinderArea()
		{
			float radius,height;
			Scanner input = new Scanner(System.in);
			System.out.print("\n\nPlease enter the radius of the cylinder: ");
			radius = input.nextFloat();
			System.out.print("\nPlease enter the height of the cylinder: ");
			height = input.nextFloat();
			System.out.println("\nArea of cylinder is " + String.format("%.2f m2",3.14*radius*radius*height));
			
			/*The following code is added to "clear" the output window for each new
			 *iteration of the loop - its the best we can do to make sure the output
			 *is not cluttered - Java does not have any clear screen method*/
 
			System.out.println("\n\nPlease hit return to continue ...... ");
			input.nextLine(); //consumes the \n ignored by nextInt()
			input.nextLine(); //consumes the <CR> entered by the user
			System.out.println("\n\n\n\n\n\n");
		}

	public static void semicircleArea()
		{
			float radius;
			Scanner input = new Scanner(System.in);
			System.out.print("\n\nPlease enter the radius of the semicircle: ");
			radius = input.nextFloat();
			System.out.println("\nArea of semicircle is " + String.format("%.2f m2",3.14*radius*radius/2));
			
			System.out.println("\n\nPlease hit return to continue ...... ");
			input.nextLine();
			input.nextLine();
			System.out.println("\n\n\n\n\n\n");
		}

	public static void triangleArea()
		{
			float base,height;
			Scanner input = new Scanner(System.in);
			System.out.print("\n\nPlease enter the base length of the triangle: ");
			base = input.nextFloat();
			System.out.print("\nPlease enter the height of the triangle: ");
			height = input.nextFloat();
			System.out.println("\nArea of triangle is " + String.format("%.2f m2",base*height/2));
			
			System.out.println("\n\nPlease hit return to continue ...... ");
			input.nextLine();
			input.nextLine();
			System.out.println("\n\n\n\n\n\n");
		}
}			
			
			
			
			
			
			
			
			
			
			
			
		