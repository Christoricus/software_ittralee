package week7;
import java.util.Scanner;

public class Lab10Exercise3 {
	
	public static void main(String[] args)
	{
		String s;
		char ch;
		int vowels = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Please enter letter " + i + ": ");
			s = input.nextLine();
			
			while ( !isValidLowerCase(s) )
			{
				System.out.print("Invalid! Please re-enter letter " + i + ": ");
				s = input.nextLine();
			}
			
			ch = s.charAt(0);
			
			switch (ch)
			{
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowels++;
			
			}
				
		}
		
		System.out.println("\n\nThe number of vowels is " + vowels +
				"\nThe number of consonants is " + (10 - vowels) );
		
		input.close();
		
	}
	
	
	public static boolean isValidLowerCase(String s)
	{
		boolean valid = false;
		
		if( !s.equals("") && s.length() == 1  && Character.isLetter(s.charAt(0)) )
		{
			valid = Character.isLowerCase(s.charAt(0));
		}
		
		return valid;
	}

}
