//ProblemSolving5SandalsShoes.java
/*Program that determines whether the user should wear sandals or shoes depending on
 *whether it is raining or not*/

import java.util.Scanner;

public class ProblemSolving5SandalsShoes{
	public static void main(String args[])
	{
		String raining;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Is it currently raining (yes/no)? ");
		raining = input.nextLine();
		
		if(raining.equals("yes"))
			System.out.println("\nStick the shoes on!!");
		else
			System.out.println("\nYou're safe to wear sandals (but this is Ireland so maybe keep \nthe shoes handy!!)");
			
			
		System.out.println("\n\n\n");
				                 		
	}
}

