package Lab9;
import java.util.Scanner;
public class For {
	public static void main(String[] args)
	{
		int vowels=0, consonants=0;
		char character;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String text = input.nextLine();
		text = text.toLowerCase();
		
		for(int i=0; i < text.length(); i++)
		{
			character = text.charAt(i);
			
			if(character >= 'a' && character <= 'z')
			{
				if(character== 'a' || character== 'e' || character== 'i' || character== 'o' || character== 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("\nNumber of vowels: " + vowels +
				"\nNumber of consonants: " + consonants);
		
		input.close();
	}
}
