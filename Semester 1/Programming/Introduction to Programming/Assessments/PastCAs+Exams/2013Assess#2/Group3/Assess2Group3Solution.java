//Assess2Group3Solution.java
/*This program reads in a user-supplied string and determines whether or not it
 *constitutes a valid PPS number*/

import java.util.Scanner;

public class Assess2Group3Solution{
	public static void main(String args[])
		{
			String PPS;
			char ch;
			int index=0,digitCount=0;
			
			Scanner input = new Scanner(System.in);
			
			
            System.out.print("Please enter a PPS number: ");
            PPS = input.nextLine();
            
  
            if(PPS.length()==8 || PPS.length()==9)
            {
            
            	while(index<7)
            	{
            		ch = PPS.charAt(index);
            		
            		if(ch>='0'&&ch<='9')
            			digitCount++;
            		
            		index++;
            	}
            	
            	if(digitCount==7)
            		if(PPS.length()==8 && PPS.charAt(7)>='A' && PPS.charAt(7)<='Z'
            		   || PPS.length()==9 && PPS.charAt(7)>='A' && PPS.charAt(7)<='Z' && PPS.charAt(8)>='A' && PPS.charAt(8)<='Z')
            		   	System.out.println("\nYou entered a valid PPS number");
            		else
            			System.out.println("\nInvalid PPS number. The last or second-last character, or both, were not\nuppercase letters");
            	else
            		System.out.println("\nInvalid PPS number. At least one of the first seven characters were not digits");
            }
            	
            else
            	System.out.println("\nInvalid PPS number. It must contain exactly 8 or 9 characters");
            
           			
		}
}

