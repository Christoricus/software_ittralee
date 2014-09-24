//Exercise4.java
/*This program uses a switch statement to determine the number of days in a
 *particular month - it is partially validated*/

import java.util.Scanner;

public class Exercise4 {
	 public static void main(String args[])
		{
			int monthNumber;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the month number: ");
			
			monthNumber = input.nextInt();
			
			switch(monthNumber)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.println("\nThe number of days in this month is 31");
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						System.out.println("\nThe number of days in this month is 30");
						break;
					case 2:
						System.out.println("\nThe number of days in this month is 28");
						break;
					default:
						System.out.println("\nInvalid month number ... now exiting program");
					
				}				
		}
}


