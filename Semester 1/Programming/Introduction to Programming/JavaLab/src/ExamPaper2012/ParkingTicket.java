package ExamPaper2012;

import java.util.Scanner;
public class ParkingTicket {

	public static void main( String[] args )
	{
		final double ONE_HR = 0.60f, NXT_2 = 0.50f, MORE = 0.40f;
		double cost;

		Scanner input = new Scanner( System.in );

		System.out.print( "Please enter the amount of time in hours you spent parking: ");
		double hours = input.nextDouble();

		if( hours >= 0 )
		{
			if( hours <= 1 ) { cost = hours*ONE_HR; } 

			else if( hours <= 3 ) { cost = ONE_HR + (hours-1)*NXT_2; }

			else { cost = ONE_HR + NXT_2*2 + (hours-3)*MORE; }
			
			System.out.printf( "\nTotal cost of parking for %.2f hours is EUR%.2f",hours,cost);


		} else
			System.out.println( "\nError: you have entered an invalid time value ... exiting program");
		
		input.close();
	}
}


