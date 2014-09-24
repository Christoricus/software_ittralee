package week4;
import javax.swing.JOptionPane;

public class Lab7Exercise3 {
	
	public static void main( String[] args )
	{
		String message;
		
		String digit = JOptionPane.showInputDialog( "Please enter a keyboard character" );
		char ch = digit.charAt(0);
		
		if( !myIsDigit( ch ) ) { message = "You did not enter a digit"; }
		else { message = "You entered a digit"; }
		
		JOptionPane.showMessageDialog( null
				, message
				, "Digit Test"
				, JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
		
	}
	
	public static boolean myIsDigit( char ch )
	{
		boolean result = false;
		
		if( ch >= '0' && ch <= '9' ) { result = true; }
		
		return result;
	}
}
