//Tutorial6Qd.java
/*A program that reads an arbitrary number of positive integers, terminated by -1 and
 *displays the values entered back to the user. It ensures that only positive integers
 *are accepted into the program. This program also determines any palindromic numbers
 *and lists them. This program performs the validation within a user-defined method
 *called validInteger()*/

import java.util.Scanner;

public class Tutorial6Qd {
	public static void main(String args[]) 	
	{
		String allNumbers = "",numberAsString,allPalindromes="";
		int number,i=0;
		
		Scanner input = new Scanner(System.in);
		
		do{
		
			System.out.print("Please enter a positive integer number (-1 to exit): ");
			numberAsString = input.nextLine();

	        while(!validInteger(numberAsString))
		    {        	
		        System.out.print("Error: You must enter a positive integer number (-1 to exit). Please re-enter: ");
		        numberAsString = input.nextLine();	
		    }
		
			//now that the string has been validated, try to convert it to an integer value
			number = Integer.parseInt(numberAsString);
		
			if(number!=-1)	
				allNumbers += number + " ";
				
			//As long as we have not reached the middle of the string and the corresponding characters going forward and
			//backwards match, then keep track of the number of matches
			while(i<numberAsString.length()/2 && numberAsString.charAt(i)==numberAsString.charAt(numberAsString.length()-i-1))
				i++;
		
			//if the number of matches is equal to the length of the string divided by 2 then we have a palindrome
			if (i == numberAsString.length()/2)
				{
					allPalindromes += numberAsString + " ";
				}
		
			i = 0;
				
			System.out.println();
		
		}while(number!=-1);
				
		System.out.println("\n\nThe numbers you entered were: " + allNumbers + "\nThe palindromes among these " + 
			"numbers are: " + allPalindromes);
		
	}
	
	private static boolean validInteger(String numberAsString)
	{
		int i = 0;
		boolean valid = false;
		
		while(i<numberAsString.length() && numberAsString.charAt(i)>= '0' && numberAsString.charAt(i) <= '9')
		       i++;
		        		
		if(i==numberAsString.length() && i>0 || numberAsString.equals("-1"))
		       valid = true;
		   
		return valid;
	}
}