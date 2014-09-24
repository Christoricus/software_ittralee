//Exercise4.java
/*This program uses a set of given rates to determine how much a persons
 *mobile phone bill will cost*/

import java.util.Scanner;

public class Exercise4 {
	 public static void main(String args[])
		{
			int units;
			float cost;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the units used: ");
			
			units = input.nextInt();
				
			if(units <= 99)
					cost = units * 0.05f;
			else if(units <= 299)
					cost = 99*0.05f + (units-99)*0.03f;					
			else if(units <= 399)
					cost = 99*0.05f + 200*0.03f + (units-299)*0.02f;
			else
				    cost = 99*0.05f + 200*0.03f + 100*0.02f + (units-399)*0.01f;
		
			System.out.println("\n\nThe cost of your mobile phone bill is EUR" + String.format("%.2f",cost));	
						
		}
}