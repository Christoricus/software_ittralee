package progmaths;
import java.util.Scanner;

public class lab5p3 {

	public static void main( String[] args ) {

		int lowerBound = 0, upperBound = 101, answer = 0, choice, attempt = 1;

		String confirm = "\n\n1. Yes!"
				+ "\n2. Too High"
				+ "\n3. Too Low"
				+ "\n\nPlease choose an option: ";

		Scanner input = new Scanner( System.in );



		do {
			answer = (lowerBound + upperBound)/2;
			System.out.print( "\nIs this the number: " + answer );

			System.out.print( confirm );
			choice = input.nextInt();

			if ( choice == 1 ) {  //correct
				System.out.println( "\nThank you for playing!" );
				break;
				
			} else if ( choice == 2 ) {  // too high
				upperBound = answer;

			} else if (choice == 3) {  // too low
				lowerBound = answer;

			}

			attempt++;

		} while( choice != 1 );

		System.out.println( "It took only " + attempt + " attempts." );

		input.close();
	}
	
}
