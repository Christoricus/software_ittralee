//Assess2ASolution.java
/*This program reads in a user-supplied ISBN and validates it in a number of ways*/

import java.util.Scanner;

public class Assess2ASolution{
	public static void main(String args[])
		{
			String ISBN;
			char ch;
			int index=0,num,total=0,checkDigit;
			
			Scanner input = new Scanner(System.in);
			
            System.out.print("Please enter an ISBN: ");
            ISBN = input.nextLine();
           
			if (ISBN.length() != 10) 
			    System.out.println("\nInvalid ISBN!! It must contain exactly 10 characters");
			else
				{
					ch = ISBN.charAt(index);
					
					while(index<9 && ch>='0' && ch<='9')
						{
							index++;
							ch = ISBN.charAt(index);		
						}
						
					if(index == 9)
						if(ch>='0' && ch<='9' || ch=='X')
							{
								num=10;
								index=0;
								ch = ISBN.charAt(index);
								
								while(num>1)
									{
										total+= ((int)ch - 48)*num;
										num--;
										index++;
										ch = ISBN.charAt(index);
									}
									
								if(ch == 'X')
									checkDigit = 10;
								else
									checkDigit = (int)ch - 48;
									
								if(11 - total%11 == checkDigit)
									System.out.println("\nYou entered a valid ISBN");
								else
									System.out.println("\nInvalid ISBN!! It failed the golden-rule test");
									
							}
						else
							System.out.println("\nInvalid ISBN!! It must end in a digit or an X");
					else
						System.out.println("\nInvalid ISBN!! All of the first 9 characters must be digits");
				}		
				
		}
}

