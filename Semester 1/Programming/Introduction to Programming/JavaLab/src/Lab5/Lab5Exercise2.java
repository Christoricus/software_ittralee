package Lab5;
import java.util.Scanner;
public class Lab5Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a keyboard character: ");
		String keyChar = input.nextLine();
		char chckChar = keyChar.charAt(0);
		
		if(chckChar >= 65 && chckChar <= 90)
			System.out.println("You entered an uppercase letter.");
		else if(chckChar >= 97 && chckChar <= 122)
			System.out.println("You entered a lowercase letter.");
		else if(chckChar >= 48 && chckChar <= 57)
			System.out.println("You entered a digit.");
		else
			System.out.println("You entered neither a letter nor a digit.");

	}

}
