//Q2b.java
/*This program reads in an earthquake measurement value and displays the probable effects based on the
 *Richter scale table*/

import java.util.Scanner;

public class Q2b {
	public static void main(String args[])
		{					
			String effects="";
			int measurement;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the Richter scale measurement: ");
			measurement = input.nextInt();
			
			switch(measurement)
				{
					case 1:
					case 2:
					case 3:
							effects = "Detectable only by instruments"; 
							break;
					case 4:
							effects = "Detectable within 32km of epicentre";
							break;
					case 5:
							effects = "May cause slight damage";
							break;
					case 6:
						    effects = "Moderately destructive";
							break;
					case 7:						
							effects = "A major earthquake";
							break;
					case 8:
					case 9:
							effects = "A very destructive earthquake";
							break;
					default:
						    effects = "Error: You entered an invalid measurement value!";
				}
	
			System.out.println("\n\n" + effects);
				
		}
}	



