//Exercise5.java
/*This program uses a for loop to read in and process exactly 5 words*/

import java.util.Scanner;

public class Exercise5{
	 public static void main(String args[])
		{
			String word,longestWord="";
			int totalVowels=0,totalLetters=0;
			
			Scanner input = new Scanner(System.in);
			
		    for(int i=1;i<=5;i++)
			    {
			       	System.out.print("Please enter word " + i + ": ");
			       	word = input.nextLine();
			       	
			       	word = word.toLowerCase();
			       	
			       	for(int j=0;j<word.length();j++)
				       	{	
				       		switch(word.charAt(j))
					       		{
					       			case 'a':
					       			case 'e':
					       			case 'i':
					       			case 'o':
					       			case 'u':
					       				totalVowels++;
					       		}
					       	
				       	}
				       	
				    if(word.length()>longestWord.length())
				    	longestWord = word;
				    	
				    totalLetters += word.length();
				    	
			    }
			    
			System.out.println("\n\nThe average number of vowels per word: " + String.format("%.2f",totalVowels/5f) +
				               "\nThe average number of consonants per word: " + 
				               	    String.format("%.2f",(totalLetters-totalVowels)/5f) +
				               "\nThe longest word: " + longestWord);
		
		}
}