//Exercise1.java
/*This program uses a counter controlled while loop to read in the weights of
 *5 people and then displays some results about the weights*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			float weight,totalWeight=0;
			int atLeast80kg=0,count=0;
			
			Scanner input = new Scanner(System.in);			
			
			while(count < 5)
				{
					System.out.print("Please enter the weight of person " + (count+1) + ": ");
					weight = input.nextFloat();
					
					if(weight>=80)
						atLeast80kg++;
		
					totalWeight+=weight;	
					
		            count++;
				}		
						
			System.out.println("\n\n\n===========================" + 
				               "\n\tProgram Results" +
				               "\n===========================" + 
				               "\n\nAverage weight: " + String.format("%.2f",totalWeight/5) + "kg" +
				               "\n\nPercentage >= 80kg: " + String.format("%.2f",atLeast80kg/5f*100) + "%");
				
									
		}		
}


