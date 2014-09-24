//Assess2Group4Solution.java
/*This program reads in a set of 5 user-supplied strings, one at a time, and determines whether or not it
 *constitutes a valid time value of the form hh:mm*/

import java.util.Scanner;

public class Assess2Group4Solution{
	public static void main(String args[])
		{
			String time;
			int i=1,validTimes=0;
			
			Scanner input = new Scanner(System.in);
			
			
			do{
				System.out.println("=======Time Tester - Iteration " + i + "=======");
				System.out.print("Please enter a time value in the form hh:mm : ");
            	time = input.nextLine();
            	
            	if(time.length()==5)
            		if(time.charAt(0)>='0'&&time.charAt(0)<='1' && time.charAt(1)>='0' && time.charAt(1)<='9' ||
            		   time.charAt(0)=='2'&&time.charAt(1)>='0'&&time.charAt(1)<='3')
            		   	if(time.charAt(2)==':')
            		   	    if(time.charAt(3)>='0'&&time.charAt(3)<='5' && time.charAt(4)>='0'&&time.charAt(4)<='9')
	            		   	    {
	            		   	    	System.out.println("\nYou entered a valid time value");
	            		   	    	validTimes++;
	            		   	    }     
            		   	    else
            		   	    	System.out.println("\nInvalid time value. The minutes part is wrong");
            		   	else
            		   		System.out.println("\nInvalid time value. The third character must be a :");
            		else
            			System.out.println("\nInvalid time value. The hours part is wrong.");
            	else
            		System.out.println("\nInvalid time value. It must contain exactly 5 characters.");
				
			    i++;
			    System.out.println("\n\n");	
			}while(i<=5);
			
			System.out.println("\n\nThe percentage of valid times you entered was " + (validTimes*20) + "%");    
           			
		}
}

