//ProblemSolving4ISBN.java
/*Program that reads in an ISBN for a book and determines whether it is valid
 This solution ignores the possiblity of the check digit being an 'X' character for simplicity
 as handling this special case would require functionality that we haven't covered yet*/

import java.util.Scanner;

public class ProblemSolving4ISBN{
	public static void main(String args[])
	{
		//must use the "long" data type here for the ISBN as it contains 10 digits, which means it might not
		//be possible to store it in an int variable (with its upper limit of about 2 Billion)
		//Also there would be issues with using float or double here due to loss of precision
		//since these are not stored precisely to 9 significant digits
		//lots more on this issue at http://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.1.2
		
		//long => long integer (a 64-bit integer type)
		
		long digit1,digit2,digit3,digit4,digit5,digit6,digit7,digit8,digit9,digit10,ISBN,tempNum,total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the ISBN for the book: ");
		ISBN = input.nextLong();
		
		
		digit1 = ISBN/1000000000;                // isolate the very first digit in the ISBN
		tempNum = ISBN - digit1 * 1000000000;    // now use this to "remove" the first digit from the original ISBN
		digit2 = tempNum/100000000;              // isolate the 2nd digit in the ISBN
		tempNum = tempNum - digit2 * 100000000;  // now use this to "remove" the 2nd digit from the original ISBN
		digit3 = tempNum/10000000;               // continue on in this manner until all digits have been isolated
		tempNum = tempNum - digit3 * 10000000;
		digit4 = tempNum/1000000;
		tempNum = tempNum - digit4 * 1000000;
		digit5 = tempNum/100000;
		tempNum = tempNum - digit5 * 100000;
		digit6 = tempNum/10000;
		tempNum = tempNum - digit6 * 10000;
		digit7 = tempNum/1000;
		tempNum = tempNum - digit7 * 1000;
		digit8 = tempNum/100;
		tempNum = tempNum - digit8 * 100;
		digit9 = tempNum/10;
		tempNum = tempNum - digit9 * 10;
		digit10 = tempNum;
		
		// next apply the formula in order to get the total
		total = digit1*10 + digit2*9 + digit3*8 + digit4*7 + digit5*6 + digit6*5 + digit7*4 + digit8*3 + digit9*2;
		
		// finally determine whether or not 11 - (total % 11) equals the 10th digit (the check digit)
		// using a single-line if statment here
		
		if (11 - total % 11 == digit10)
		    System.out.println("\nThat ISBN is valid");
		else
		    System.out.println("\nThat ISBN is invalid");

			
		System.out.println("\n\n\n");
				                 		
	}
}

