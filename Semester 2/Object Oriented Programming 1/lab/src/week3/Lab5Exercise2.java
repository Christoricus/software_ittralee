package week3;
import javax.swing.JOptionPane;

/* This program uses user-supplied method called reverse()
 * and returns the text in reverse order.
 */

public class Lab5Exercise2 {
	
	public static void main( String[] args )
	{
		
		String text;
		
		text = JOptionPane.showInputDialog( "Please enter a piece of text: " );
		
		JOptionPane.showMessageDialog( null
						, "\n\nThe text reversed is "
						+ reverse( text )
						, "String Reversed"
						, JOptionPane.INFORMATION_MESSAGE );
	
		System.exit(0);
		
	}
	
	public static String reverse( String a )
	{
		String reverse = "";
		
		for( int i = 0; i < a.length(); i++ )
		{
			reverse = a.charAt( i ) + reverse ;
			//System.out.println( reverse );
		}
		
		return reverse;
	}

}
