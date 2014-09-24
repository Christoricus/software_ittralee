//Assess2Group2Solution.java
/*This program reads in a user-supplied sentence and determines a number of
 *statistics based on it*/

import java.util.Scanner;

public class Assess2Group2Solution{
	public static void main(String args[])
		{
			String sentence;
			char ch,nextChar;
			int index=0,vowels=0,digits=0,oddNumbers=0,consecutiveCharacters=0;
			
			Scanner input = new Scanner(System.in);
			
			
            System.out.print("Please enter a sentence terminated with a full-stop or exclamation mark:\n\n");
            sentence = input.nextLine();
            sentence = sentence.toLowerCase();
            
            ch = sentence.charAt(index);
            
            
            while(ch!='.' && ch!='!')
	            {
	            	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	            		vowels++;
	            	else if(ch>='0'&&ch<='9')
	            		digits++;
	            	
	            	if(ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9')
	            		oddNumbers++;
	            	
	            	nextChar = sentence.charAt(index+1);	
	            	
	            	if(ch==nextChar)
	            		consecutiveCharacters++;
	            	
	            	index++;
	            	ch = sentence.charAt(index);
	            				
	            }
            
          
           
        	System.out.println("\n\n--------------------------------\n" +
    	         "\tSentence Analysis\n" +
    	         "--------------------------------\n\n");
    	               
	
			System.out.println("Total characters: " + index + 
				"\nTotal vowels: " + vowels +
			    "\nTotal digits: " + digits +
			    "\nTotal odd number characters: " + oddNumbers +
			    "\nTimes a character appears consecutively: " + consecutiveCharacters);
	      
					
		}
}

