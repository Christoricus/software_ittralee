/* This program uses counter controlled while loop to display a table of numbers
 * their square roots and their cubed roots in three decimal places using JTextArea GUI component.
 */

package week2;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class JTextAreaFormatting {

	public static void main( String[] args ) {

		int i = 1;
		double squareRoot, cubedRoot;

		JTextArea textArea = new JTextArea( 14, 30 );
		Font textAreaFont = new Font( "monospaced", Font.PLAIN, 12 );

		textArea.setFont( textAreaFont );

		textArea.setText( String.format( "%-10s %-10s %-10s \n", "Number", "SqRoot", "CbRoot" ) );

		while( i <= 100 ) {

			squareRoot = Math.sqrt( i );
			cubedRoot = Math.cbrt( i );

			textArea.append( String.format( "%-10d %-10.3f %-10.3f \n", i, squareRoot, cubedRoot ) );

			if( i % 10 == 0 ) {

				if( i < 100 ) {

					textArea.append( "\nPlease hit return to continue....." );

				} else {

					textArea.append( "\nFinished. Please hit return to exit...." );
				}

				JOptionPane.showMessageDialog( null 
						, textArea
						, "JTextArea Formatting Demo"
						, JOptionPane.PLAIN_MESSAGE );

				textArea.setText( String.format( "%-10s %-10s %-10s \n", "Number", "SqRoot", "CbRoot" ) );

			}
			
			i++;
		}
		
		System.exit(0);
	}

}
