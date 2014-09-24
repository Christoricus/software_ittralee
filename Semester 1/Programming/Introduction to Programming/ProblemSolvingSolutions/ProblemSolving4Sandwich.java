//ProblemSolving4Sandwich.java
/*Program that finds out the customers requirements for their sandwich order and then adds these
  items as required giving a message out confirming the order*/

import java.util.Scanner;

public class ProblemSolving4Sandwich{
	public static void main(String args[])
	{
		String cheese,lettuce,tomatoe;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you require cheese (yes/no)? ");
		cheese = input.nextLine();
		
		System.out.print("Do you require lettuce (yes/no)? ");
		lettuce = input.nextLine();
		
		System.out.print("Do you require tomatoe (yes/no)? ");
		tomatoe = input.nextLine();
		
		System.out.print("\n\nYour sandwich contains: ");
		
		if(cheese.equals("yes"))
			System.out.print("cheese ");
		
	    if(lettuce.equals("yes"))
			System.out.print("lettuce ");
			
		if(tomatoe.equals("yes"))
			System.out.print("tomatoe ");
			
		System.out.println("\n\n\n");
				                 		
	}
}

