//Exercise1.java
/*This program reads in an arbitrary amount of t-numbers and validates each one perfectly
 *It then displays the amount of valid t-numbers entered along with a list of the valid ones*/

package week5;
import javax.swing.JOptionPane;

public class Lab8Exercise1 {

	public static void main(String[] args)
	{
		boolean valid = false;
		
		String tNumber, allTNum = "";
		int count = 0;
		
		
		tNumber = JOptionPane.showInputDialog("Please enter a T-Number: " );
		
		
		//Loop to test the t number
		while ( !tNumber.equals("") )
		{
			if (tNumber.equals("")) { break; } //not necessary if you use while loop only
			
			
			//testing for validity
			if ( tNumber.toUpperCase().charAt(0) == 'T' && tNumber.length() == 9 )
			{
				for (int i = 1; i < tNumber.length(); i++)
				{
					valid = Character.isDigit( tNumber.charAt(i) );
					//System.out.println( String.valueOf( valid ) );

				}
				
				//if t number is valid
				if (!valid)
				{
					tNumber = JOptionPane.showInputDialog("Invalid! Please re-enter another T-Number: " );
					
				} else {
					count++;
					allTNum += tNumber + "\n"; //keep an account of valid t numbers
					tNumber = JOptionPane.showInputDialog("Please enter another T-Number: " );
				}
				
			
			} else
				tNumber = JOptionPane.showInputDialog("Invalid! Please re-enter another T-Number: " );
				
		
		}
		
		
		if ( valid )
		{
			JOptionPane.showMessageDialog(null, 
					"Number of valid t-numbers entered " + count
					+ "\nList of valid t-numbers entered: \n\n" + allTNum
					, "Valid T-Numbers"
					, JOptionPane.INFORMATION_MESSAGE );
		} else
			JOptionPane.showMessageDialog(null,"You entered no valid t-numbers!","Valid t-numbers",
				       JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
