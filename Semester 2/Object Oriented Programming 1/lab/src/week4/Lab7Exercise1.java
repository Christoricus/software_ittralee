package week4;
import java.util.Scanner;

public class Lab7Exercise1 {
	
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter the lenght of the pendulum: " );
		double length = input.nextDouble();
		
		System.out.println( "\nThe period of the calculator is " + String.format( "%.3f"
				, periodCalculator( length ) ) + " seconds" );
		
		input.close();
	}
	
	public static double periodCalculator( double l )
	{
		final double G = 9.8d;
		
		double T = 2*Math.PI*( Math.sqrt( l/G ) );
		
		return T;
	}
		
		
}
