package week3;
import javax.swing.JOptionPane;

/* This program uses user-defined method called isWholeNumber() to determine if it contains
 * a whole number (positive or negative)
 */

public class Lab5Exercise3 {
	
	public static void main( String[] args )
	{
		String text, message;
		
		text = JOptionPane.showInputDialog( "Please enter a piece of text");
		
		if( isWholeNumber( text ) ) { message = "The text you entered constitutes a whole number"; }
		else { message = "The text you entered does not constitute a whole number"; }
		
		JOptionPane.showMessageDialog( null
				, message
				, "Number Tester"
				, JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
	}
	
	public static boolean isWholeNumber( String s )
	{
		boolean result = false;
		
		for( int i = 0; i < s.length(); i++ )
		{
			char ch = s.charAt(i);
			if( Character.isDigit( ch ) ) { result = true; }
			else { result = false; }
		}
		
		return result;
	}
}
