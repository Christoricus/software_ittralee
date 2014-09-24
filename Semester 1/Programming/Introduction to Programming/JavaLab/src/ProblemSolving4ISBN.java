//Find the valid ISBN
import java.util.Scanner;

public class ProblemSolving4ISBN {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the ISBN for the book: ");
		String ISBN = input.nextLine();
		
		int checkDigit = Integer.parseInt(ISBN);
		
		System.out.print(checkDigit);
		

	}

}
