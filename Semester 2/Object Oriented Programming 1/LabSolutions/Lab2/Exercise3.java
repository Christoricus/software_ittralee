//Exercise3.java
/*This program uses a task-controlled while loop to determine all the perfect numbers that
 *are less than 10000*/

import java.util.Scanner;

public class Exercise3{
	 public static void main(String args[])
		{
			int sumOfFactors=0,number,divisor=1;
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			number = input.nextInt();
			
			while(sumOfFactors <= number && divisor <= number/2)
				{
					if(number%divisor == 0)
						sumOfFactors += divisor;
						
					divisor++;
				}
				
			if(sumOfFactors == number)
				System.out.println("\nThis is a perfect number");
			else
				System.out.println("\nThis is not a perfect number");
			
		
		}
}