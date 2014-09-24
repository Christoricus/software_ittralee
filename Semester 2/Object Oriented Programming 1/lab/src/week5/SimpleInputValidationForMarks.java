package week5;
import java.util.Scanner;

public class SimpleInputValidationForMarks {
	
	public static void main( String[] args )
	{
		
		int i = 1, mark, highestMark = 0, totalMarks = 0;
		
		Scanner input =  new Scanner( System.in );

		do {
			
			System.out.print( "Please enter the mark of the student " + i + ": " );
			mark = input.nextInt();
			
			while( mark < 0 || mark > 100 ) {
				System.out.print( "Invalid! Please enter the mark of the student " + i + ": " );
				mark = input.nextInt();
			}
			
			if( highestMark < mark ) { highestMark = mark; }
			
			totalMarks += mark;
			
			input.nextLine();
			
			i++;
			
		} while( i <= 5 );
		
		System.out.println( "\n\nHighest mark was: " + highestMark
				+ "\nThe average mark was: " + String.format("%.0f", totalMarks/5f) );
		
		input.close();
	}

}
