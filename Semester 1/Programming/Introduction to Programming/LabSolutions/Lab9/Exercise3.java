//Exercise3.java
/*This program uses a for loop which displays the n times table for
 *a user-supplied value of n*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			int n;
				
			Scanner input = new Scanner(System.in);
			
			System.out.print("What number do you wish to display the times-table for? ");
			n = input.nextInt();
			
			while(n<1 || n>12)
				{
					System.out.print("Invalid. You must enter a value from 1-12. Please re-enter: ");
					n = input.nextInt();
				}
			
			System.out.println("\n\n=====The " + n + " times table=====\n");	
			for(int i=0;i<=12;i++)
				{
					System.out.println(n + " times " + i + " is " + (n*i));
				}		
																
		}		
}


