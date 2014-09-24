//Exercise3.java
/*This program reads in exactly 10 user-supplied lowercase letters and validates each one
 *through a user-defined method called isValidLowercase()*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
		    String letter;
		    int vowels=0;
		    
		    Scanner input = new Scanner(System.in);
		    	
			for(int i=1;i<=10;i++)
				{
					System.out.print("Please enter letter " + i + ": ");
					letter = input.nextLine();		
			
					while(!isValidLowercase(letter))
						{
							System.out.print("Invalid! Please re-enter letter " + i + ": ");
							letter = input.nextLine();
						}
					
					if(letter.equals("a") || letter.equals("e") || letter.equals("i") ||
					   letter.equals("o") || letter.equals("u"))
					   	vowels++;
				}
				
			System.out.println("\n\nThe number of vowels is " + vowels +
				               "\nThe number of consonants is " + (10-vowels));
			
		}
	
	public static boolean isValidLowercase(String l)	
		{
	        boolean valid=false;
	       	
	       	if(l.length()==1 && Character.isLowerCase(l.charAt(0)))
	       		valid = true;
	       		
			return valid;
		}				
}	



