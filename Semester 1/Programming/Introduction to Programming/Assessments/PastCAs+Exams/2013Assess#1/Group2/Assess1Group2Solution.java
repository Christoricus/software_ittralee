//Assess1Group2Solution.java
/*This program determines the volume of an ideal gas based on several values
  supplied by the user, but only provided that the temperature value is positive*/

import java.util.Scanner;

public class Assess1Group2Solution{
	public static void main(String args[])
		{
			float V,T,P;
			int n;
			final float R = 8.3145f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("========Volume Calculator========\n\n");

            System.out.print("Please enter the temperature of the gas: ");
            T = input.nextFloat();
            
            if(T<=0)
            	System.out.println("\nError! The temperature of the gas must be positive ..... now quitting program");
            else
	            {
	            	System.out.print("Please enter the number of moles of the gas: ");
	            	n = input.nextInt();
	            	System.out.print("Please enter the pressure of the gas: ");
	            	P = input.nextFloat();
	            	
	            	V = n*R*T/P;
	            	
	            	System.out.println("\n\nThe volume of the gas is " + String.format("%.3f",V) + " m" + (char)252);
	            }
		
		}
}

