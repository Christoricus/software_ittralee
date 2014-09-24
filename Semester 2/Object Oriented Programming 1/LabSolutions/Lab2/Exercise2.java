//Exercise2.java
/*This program uses a counter-controlled while loop to process the digits within a
 *user-supplied t-number. It is part of a validation routine to determine whether
 *the t-number is valid*/

import java.util.Scanner;

public class Exercise2{
	 public static void main(String args[])
		{
			char character;
			String tNumber;
			int index=1,digits=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the students t-number: ");
			tNumber = input.nextLine();
			
			if(tNumber.length()==10)
				{
					if(tNumber.charAt(0)=='t' || tNumber.charAt(0)=='T')
						{
							while(index<=9)
								{
									if(tNumber.charAt(index)>='0' && tNumber.charAt(index)<='9')
										digits++;
										
									index++;
								}
							
							if(index==digits+1)	
								System.out.println("\nThe t-number entered is valid");
							else
								System.out.println("\nInvalid! Some of the characters after the first one are not digits");
					
						}
					else
						System.out.println("\nInvalid! The t-number entered does not begin with a 't' or 'T'");
				}
			else
				System.out.println("\nInvalid! The t-number entered does not contain 10 characters");
		
		}
}