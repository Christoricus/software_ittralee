package week3;
import javax.swing.JOptionPane;

/* This program uses a user defined method containsCharacter() to determine 
 * whether a String contains a given character.
 */

public class ContainsCharacterMethod {
	
	public static void main( String[] args )
	{
		String text, character, message;
		char ch;
		
		text = JOptionPane.showInputDialog( "Please enter a piece of text" );
		
		character = JOptionPane.showInputDialog( "Please enter a character" );
		ch = character.charAt(0);
		
		
		if( containsCharacter( text, ch ) ) { message = "The text you entered contained the character "; }
		else { message = "The text you entered does not contain the character "; }
		
		JOptionPane.showMessageDialog( null
				, message + ch 
				, "Character Tester"
				, JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
	
	}
	
	public static boolean containsCharacter( String s, char ch )
	{
		boolean result = false;
		
		for( int i = 0; i < s.length(); i++ )
		{
			if( s.charAt( i ) == ch ) { result = true; break; }
		}
		
		return result;
	}

}
