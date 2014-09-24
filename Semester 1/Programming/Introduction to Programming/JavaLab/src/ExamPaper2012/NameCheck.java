package ExamPaper2012;
import java.util.Scanner;
public class NameCheck {
	
	public static void main( String[] args )
	{
		String firstName, surName;
		char firstCh, surCh;
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter your first name: ");
		firstName = input.nextLine();
		
		System.out.print( "Please enter your surname: ");
		surName = input.nextLine();
		
		firstName = firstName.toLowerCase();
		surName = surName.toLowerCase();
		
		firstCh = firstName.charAt(0);
		surCh = surName.charAt(0);
		
		if( firstCh >= 'a' && firstCh <= 'z'
				&& surCh >='a' && surCh <= 'z')
		{
			System.out.println( "\nYour intials are " + firstCh + "." + surCh + ".");
		
		} else {
			
			System.out.println( "\nEither the initial of your first name or surname (or both) are invalid!");
		}
	
			
	}
}
