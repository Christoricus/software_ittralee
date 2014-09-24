//PS3Qa.java
/*A program that uses a user-defined method called randomNumber() to determine a random
 *number between between user-supplied lower and upper limits*/

import java.util.Scanner;

public class PS3Qa {
	public static void main(String args[]) 	
	{
	  String allNums="";
	  int lower,upper;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Please enter the lower limit: ");
	  lower = input.nextInt();
	  System.out.print("Please enter the upper limit: ");
	  upper = input.nextInt();
	  
	  for(int i=1;i<=10;i++)
	    {
	       allNums += randomNumber(lower,upper) + " ";
	    }
	  
	  System.out.println("The random numbers generated are: " + allNums);	
	}
	
	public static int randomNumber(int lower,int upper)
	{
		int num;
		num = (int)(Math.random()*(upper-lower+1))+lower;
		return num;
		
	}
}