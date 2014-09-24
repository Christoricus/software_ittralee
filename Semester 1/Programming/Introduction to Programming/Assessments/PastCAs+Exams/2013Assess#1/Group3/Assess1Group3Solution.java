//Assess1Group3Solution.java
/*This program determines the current flowing through an electrical circuit, but only provided 
 *that the voltage value is positive*/

import java.util.Scanner;

public class Assess1Group3Solution{
	public static void main(String args[])
		{
			float V,I;
			int R1,R2;
	
			Scanner input = new Scanner(System.in);
			
			System.out.println("*********Current Calculator*********\n\n");

            System.out.print("Please enter the voltage of the battery: ");
            V = input.nextFloat();
            
              
            if(V<=0)
            	System.out.println("\nError! The voltage of the battery must be positive ..... now quitting program");
            else
	            {
	            	System.out.print("Please enter the resistance of the first resistor: ");
	            	R1 = input.nextInt();
	            	System.out.print("Please enter the resistance of the second resistor: ");
	            	R2 = input.nextInt();
	            	
	            	I = V*(R1+R2)/(R1*R2);
	            	
	            	System.out.println("\n\nThe total current flowing in the circuit is " + String.format("%.0f",I) + " Amps");
	            }
		
		}
}

