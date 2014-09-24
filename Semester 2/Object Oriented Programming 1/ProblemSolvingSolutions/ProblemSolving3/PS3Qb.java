//PS3Qb.java
/*A program that uses a user-defined method called isOdd() to determine whether or not
 *a user-supplied whole number is odd or not*/

import java.util.Scanner;

public class PS3Qb {
	public static void main(String args[]) 	
	{
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter any whole number: ");
		num = input.nextInt();

        if(isOdd(num))
			System.out.println("\nThe number you entered is odd");
		else
			System.out.println("\nThe number you entered is even");
		
	}
	
	public static boolean isOdd(int num)
	{
		return !(num%2==0);
	}
}