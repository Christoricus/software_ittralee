//Exercise2.java
/*This program deals with calculating an employees PAYE based on 
some formulae supplied*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{
			float PAYE,cutOffPoint,grossIncome,pensionPayment,taxCredits;
			final float LOWRATE=20,HIGHRATE=42;
			
			Scanner input = new Scanner(System.in);	
				
			System.out.print("Please enter your gross income: ");
			grossIncome = input.nextFloat();
			
			System.out.print("Please enter your pension payment: ");
			pensionPayment =  input.nextFloat();
			
			System.out.print("Please enter your cut-off point: ");
			cutOffPoint = input.nextFloat();
			
			System.out.print("Please enter your tax-credits: ");
			taxCredits = input.nextFloat();
									
			if(grossIncome<cutOffPoint)
				PAYE=((grossIncome-pensionPayment)*LOWRATE/100)-taxCredits;
			else
				PAYE = (cutOffPoint*LOWRATE/100) + ((grossIncome-cutOffPoint-pensionPayment)
				*HIGHRATE/100) - taxCredits;
				    
			System.out.println("\nThe PAYE due by this employee is EUR" +
							   String.format("%.2f",PAYE)); 
							
			}
			
}