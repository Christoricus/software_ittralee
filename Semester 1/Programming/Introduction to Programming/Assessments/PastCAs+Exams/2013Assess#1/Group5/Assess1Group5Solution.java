//Assess1Group5Solution.java
/*This program reads in the yearly earnings of the user and then calculates the Universal Social
 *Charge (USC) the user will be subjected to*/

import java.util.Scanner;

public class Assess1Group5Solution {
	public static void main(String args[])
		{					
			float earnings,USC;
			Scanner input = new Scanner(System.in);
			
			System.out.println("\t\t=================\n\t\t  USC Calculator\n\t\t=================\n\n");
			
			System.out.print("Please enter your yearly earnings: ");
			earnings = input.nextFloat();
			
			if(earnings < 0)
				System.out.println("\nYou entered an invalid earnings value ..... quitting program now");
			else
				{
					if(earnings <= 4004)
						USC = 0;
					else if(earnings <= 10036)
						USC = earnings*0.02f;
					else if(earnings <= 16016)
						USC = 10036*0.02f + (earnings - 10036)*0.04f;
					else
						USC = 10036*0.02f + (16016-10036)*0.04f + (earnings - 16016)*0.07f;
						
					System.out.println("\n\nThe USC payable by you is EUR" + String.format("%.2f",USC));
				}
						
		 }
}	



