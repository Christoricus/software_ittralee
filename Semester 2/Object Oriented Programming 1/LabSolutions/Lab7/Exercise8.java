//Exercise8.java
/*This program uses a user-defined method to return a randomly generated value of 0 or 1 to
 *simulate a coin toss*/

import java.util.Scanner;

public class Exercise8 {
	public static void main(String args[])
		{	
			int heads=0, tosses;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the number of coin tosses you want: ");
			tosses = input.nextInt();
			
			System.out.println("\n\n");
			
			for(int i=1;i<=tosses;i++)
				{	
					if(coinToss() == 0)
						{
							System.out.println("Coin toss " + i + ": heads");
							heads++;
						}	
					else
						System.out.println("Coin toss " + i + ": tails");
							
				}
			
			System.out.println("\n\n===========Overall Results=============" +
				               "\nPercentage of heads: " + String.format("%.0f",heads/(float)tosses*100) +
				               "\nPercentage of tails: " + String.format("%.0f",(tosses-heads)/(float)tosses*100));
				
		}

	public static int coinToss()
		{
			return (int)(Math.random()*2);
		}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		