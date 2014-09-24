package week7;
import java.util.Scanner;

public class Lab9Exercise1 {

	private static Scanner input = new Scanner(System.in);

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

		System.out.println("\n\tThank you for using the system. Goodbye!");
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

		String radiusAsString, heightAsString;

		System.out.print("\n\nPlease enter the radius of the cylinder: ");
		radiusAsString = input.nextLine();	
		radiusAsString = validFloat(radiusAsString);	
		radius = Float.parseFloat(radiusAsString);

		System.out.print("\n\nPlease enter the height of the cylinder: ");
		heightAsString = input.nextLine();
		heightAsString =  validFloat(heightAsString);
		height = Float.parseFloat(heightAsString);

		System.out.println("\nArea of cylinder is " + String.format( "%.2f m2", 3.14*Math.pow(radius, 2)*height ) );

		System.out.println("\n\nPlease press enter to continue.....");
		//input.nextLine();  //not required twice because nextLine() is already used
		input.nextLine();  //space reserved for ENTER BUTTON


		System.out.println("\n\n\n\n\n");
	}

	public static void semicircleArea()
	{
		float radius;
		String radiusAsString;
		
		System.out.print("\n\nPlease enter the radius of the semicircle: ");
		radiusAsString = input.nextLine();
		radiusAsString = validFloat(radiusAsString);
		radius = Float.parseFloat(radiusAsString);

		System.out.println("\nArea of semicricle is " + String.format( "%.2f m2", 3.14*Math.pow(radius, 2)/2 ) );

		System.out.println("\n\nPlease press enter to continue.....");
		//input.nextLine(); //not required twice because nextLine() is already used
		input.nextLine();  //space reserved for ENTER BUTTON


		System.out.println("\n\n\n\n\n");
	}

	public static String validFloat(String s)
	{
		boolean valid = false;
		int numOfDots = 0, i;
		//float radius = 0;
		double radiusAsDouble = 0;

		while (!valid)
		{
			for (i = 0; i < s.length(); i++ )
			{
				if ( !Character.isDigit( s.charAt(i) ) && s.charAt(i) != '.'
						|| numOfDots > 1 )
					break;

				else if ( s.charAt(i) == '.' )
					numOfDots++;
			}

			if (i == s.length() && i != 0 && !s.equals(".") )
			{
				radiusAsDouble = Double.parseDouble(s);

				if (radiusAsDouble >= Float.MIN_VALUE && radiusAsDouble <= Float.MAX_VALUE )
				{
					valid = true;
					//radius = (float) radiusAsDouble;

				} else {
					System.out.print("\n\nInvalid! Please re-enter: " );
					s = input.nextLine();
				}

			} else {
				System.out.print("\n\nInvalid! Please re-enter: " );
				s = input.nextLine();
			}

			numOfDots = 0;   //resetting the number of dots to 0 for next iteration
		}
		//end while

		return s;

	}

}
