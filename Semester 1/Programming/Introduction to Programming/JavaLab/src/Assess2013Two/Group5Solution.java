package Assess2013Two;
import java.util.Scanner;

public class Group5Solution {
	
	public static void main ( String[] args ) 
	{
		int marks = 0, count = 0, largest = 0, smallest = 0, over70 = 0, below40 = 0;
		float validMarks = 0f;
		
		Scanner input = new Scanner ( System.in );
		
		do {
			System.out.print ( "\nPlease enter the mark for student " + (count+1) + ": " );
			marks = input.nextInt();
			
			while ( marks < 0 || marks > 100 )
			{
				System.out.print ( "\nInvalid mark!! Please re-enter mark for student " + (count+1) + ": " );
				marks = input.nextInt();
			}
			
			if ( count == 0 )
			{
				largest = marks;
				smallest = marks;
			} else {
				if ( marks > largest ) { largest = marks; }
				else if ( marks < smallest ) { smallest = marks; }
			}
			
			if ( marks >= 70 ) { over70++; }
			
			if ( marks < 40 ) { below40++; }
			
			validMarks += marks;
				
			
			count++;
			
		} while ( count < 5 );
		
		
		System.out.println ( "\n======================================\r\tProgram Results\r======================================\n" + 
							"\nThe average of the valid marks entered is: " + String.format("%.2f",(validMarks/5)) +
							"\nThe largest valid mark entered is " + largest +
							"\nThe smallest valid mark entered is " + smallest +
							"\nThe percentage of valid marks that were at least 70 is " + (over70*100)/count +	"%" +
							"\nThe number of valid marks that were below 40 is " + below40 );
		
		System.out.println ( "Total percentage: " + (validMarks*100)/(count*100) + "%" );
						
		input.close();
	}
}
