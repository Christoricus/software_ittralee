package Lab9;
import java.util.Scanner;
public class Exercise2 {
	public static void main ( String[] args ) 
	{
		int sum = 0;
		Scanner in = new Scanner( System.in );
		
		System.out.print ( "Please enter the upper limit: " );
		int upLimit = in.nextInt();
		
		while ( upLimit < 0 )
		{
			System.out.print ( "Invalid! Must be positive! Please re-enter the upper limit: " );
			upLimit = in.nextInt();
		}
		
		for( int i = 0; i <= upLimit; i++ )
		{
			sum = sum + i;
		}
		
		System.out.println ( "The upper limit for the first " + upLimit + " integers is: " + sum );
		
		in.close();
	}
}
