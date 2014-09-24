package Lab9;
import java.util.Scanner;
public class Exercise3 {
	public static void main ( String[] args )
	{
		int times = 0;
		Scanner in = new Scanner ( System.in );
		System.out.print ( "What number do you wish to display for the times-table for? " );
		int timesTable = in.nextInt();


		while ( timesTable < 1 || timesTable > 12 )
		{
			System.out.print ( "Invalid! You must enter a value from 1-12. Please re-enter: " );
			timesTable = in.nextInt();
		}
		
		System.out.print("\n=====The " + timesTable + " times table=====\n\n");
		for ( int i = 0; i <= 12; i++ )
		{
			times = timesTable*i;

			System.out.println( timesTable + " times " + i + " is " + times );

		}
		in.close();
	}
}
