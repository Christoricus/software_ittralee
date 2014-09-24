package week2;
import javax.swing.JOptionPane;

public class Lab4Exercise3 {

	public static void main( String[] args )
	{
		String message = "";
		
		String text = JOptionPane.showInputDialog( "Please enter any character");
		
		char ch = text.charAt(0);
		
		if( Character.isDigit(ch) ) {
			
			message = "You entered a digit";
			
		} else {
			
			message = "You did not enter a digit";
	
		}
		
		JOptionPane.showMessageDialog( null
				, message
				, "Digit Test"
				, JOptionPane.PLAIN_MESSAGE );
	
		System.exit(0);
	}
}
