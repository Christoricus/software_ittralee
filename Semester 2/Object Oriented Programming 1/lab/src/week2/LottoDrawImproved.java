package week2;
import javax.swing.JOptionPane;

public class LottoDrawImproved {
	
	public static void main( String[] args ) 
	{
		int lottoNumber;
		String numbers = "";
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		
		for(int i = 1; i <= 7; i++ )
		{
			lottoNumber = (int) (Math.random()*42 + 1);
			
			
			
			if( a != lottoNumber && b != lottoNumber &&
				c != lottoNumber && d != lottoNumber &&
				e != lottoNumber && f != lottoNumber ) {
				
				numbers += lottoNumber + " ";
			}
			
			//numbers += lottoNumber + " ";
		}
		
		JOptionPane.showMessageDialog(null 
					, "The lotto numbers are:\n" + numbers
					, "Lotto Draw"
					, JOptionPane.PLAIN_MESSAGE );
	
		System.exit(0);
	}
}
