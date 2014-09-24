package week1;
import java.util.Scanner;

/*This program uses a do-while loop to simulate the actions of an ATM*/

public class Lab2Exercise4 {

	public static void main( String[] args ) 
	{
		float balance = 1000f, amount = 0f;

		String choice;
		char ch;

		String menu = "****************ITT ATM****************\n\n"
				+ "Please choose from the following types: \n"
				+ "\n'D' is deposit"
				+ "\n'W' is withdrawal"
				+ "\n'X' is Exit the system\n"
				+ "\nPlease enter your choice: ";

		Scanner input = new Scanner( System.in );

		do {

			System.out.print( menu );
			choice = input.nextLine();
			choice = choice.toLowerCase();

			ch = choice.charAt(0);

			if( ch == 'x')
				break;


			switch(ch)
			{
			case 'd':
				System.out.print( "Please enter the amount you wish to deposit: " );
				amount = input.nextFloat();
				balance += amount;

				System.out.printf( "\nYour balance is %.2f", balance );
				break;

			case 'w':
				System.out.print( "Please enter the amount you wish to withdraw: " );
				amount = input.nextFloat();
				balance -= amount;

				System.out.printf( "\nYour balance is %.2f", balance );
				break;

			}

			System.out.println( "\nPlease hit return to continue....." );
			input.nextLine();
			input.nextLine();


		} while( ch != 'x' );

		System.out.println( "Thanks for using the system...goodbye" );
		
		input.close();
	}

}
