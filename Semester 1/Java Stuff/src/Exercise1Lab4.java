import java.util.Scanner;

public class Exercise1Lab4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		if(age < 20) {
			System.out.println("You are under 20 years old.");
		}else{
			System.out.println("You are at least 20 years old.");
		}

	}

}