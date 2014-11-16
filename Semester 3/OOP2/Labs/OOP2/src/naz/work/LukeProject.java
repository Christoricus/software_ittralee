package naz.work;
/*T00168198 - Luke Bluett
 *Java Project: code for rearranging letters
 * Solves anagrams up to 9 letters
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class LukeProject {
	public static void main(String [] args) {
		String letters; //String for user inputted values
		String [] rearranged = new String[986409]; //String array for holding rearranged letters
		String [] comparisionWord = new String[986409]; //String array for comparing words
		String [] finalWord = new String[986409]; //String array for holding validated words
		int a, b, c, d, e, f, g, h, k; //ints for setting random values and picking chars from String
		int l = 0; //counter for validated word
		boolean valid = true; //boolean for checking if words are repeated
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter letters");
		letters = input.nextLine();
		//adds random letters to string arrays
		for(int i = 0; i < 986409; i++) {
			//setting random values to each letter without repeating
			a = (int)(Math.random()*9);
			do {b = (int)(Math.random()*9);} while (b == a);
			do {c = (int)(Math.random()*9);} while (c == a || c == b);
			do {d = (int)(Math.random()*9);} while (d == a || d == b || d == c);
			do {e = (int)(Math.random()*9);} while (e == a || e == b || e == c || e == d);
			do {f = (int)(Math.random()*9);} while (f == a || f == b || f == c || f == d || f == e);
			do {g = (int)(Math.random()*9);} while (g == a || g == b || g == c|| g == d|| g == e|| g == f);
			do {h = (int)(Math.random()*9);} while (h == a || h == b || h == c|| h == d|| h == e|| h == f|| h == g);
			do {k = (int)(Math.random()*9);} while (k == a || k == b || k == c|| k == d|| k == e|| k == f|| k == g|| k == h);
			//setting the rearranged letters to a new String
			rearranged[i] = letters.substring(a,a+1) + letters.substring(b,b+1) + letters.substring(c,c+1) +
					letters.substring(d,d+1) + letters.substring(e,e+1) + letters.substring(f,f+1) +
					letters.substring(g,g+1) + letters.substring(h,h+1) + letters.substring(k,k+1);
			//sets another array with the same values for comparision
			comparisionWord[i] = rearranged[i];
		}
		
		//System.out.println(Arrays.toString(rearranged));
		
		//goes through the words set, validates that word is not repeated and adds to
		for(int i = 0; i < rearranged.length; i++) {
			//compares the word with the others to make sure non are repeated
			for(int j = 0; j < comparisionWord.length; j++) {
				//prevents the code from comparing the same value
				if(i != j) {
					if(comparisionWord[j].equals(rearranged[i])) {
						valid = false;
					}
				}
			}
			//sets the validated word to another array
			if(valid) {
				finalWord[l] = rearranged[i];
				System.out.println(Arrays.toString(finalWord) + "\n");
				l++;
			}
			//resets boolean
			valid = true;
		}
		//words created printed out
		for(int i = 0; i < 986409; i++) {
			System.out.println("Outcome " + (i+1) + " : " + finalWord[i]);
		}
		System.exit(0);
	
	}
}
