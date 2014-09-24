package firstca2014;
import javax.swing.JOptionPane;

public class Group2_5 {

	public static void main( String[] args )
	{
		
		
		JOptionPane.showMessageDialog( null
				, ESPCalculator() 
				, "ESP Calculator"
				, JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);

	}


	public static String ESPCalculator()
	{
		String correctGuess = "";
		int level = 0;
		
		for( int i = 1; i <= 5; i++ ) 
		{

			String rand = JOptionPane.showInputDialog( "Test " + i + " - Try to guess the random number between 1 to 5" );
			int guess = Integer.parseInt( rand );

			int randNum = (int) (Math.random()*5+1) ;
			
			if( randNum == guess ) { level++; }
			
			//System.out.println( (int) randNum + "   level: " + level);

		}
		
		switch( level )
		{
		case 0:
		case 1:
			correctGuess = "Your ESP level is none";
			break;

		case 2:
			correctGuess = "Your ESP level is Moderate";
			break;

		case 3:
			correctGuess = "Your ESP level is Strong";
			break;

		case 4:
		case 5:
			correctGuess = "Your ESP level is Extreme";
			break;
		}
		
		return correctGuess;

	}
}
