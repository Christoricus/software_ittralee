//Q4b.java
/*This program uses a for loop to determine the factors of a user-supplied positive whole number*/

import java.util.Scanner;

public class Q4b {
	public static void main(String args[])
		{					
			int i=0,number;
			
			Scanner input = new Scanner(System.in);
				
			System.out.print("Please enter a positive whole number: ");
			number = input.nextInt();
			
			System.out.print("\n\nThe factors of " + number + " are ");
			
			for(i=1;i<=number;i++)	
				if(number%i == 0)
					System.out.print(i + " ");
					
			System.out.println("\n\n");
						
		}
}	



