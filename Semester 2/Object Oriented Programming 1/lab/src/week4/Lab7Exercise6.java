package week4;
import javax.swing.JOptionPane;

public class Lab7Exercise6 {

	public static void main( String[] args )
	{
		String amount = JOptionPane.showInputDialog( "Please enter the width of your square graphic" );
		int choice = Integer.parseInt( amount );

		String graphic = JOptionPane.showInputDialog( "Please choose what graphic you would like to use" );

		JOptionPane.showMessageDialog( null
				, squareGraphic( choice, graphic ) 
				, "Square Graphic"
				, JOptionPane.PLAIN_MESSAGE );


		System.exit(0);
	}

	public static String squareGraphic( int a, String s )
	{

		String sharp = "";

		for( int i = 1; i <= a; i++ )
		{
			for( int j = 1; j <= a; j++ )
			{
				sharp += s + "   ";

			}

			sharp += "\n";
		}

		return sharp;
	}

}
