//TutorialQb.java
/*A program which converts from seconds to minutes and seconds*/

import java.util.Scanner;

public class Tutorial1Qb {

	public static void main(String args[]) 	
	{
		int seconds;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of seconds: ");
		seconds = input.nextInt();
		
		System.out.println("\nThis is equivalent to " + (seconds/60) + "min " + (seconds%60) + "sec");
	}
}