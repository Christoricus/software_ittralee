package week1;
import java.util.Scanner;

/* This program reads in inches and converts it into feet and inches
 * 
 */

public class Lab1Exercise3 {
	
	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter the total number of inches: " );
		int inches = input.nextInt();
		
		System.out.println( "\n" + inches + "\"" + " is equivalent to " + inches/12 + "'" 
		+ inches%12 + "\"" );
		
		input.close();
	}

}
