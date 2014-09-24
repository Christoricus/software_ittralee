package week5;
import java.util.Scanner;

public class ImprovedSimpleInputValidation {

	public static void main( String[] args )
	{

		int i = 1, mark = 0, highestMark = 0, totalMarks = 0, j;
		boolean valid;
		String markAsString;

		Scanner input =  new Scanner( System.in );

		do {

			System.out.print( "Please enter the mark of the student " + i + ": " );
			markAsString = input.nextLine();

			valid = false;

			while ( !valid ) 
			{
				for ( j = 0; j < markAsString.length(); j++ ) 
				{
					if( !Character.isDigit( markAsString.charAt(j) ) )
						break;
				}


				if ( j == markAsString.length() && markAsString.length() !=  0 ) {
					mark = Integer.parseInt( markAsString );

					if ( mark >= 0 && mark <= 100 ) { valid = true; }

					else {
						System.out.print( "Invalid! Please enter the mark of the student " + i + ": " );
						markAsString = input.nextLine();
					}

				} else {
					System.out.print( "Invalid! Please enter the mark of the student " + i + ": " );
					markAsString = input.nextLine();
				}



			}

			if( highestMark < mark ) { highestMark = mark; }

			totalMarks += mark;

			System.out.println( "\n" );

			i++;

		} while( i <= 5 );

		System.out.println( "\n\nHighest mark was: " + highestMark
				+ "\nThe average mark was: " + String.format("%.0f", totalMarks/5f) );

		input.close();

	}
}