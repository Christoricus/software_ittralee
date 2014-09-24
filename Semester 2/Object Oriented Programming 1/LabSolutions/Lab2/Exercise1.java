//Exercise1.java
/*This program uses a data-sentinel controlled while loop to process an arbitrary
 *amount of positive whole numbers*/

import java.util.Scanner;

public class Exercise1{
	 public static void main(String args[])
		{
			int number=0,numberCount=0,oddCount=0,sum=0,over100=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a first +ve whole number (-1 to exit): ");
			number = input.nextInt();
			
			while(number != -1)
				{
					numberCount++;
					
					if(number % 2 != 0)
						oddCount++;
						
					sum += number;
					
					if(number > 100)
						over100++;
						
					System.out.print("Please enter the next +ve whole number (-1 to exit): ");
					number = input.nextInt();	
				}
				
			System.out.println("\n\n========Results========\n\n" +
				               "Number of values entered: " + numberCount +
				               "\nNumber of odd values entered: " + oddCount +
				               "\nNumber of values > 100 entered: " + over100 +
				               "\nAverage of the values entered: " + String.format("%.0f",(float)sum/numberCount));
		}
}