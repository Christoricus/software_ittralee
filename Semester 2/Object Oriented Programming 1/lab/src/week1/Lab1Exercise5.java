package week1;
import java.util.Scanner;

/* This program reads in user supplied values to calculate the BMI
 * BMI = weight in kilograms/(Height in meters)^2
 */

public class Lab1Exercise5 {
	
	public static void main( String[] args ) {
		
		String weightStatus;
		float weight = 0, height = 0;
		double BMI = 0;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter your weight: " );
		weight = input.nextFloat();
		
		if( weight > 0f ) {
			
			System.out.print( "Please enter your height (in meters): " );
			height = input.nextFloat();
			
			if( height > 0f ) {
				
				BMI = (double) weight/( Math.pow(height, 2) );
				
				if( BMI < 18.5f )
					weightStatus = " so you are underweight.";
				else if( BMI < 24.99f )
					weightStatus = " so you are normal.";
				else if( BMI < 29.99f )
					weightStatus = " so you are overweight.";
				else
					weightStatus = " so you are obese.";
				
				System.out.println( "\nYour BMI is " + BMI + weightStatus );
				
			} else
				System.out.println( "\nInvalid height! quitting program now..." );
			
		} else
			System.out.println( "\nInvalid weight! quitting program now..." );
		
		input.close();
	}

}
