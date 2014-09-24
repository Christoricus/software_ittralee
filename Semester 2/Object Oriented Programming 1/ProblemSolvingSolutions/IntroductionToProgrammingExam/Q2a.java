//Q2a.java
/*This program reads in the users birth date in the form dd-mm-yyyy and extracts the month part
 *to determine the season in which the user was born*/

import java.util.Scanner;

public class Q2a {
	public static void main(String args[])
		{					
			String birthDate,season="";
			char monthChar1,monthChar2;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your birth date in the form dd-mm-yyyy: ");
			birthDate = input.nextLine();
			
			monthChar1 = birthDate.charAt(3);
			monthChar2 = birthDate.charAt(4);
			
			if(monthChar1=='0')
				if(monthChar2=='2' || monthChar2=='3' || monthChar2=='4')
					season = "spring";
				else if(monthChar2=='5' || monthChar2=='6' || monthChar2=='7')
					season = "summer";
				else
					season = "autumn";
			else
				if(monthChar2=='0')
					season = "autumn";
				else
					season = "winter";
	
			System.out.println("\nYou were born in " + season);
				
		}
}	



