//Q4a.java
/*This program uses a counter-controlled do-while loop to determine some details about the 10
 *countries entered by the user*/

import java.util.Scanner;

public class Q4a {
	public static void main(String args[])
		{					
			String longestName="",country,countriesStartingWithA="";
			int i=0,moreThan10Chars=0;
			
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print("Please enter the name of country " + (i+1) + ": ");
				country = input.nextLine();
				
				if(i==0)
					longestName = country;
				else if(country.length()>longestName.length())
					longestName = country;
					
				if(country.charAt(0)=='A')
					countriesStartingWithA+=country+ "  ";
					
				if(country.length()>10)
					moreThan10Chars++;
					
                i++;
			}while(i<=9);
					
			System.out.println("\n\nThe country entered with the longest name is " + longestName + 
	               "\nThe names of the countries that begin with 'A' are " + countriesStartingWithA + 
	               "\nThe percentage of the countries that contain more than 10 characters is " +
	               	 moreThan10Chars*10 + "%");	
		}
}	



