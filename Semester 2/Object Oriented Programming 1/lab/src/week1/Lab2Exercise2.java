package week1;
import java.util.Scanner;

/* This program asks the user to supply the T-Number for a student.
 * Firstly, it should validate if it's exactly 10 characters.
 * If it passes the initial test, it should do further validation.
 * a) The first character should start with 'T' or 't'.
 * b) All other characters are digits.
 */

public class Lab2Exercise2 {
	
	public static void main( String[] args ) {
		
		String tNumber;
		char ch;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter the students t-number: " );
		tNumber = input.nextLine();
		
		tNumber = tNumber.toLowerCase();
		
		if( tNumber.length() == 10 ) {
			
			if( tNumber.charAt(0) == 't' ) {
				
				/* This part starts index from 1 (index = 1)
				 * It then uses a while loop to see if the numbers entered are digits.
				 */
				
				int index = 1;
				ch = tNumber.charAt(index); //Initializes ch from 1
				
				//While loop runs until the end of the String. Stops if it's false.
				while( index < tNumber.length() && ch >= '0' && ch <= '9') {
					
					index++;
					
					//This if statement increases index value to validate for digits
					if( index < tNumber.length() ) { 
						
						ch = tNumber.charAt(index);					
					}
					
				}
				
				//If the while loop runs successfully it will check the index is equal to tNumber
				//Since index starts from 1 (ignores 't'), it should be true/valid t-number.
				if( index == tNumber.length() ) {
					
					System.out.println( "\nYou entered a valid T-Number." );
					
				} else
					System.out.println( "\nInvalid! Some of the characters after the first one doesn't contain digits." );
				
			} else
				System.out.println( "\nInvalid! The T-Number entered doesn't begin with t or T." );
			
		} else
			System.out.println( "\nInvalid! The T-Number entered doesn't contain 10 characters." );
		
		input.close();
	}

}
