package week3;
import java.util.Scanner;

/* This program uses user-defined method called findAverage() to determine the 
 * average of 3 user-supplied values.
 */
public class AverageMethod {
	
	public static void main( String[] args ) 
	{
		double number1, number2, number3;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a first number: " );
		number1 = input.nextDouble();
		
		System.out.print( "Please enter a second number: " );
		number2 = input.nextDouble();
		
		System.out.print( "Please enter a third number: " );
		number3 = input.nextDouble();
		
		System.out.println( "\nThe average of three numbers you entered is: "
				+ String.format( "%.3f", findAverage( number1, number2, number3 ) ) );
		
		input.close();
	}
	
	public static double findAverage( double a, double b, double c )
	{
		return (a+b+c)/3;
	}

}
