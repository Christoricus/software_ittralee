package week3;
import javax.swing.JOptionPane;

/* This program uses user-supplied method called wordCount() to determine the
 * number of words in user-supplied String.
 */

public class WordCountMethod {
	
	public static void main( String[] args )
	{
		
		String text;
		
		text = JOptionPane.showInputDialog( "Please enter a sentence: " );
		
		JOptionPane.showMessageDialog( null
						, "\n\nThe number of words in the sentence you entered is "
						+ wordCount( text )
						, "Word Count Result"
						, JOptionPane.PLAIN_MESSAGE );
	
		System.exit(0);
		
	}
	
	public static int wordCount( String txt )
	{
		int words = 1;
		
		for( int i = 0; i < txt.length(); i++ )
		{
			if( txt.charAt( i ) == ' ' ) { words++; }
		}
		
		return words;
	}

}
