package week3;
import java.util.Scanner;

/* This program asks for two user-supplied numbers to determine the smaller of the two.
 * If both of them are equal, return any.
 */

public class Lab5Exercise1 {
	
	public static double minimum( double a, double b )
	{
		if( a <= b ) { return a; } 
		else { return b; }
	}
	
	public static void main( String[] args )
	{
		double num1, num2;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter number one: " );
		num1 = input.nextDouble();
		
		System.out.print( "Please enter number two: " );
		num2 = input.nextDouble();
		
		System.out.println( "\nThe smaller of the 2 numbers you entered is " 
				+ minimum( num1, num2 ) );
		
		input.close();
	}
	

}
