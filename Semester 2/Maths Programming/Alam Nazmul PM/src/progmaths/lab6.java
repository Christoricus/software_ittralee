package progmaths;
import java.util.Scanner;

public class lab6 {
	static Scanner input = new Scanner(System.in);
	
	public static void main( String[] args )
	{
						
		/* ------------------------------------------------------------------------------------------------------------- */
		
		//Finding out the average of two inputs
		
		System.out.print( "\n=============FINDING THE AVERAGE OF 2 INPUTS=============" );
		System.out.println("The average is: " + twoNum() );
						
						//End finding out the average of two inputs
			
		/* ------------------------------------------------------------------------------------------------------------- */
		
						/* I wanted to iterate 5 times. The inputs are 3, 6, 2, 8, 5, which is 24 in total.
						 * The expected output is 4.8
						 */
		System.out.print( "\n=============FINDING THE AVERAGE OF N INPUTS=============" );
		
		double num = 0, average = 0f, total = 0f;

		System.out.print( "\nPlease enter the number of times you want to iterate: " );
		int n = input.nextInt();
			
		for(int i = 1; i <= n; i++ )
		{
			System.out.print( "\nPlease enter a number: " );
			num =  input.nextDouble();
			
			total += num;

		}
		average = total/n;
		
		System.out.println("\nThe average is: " + average );
						//End finding out the n input average
		
		/* ------------------------------------------------------------------------------------------------------------- */
		
						// Finding out the rolling average	
		System.out.print( "\n=============ROLLING NUMBER CALCULATION=============" );
		double rollTotal = 0f;
		int number = 0;
		int i = 1;
		
		do {
					
			System.out.print( "\nPlease enter a rolling number (-1 to exit): " );
			number =  input.nextInt();
			
			
			if( number == -1 ) { break; } 
			rollTotal += number;
			
			System.out.println("\nThe average is: " + rollTotal/i );
			
			i++;
			
		} while( number != -1 );
				
		System.out.println("\n\n===================GOODBYE================" );
						// End finding out the rolling average
		
		/* ------------------------------------------------------------------------------------------------------------- */
	
	}
	
	public static double twoNum()
	{
		double num, total = 0;
		
		for( int i = 1; i <= 2; i++ )  // change the condition if you want to find the average of more inputs
		{
			System.out.print("\nPlease enter number " + i + ": ");
			num = input.nextDouble();
			
			total += num;
		}
		
		return total/2;  // change the condition if you want to find the average of more inputs
	}
	
}
