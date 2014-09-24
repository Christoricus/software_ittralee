//Exercise1.java
/*This program uses a data-sentinel controlled while loop perform an aribitrary number
 *of Fahrenheit to Celcius conversions. It should then display a number of results*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			float fahrenheit, celcius, totalCelcius=0;
			int numConversions=0,totalOver30=0,totalUnder10=0,totalAtLeast20=0;
			
			Scanner input = new Scanner(System.in);			
		
			System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
			fahrenheit = input.nextFloat();
			
			while(fahrenheit >= -459.67f)
				{
					celcius = 5/9f*(fahrenheit-32);
					System.out.println("The equivalent Celcius temperature is " + String.format("%.3f",celcius)); 
					
					totalCelcius += celcius;
					numConversions++;
					
					if(celcius > 30)
						totalOver30++;
					else if(celcius < 10)	
					    totalUnder10++;
					    
					if(celcius >= 20)
						totalAtLeast20++;
						
					
					System.out.print("\nPlease enter another Fahrenheit temperature (below -459.67 to exit): ");
					fahrenheit = input.nextFloat();
				}
				
			if(numConversions!=0)			
				System.out.println("\n\n\n===========================" + 
				               "\n\tProgram Results" +
				               "\n===========================" + 
				               "\n\nTotal conversions performed: " + numConversions + 
							   "\nAverage Celcius temperature: " + String.format("%.3f",totalCelcius/numConversions) + "C" + 
							   "\nTotal Celcius temperatures > 30C: " + totalOver30 + 
							   "\nTotal Celcius temperatures < 10C: " + totalUnder10 +
							   "\nPercentage Celcius temperatures >= 20C: " + 
							   	String.format("%.0f",(float)totalAtLeast20/numConversions*100) + "%");
			else
				System.out.println("\nNo conversions were performed....Goodbye");
									
		}		
}


