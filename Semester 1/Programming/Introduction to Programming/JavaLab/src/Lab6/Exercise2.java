package Lab6;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		String sentence;
		char ch = 'a';
		int index = 0, upperLetter=0, lowerLetter=0, digits=0, punctuation=0;

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a sentence (. or ? or ! to terminate): ");
		sentence = input.nextLine();
		while(index < sentence.length()) {
			ch = sentence.charAt(index);
			if(ch == '.' && ch == '?' && ch == '!' ){
				punctuation++;
				break;
			} else {
				if(ch >= 'a' && ch <= 'z')
					lowerLetter++;
				else if(ch >= 'A' && ch <= 'Z')
					upperLetter++;
				else if(ch >= '0' && ch <= '9')
					digits++;
				else
					punctuation++;


				//ch = sentence.charAt(ind); //extract every character from sentence
				index++; //increase the index of the sentence by 1
			}
		}
		System.out.print("\n\n*****Lexical Analysis of your Sentence*****" + 
				"\nLowercase letters: " + lowerLetter +
				"\nUppercase letters: " + upperLetter +
				"\nDigits: " + digits +
				"\nPunctuation symbols: " + punctuation);
		input.close();
	}
  
}

