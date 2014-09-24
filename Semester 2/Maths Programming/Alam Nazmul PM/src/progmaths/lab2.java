package progmaths;
import java.util.Scanner;

public class lab2 {

	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter numerator: " );
		int n = input.nextInt();
		
		System.out.print( "Please enter denominator: " );
		int d = input.nextInt();
		
		System.out.print( "\nFloat point representation " );
		//float f = (float) n/d;
		float f = 100_000f + (float) n/d;
		
		
		//String method
		System.out.print( String.format( "%.25f", f ) );
		
		//float total = 0;
		float total = 0; 
		
		//Loop method
		for ( int i = 0; i < d * 1000; i++ )
		{
			total += f;
		}
		
		//Calculating 100_000 + f & 100_000 + f/10_000
		/*
				+ "\nExpected Value : " + (100_000D + f) * (d*1000) // 100000 + f
				+ "\nApprox. individual error is " + ( ( total - ( n*1000 ) )/( d * 1000 ) )
				
				+ "\n\nThe measure of the error is: " + (total - (n*1000)));
		 */
		
		//Calculating other numbers
		System.out.println( "\n\nTotal is : " + total 
				+ "\nExpected Value : " + (n*1000) 
				+ "\nApprox. individual error is " + ( ( total - ( n*1000 ) )/( d * 1000 ) )
				
				+ "\n\nThe measure of the error is: " + (total - (n*1000)));
		
		
		input.close();

	}

}
