//Activity 1 : Sandwich choices

import java.util.Scanner;
public class ProblemSolving4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String cheese, tomato, lettuce;
		
		System.out.print("Do you require cheese? (yes or no) ");
		cheese = input.nextLine();
		
		System.out.print("Do you require lettuce? (yes or no) ");
		lettuce = input.nextLine();
		
		System.out.print("Do you require tomato? (yes or no) ");
		tomato = input.nextLine();
		
		System.out.print("\n\nYour sandwich contains: ");;
		
		if(cheese.toLowerCase().equals("yes"))
			System.out.print("cheese ");
		
		if(lettuce.toLowerCase().equals("yes"))
			System.out.print("lettuce ");
		
		if(tomato.toLowerCase().equals("yes"))
			System.out.print("tomato ");
		
		System.out.println("\n");
					
		
	}

}
