//Assess2DSolution.java
/*This program gets the user to enter 4 registration numbers and validates each one in turn*/

import java.util.Scanner;

public class Assess2DSolution{
	public static void main(String args[])
		{
			String regNumber;
			char ch;
			int index,numProcessed=0,validCount=0;
			
			Scanner input = new Scanner(System.in);
			
			
			do{
				System.out.print("Please enter registration number " + (numProcessed +1) + ": ");
				regNumber = input.nextLine();
				
				
			    if(regNumber.length()>=7 && regNumber.length()<=11)
			    	if(regNumber.charAt(0)>='0' && regNumber.charAt(0)<='9' && regNumber.charAt(1)>='0' && regNumber.charAt(1)<='9')
			    		if(regNumber.charAt(2)=='-')
			    			if(regNumber.charAt(3)>='A' && regNumber.charAt(3)<='Z' && regNumber.charAt(4)>='A' && regNumber.charAt(4)<='Z')
			    				if(regNumber.charAt(5)=='-')
				    				{
				    				    index=6;
				    					ch = regNumber.charAt(index);
				    					
				    					while(index<regNumber.length()&&ch>='0'&&ch<='9')
					    					{
						    						index++;
						    						if(index<regNumber.length())
						    							ch = regNumber.charAt(index);
						    				}
	
					    				if(index==regNumber.length())
						    				{
						    					System.out.println("The reg number you entered is valid");
						    					validCount++;
						    				}
					    				else
					    					System.out.println("At least one of the characters in the last part of the reg number is not a digit");
				    				}
			    				else
			    					System.out.println("Invalid reg number! Sixth character must be a dash");	
			    			else
			    				System.out.println("Invalid reg number! Fourth and fifth characters must be uppercase letters");
			    		else
			    			System.out.println("Invalid reg number! Third character must be a dash");
			    	else
			    		System.out.println("Invalid reg number! First 2 characters must be digits");
			    else
			    	System.out.println("Invalid reg number! Must have between 7 and 11 characters inclusive");
			 
			 
			    numProcessed++;
			    System.out.println("\n");
			       	
			}while(numProcessed<4);
			
			System.out.println("\nYou entered " + validCount + " valid registration numbers");
			
		}
}

