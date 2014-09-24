//Q3a.java
/*This program reads in exactly 10 whole numbers using a while loop and determines some
 statistics about them*/

import java.util.Scanner;

public class Q3a{
	public static void main(String args[])
		{
			int i=1,total=0,oddCount=0,divisibleBy3=0,number;
			
            Scanner input = new Scanner(System.in);
            
			while (i <= 10)
				{
				
				     System.out.print("Please enter number " + i + ": ");
				     number = input.nextInt();
				
				     if (number % 2 != 0)
				         oddCount++;
				     
				
				     if (number % 3 == 0) 
				         divisibleBy3++;
	
				     total += number;
				
				     i++;
				}
		
			
			System.out.println("\n\n******** Statistics on Values Entered *********\n" + 
			      "The number of odd numbers entered is " + oddCount + "\n" + 
			      "The number of even numbers entered is " + (10-oddCount) + "\n" +
			      "The average of the numbers entered is " + String.format("%.0f",total/10f) + "\n" + 
			      "The number of values divisible by 3 is " + divisibleBy3);
		}
}

