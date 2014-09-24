package week1;
import java.util.Scanner;

/*This program uses a task-controlled while loop to determine all the perfect numbers that
 *are less than 10000*/

public class Lab2Exercise3 {

	public static void main( String[] args ) {
		
		int sum = 0;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a number: " );
		int num = input.nextInt();
		
		int divisor = 1;
		while( sum < num ) { // sum <= num && divisor <- num/2  also (sum <  num && divisor <= num)
			
			if( num % divisor == 0 ) {
				
				sum += divisor;
				
				/*System.out.println( "Divide " + num + " by " + divisor + " = " + num/divisor 
						+ " sum becomes sum: " + (sum-divisor) + " + div: " + divisor 
						+ " = " + sum ); //*/
						
			}				
			
			divisor++;
		}
		
		if( sum == num ) 
			System.out.println( "\nThis is a perfect number." );
		else
			System.out.println( "\nThis is not a perfect number." );
		
		input.close();
			
	}

}
