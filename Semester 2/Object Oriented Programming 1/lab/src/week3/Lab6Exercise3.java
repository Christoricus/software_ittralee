//Exercise3.java
/*This program uses a pseudocode solution developed in parts (a), (b) and (c) to write
 *a menu-driven program involving user-defined methods*/

package week3;
import java.util.Scanner;

public class Lab6Exercise3 {

	/* Use Scanner
	 * Do { 
	 * Print out the menu
	 * Prompt for choice
	 * Read in choice
	 * - while ( choice < 0 || choice > 4 ) {
	 * - Prompt for choice again.
	 * - Read in choice.
	 * - end while
	 * switch( choice )
	 * -- choice 1
	 * -- Find area of cylinder
	 * -- choice 2
	 * -- Find area of semicircle
	 * -- choice 3
	 * -- Find area of triangle
	 * -- choice 4
	 * -- Quit
	 * } while ( choice != 4 );
	 */

	static
	Scanner input = new Scanner( System.in );

	public static void main( String[] args )
	{
		char choice;


		do {
			
			displayMenu();
			System.out.print( "\n\n\nEnter your choice: " );
			choice = input.nextLine().charAt(0);

			//if( choice == '4' ) { break; }

			while ( choice < '0' || choice > '4' ) {

				System.out.println( "Invalid choice - please choose again" );
				
				displayMenu();
				
				System.out.print( "\n\n\nEnter your choice: " );
				choice = input.nextLine().charAt(0);

			}

			switch( choice ) 
			{
			case '1':
				areaOfCylinder();
				break;

			case '2':
				areaOfSemicircle();
				break;

			case '3':
				areaOfTriangle();
				break;

			case '4':
				quitProgram( choice );
				break;


			}

			if( choice == '4' ) { break; }
			System.out.println( "\nPlease hit enter to continue ...." );
			input.nextLine();
			input.nextLine();

		} while( choice != '4' );

	}
	
	public static void displayMenu()
	{
		String menu = "\n\n\t\t1. Find area of cylinder"
				+ "\n\t\t2. Find area of semicirle"
				+ "\n\t\t3. Find area of triangle"
				+ "\n\t\t4. Quit";
		
		System.out.print( menu );
	}
		
	public static void areaOfCylinder()
	{
		//Pi*Math.pow(r, 2)*h
		final float PI = 3.14f;
		double r, h;

		System.out.print( "\nPlease enter the radius of the cylinder: " );
		r = input.nextDouble();

		System.out.print( "\nPlease enter the height of the cylinder: " );
		h = input.nextDouble();

		double area = PI*Math.pow( r, 2 )*h;

		System.out.println( "\nThe area of cylinder is " + String.format("%.2f", area) + " m2" );

	}

	public static void areaOfSemicircle()
	{
		//(Pi*Math.pow(r, 2))/2;
		final float PI = 3.14f;
		double r;

		System.out.print( "\nPlease enter the radius of the semicircle: " );
		r = input.nextDouble();

		double area = ( PI*Math.pow( r, 2 ) )/2f;

		System.out.println( "\nThe area of semicircle is " + String.format("%.2f", area) + " m2" );

	}

	public static void areaOfTriangle()
	{
		//(b*h)/2;
		double b, h;

		System.out.print( "\nPlease enter the length of the triangle: " );
		b = input.nextDouble();

		System.out.print( "\nPlease enter the height of the triangle: " );
		h = input.nextDouble();

		double area = ( b*h )/2f;

		System.out.println( "\nThe area of semicircle is " + String.format("%.2f", area) + " m2" );

	}

	public static boolean quitProgram( char ch )
	{
		boolean quit = false;

		if( ch == '4' ) { quit = true; }
		System.out.println( "\nThanks for using the system...goodbye" );

		return quit;
	}


}
