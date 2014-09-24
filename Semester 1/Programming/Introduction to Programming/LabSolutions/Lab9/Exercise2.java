//Exercise2.java
/*This program asks the user to supply a +ve whole number n and then uses a for loop which 
 *displays the sum of the first n positive integers*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{
			int sum=0,limit;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the upper limit: ");
			limit = input.nextInt();

			for(int i=0;i<=limit;i++)
				{
				   sum+=i;	
				}		
			System.out.println("\nThe sum of the first " + limit + " positive integers is " + sum);													
		}		
}


