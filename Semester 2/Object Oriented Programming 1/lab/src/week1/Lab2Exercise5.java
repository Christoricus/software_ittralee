package week1;
import java.util.Scanner;

/* This program uses a counter-controlled while loop to process the digits within a
 * user-supplied t-number. It is part of a validation routine to determine whether
 * the t-number is valid
 */

public class Lab2Exercise5 {

	public static void main( String[] args ) 
	{
		String longestWord = "", word;
		int vowel = 0, consonant = 0;
		float averageVowel = 0f, averageConsonant = 0f;

		Scanner input = new Scanner( System.in );

		for( int i = 1; i <= 5; i++ )
		{
			System.out.print( "Please enter word " + i + ": " );
			word = input.nextLine();
			word = word.toLowerCase();

			if( i == 0 ){
				longestWord = word;
			} else if( word.length() >= longestWord.length() ) 
			{
				longestWord = word;
			}


			for( int j = 0; j < word.length(); j++ )
			{
				char ch = word.charAt(j);
				if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					
					vowel++;
					/*if( j < word.length() )
						ch = word.charAt(j); */
				
				} else
					consonant++;

			}
		}
		
		averageVowel = (float) vowel/5;
		averageConsonant = (float) consonant/5;
		
		System.out.println( "\nThe avearge vowel is: " + String.format("%.2f", averageVowel) 
				+ "\nThe average consonant is: " + String.format("%.2f", averageConsonant) 
				+ "\nThe longest word is: " + longestWord );
	
		input.close();
	}

}
