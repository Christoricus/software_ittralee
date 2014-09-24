package week7;
import java.util.Scanner;

public class PerfectValidationForChoice {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		char choice;
		String choiceAsString;

		do {
			displayMenu();
			System.out.print("\n\nPlease enter your choice: ");
			choiceAsString = input.nextLine().toUpperCase();

			while (!choiceAsString.equals("A") && !choiceAsString.equals("B") 
					&& !choiceAsString.equals("C") )
			{
				System.out.print("\nInvalid! Please re-enter your choice (A-C): ");
				choiceAsString = input.nextLine().toUpperCase();
			}

			choice = choiceAsString.charAt(0);

			switch (choice)
			{
			case 'A':
				cylinderArea();
				break;

			case 'B':
				semicircleArea();
				break;

			case 'C':
				break;
			}

		} while ( !choiceAsString.equalsIgnoreCase("C") );

		System.out.println("\nThank you for using the system. Goodbye!");
	}

	public static void displayMenu()
	{
		System.out.print("\n\n\tA. Find area of Cylinder");
		System.out.print("\n\tB. Find area of Semicircle");
		System.out.print("\n\tC. Quit\n\n\n\n");
	}

	public static void cylinderArea()
	{
		float height, radius;

		//String radiusAsString, heightAsString;

		System.out.print("\n\nPlease enter the radius of the cylinder: ");
		radius = input.nextFloat();

		System.out.print("\n\nPlease enter the height of the cylinder: ");
		height = input.nextFloat();

		System.out.println("\nArea of cylinder is " + String.format( "%.2f m2", 3.14*Math.pow(radius, 2)*height ) );

		System.out.println("\n\nPlease press enter to continue.....");
		input.nextLine();  //space consumed by nextFloat();
		input.nextLine();  //space reserved for ENTER BUTTON


		System.out.println("\n\n\n\n\n");
	}

	public static void semicircleArea()
	{
		float radius;

		System.out.print("\n\nPlease enter the radius of the semicircle: ");
		radius = input.nextFloat();

		System.out.println("\nArea of semicricle is " + String.format( "%.2f m2", 3.14*Math.pow(radius, 2)/2 ) );

		System.out.println("\n\nPlease press enter to continue.....");
		input.nextLine();  //space consumed by nextFloat();
		input.nextLine();  //space reserved for ENTER BUTTON


		System.out.println("\n\n\n\n\n");
	}


}
