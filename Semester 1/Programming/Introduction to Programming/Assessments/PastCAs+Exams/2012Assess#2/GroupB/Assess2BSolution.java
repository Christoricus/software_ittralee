//Assess2BSolution.java
/*This program reads in a user-supplied web address and validates it in a number of ways*/

import java.util.Scanner;

public class Assess2BSolution{
	public static void main(String args[])
		{
			String address;
			char ch;
			int index=4;
			
			Scanner input = new Scanner(System.in);
			
            System.out.print("Please enter a web address: ");
            address = input.nextLine();
            
            if (address.length() >= 9 && address.length() <= 38)
				if (address.charAt(0)=='w' && address.charAt(1)=='w' && address.charAt(2)=='w' && address.charAt(3)=='.') 
					{
						while(index<address.length()-4)
							{
								ch=address.charAt(index);
								if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
									index++;
								else
									break;
							}
							
						if(index==address.length()-4)
							if(address.charAt(index)=='.' && address.charAt(index+1)=='c' && address.charAt(index+2)=='o'
							   && address.charAt(index+3)=='m')
								System.out.println("\nYou entered a valid web address");
							else
								System.out.println("\nInvalid web address!! It must end with .com");
						else	
							System.out.println("\nAt least one of the characters in the middle of the web address was invalid");
					}
				else
					System.out.println("\nInvalid web address!! It must begin with www.");
			else
					System.out.println("\nInvalid web address!! It must have between 9 and 38 characters inclusive");	
				
		}
}

