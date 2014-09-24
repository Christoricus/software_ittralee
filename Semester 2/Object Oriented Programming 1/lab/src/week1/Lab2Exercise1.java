package week1;
import java.util.Scanner;

/* This program reads in user-supplied (positive whole) numbers in an arbitrary amount of times.
 * It should exit the while-loop by entering -1
 * The program should count the number of times the program ran, the odd numbers
 * and numbers above 100.
 */

public class Lab2Exercise1 {
	
	public static void main( String[] args ) {
		
		int num = 0, count = 0, odd = 0, over100 = 0, average = 0, totalNum = 0;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a first +ve whole number (-1 to exit): " );
		num = input.nextInt();
		
		while( num != -1 ) {
			count++;
			
			totalNum += num;
			
			if( num % 2 == 1 ) { odd++; }
			
			if( num > 100 ) { over100++; }
			
			System.out.print( "Please enter the next +ve whole number (-1 to exit): " );
			num = input.nextInt();
			

			
		}
		
		average = totalNum/count;
		
		System.out.println( "\n===========Results==========="
				+ "\n\nNumber of values entered: " + count 
				+ "\nNumber of odd values entered: " + odd
				+ "\nNumber ov values > 100 entered: " + over100
				+ "\nAverage of the values entered: " + average );
		
		input.close();	
	}

}
