package week2;
import javax.swing.JOptionPane;

public class LottoDraw {
	
	public static void main( String[] args ) 
	{
		int lottoNumber;
		String numbers = "";
		
		for(int i = 1; i <= 7; i++ )
		{
			lottoNumber = (int) (Math.random()*42 + 1);
			numbers += lottoNumber + " ";
		}
		
		JOptionPane.showMessageDialog(null 
					, "The lotto numbers are:\n" + numbers
					, "Lotto Draw"
					, JOptionPane.PLAIN_MESSAGE );
	
		System.exit(0);
	}
}
