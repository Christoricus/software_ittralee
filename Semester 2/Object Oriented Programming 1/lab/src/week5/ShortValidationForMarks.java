package week5;
import java.util.Scanner;

public class ShortValidationForMarks {

	public static void main( String[] args )
	{

		int i = 1, mark = 0, highestMark = 0, totalMarks = 0;
		String markAsString;
		Scanner input =  new Scanner( System.in );

		do {

			System.out.print( "Please enter the mark of the student " + i + ": " );
			markAsString = input.nextLine();

			while ( markAsString.length() < 1 || ( markAsString.length() > 2 && !markAsString.equals("100") )
					|| !Character.isDigit( markAsString.charAt(0) ) 
					|| ( markAsString.length() == 2 && !Character.isDigit( markAsString.charAt(1) ) ) )
					{
						System.out.print( "Invalid! Please enter the mark of the student " + i + ": " );
						markAsString = input.nextLine();
					}
			
			mark = Integer.parseInt( markAsString );
			
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