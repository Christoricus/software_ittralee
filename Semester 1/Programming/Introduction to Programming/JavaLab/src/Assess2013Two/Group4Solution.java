// Nazmul Alam - T00152975
/* This program asks for valid times in HH:MM for 5 times.
 * It makes sure the input is valid.
 * If the input is valid, it stores the result and gives the total valid percentage at the end.
 */

package Assess2013Two;
import java.util.Scanner;

public class Group4Solution {
	
	public static void main ( String[] args )
	{
		int count = 0, validCount = 0;
		String time;

		Scanner input = new Scanner ( System.in );

		do {
			System.out.print ( "\n====== Time Tester - Iteration " + (count+1) + " ======" +
					"\nPlease enter a time value in the form of hh:mm : " );

			time = input.nextLine();

			if ( time.length() == 5 ) 
			{
				if ( ( time.charAt(0) >= '0' && time.charAt(0) <= '1' && time.charAt(1) >= '0' && time.charAt(1) <= '9' ) 
						|| ( time.charAt(0) <= '2' && ( time.charAt(1) >= '0' && time.charAt(1) <= '3' ) ) )
				{
					if ( time.charAt(2) == ':' )
					{
						if ( time.charAt(3) >= '0' && time.charAt(3) <= '5' && time.charAt(4) >= '0' && time.charAt(3) <= '9' )
						{
							
							System.out.println ( "\nYou entered a valid time value." );
							validCount++;
							
						} else
							System.out.println ( "\nInvalid! The minutes part is wrong." );

					} else
						System.out.println ( "\nInvalid! The third character must be a : " );

				} else
					System.out.println ( "\nInvalid! The hours part is wrong." );

			} else 
				System.out.println ( "\nInvalid time value. It must contain exactly 5 characters." );

			count++;

		} while ( count < 5 );

		System.out.println ( "\n\nThe percentage of valid time entered was " + (validCount*100)/5 + "%" );

		input.close();
	}
}
