//Exercise3.java
/*This program uses a counter controlled while loop to read in the weights of
 *5 people and then displays some results about the weights. It builds on
 *Exercise1.java*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			float weight,totalWeight=0,lightest=0,heaviest=0;
			int atLeast80kg=0,count=0;
			
			Scanner input = new Scanner(System.in);			
			
			while(count < 5)
				{
					System.out.print("Please enter the weight of person " + (count+1) + ": ");
					weight = input.nextFloat();
					
					if(weight>=80)
						atLeast80kg++;
		
					totalWeight+=weight;
					
					if(count==0)
						{
						   lightest = weight;
						   heaviest = weight;	
						}
					else
						{
						   if(weight>heaviest)
						   	    heaviest = weight;
						   else if(weight<lightest)
						   		lightest = weight;	
						}	
					
		            count++;
				}		
						
			System.out.println("\n\n\n===========================" + 
				               "\n\tProgram Results" +
				               "\n===========================" + 
				               "\n\nAverage weight: " + String.format("%.2f",totalWeight/5) + "kg" +
				               "\n\nPercentage >= 80kg: " + String.format("%.2f",atLeast80kg/5f*100) + "%" +
				               "\n\nHeaviest weight: " + heaviest + "kg" +
				               "\n\nLightest weight: " + lightest + "kg");
				
									
		}		
}


