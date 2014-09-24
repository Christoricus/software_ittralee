//Exercise4.java
/*This program uses a user-defined method to determine whether the numbers entered by the
 *user are even or odd*/

import javax.swing.JOptionPane;

public class Exercise4 {
	public static void main(String args[])
		{
		
			int number;
			String numberAsString;
			
			numberAsString = JOptionPane.showInputDialog("Please enter an integer ");
			
			while(!numberAsString.equals(""))
				{
					number = Integer.parseInt(numberAsString);
																
					if(isEven(number))
			     		JOptionPane.showMessageDialog(null,"You entered an even number",
			     		"Even Test",JOptionPane.PLAIN_MESSAGE);
					else
				  		JOptionPane.showMessageDialog(null,"You entered an odd number",
				  		"Even Test",JOptionPane.PLAIN_MESSAGE);
				  		
				  	numberAsString = JOptionPane.showInputDialog("Please enter an integer ");
				}
				
			System.exit(0);
			
		}

	public static boolean isEven(int number)
	    {
		    if(number % 2 == 0)
		         return true;
		     else
		         return false;
	    }
	

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		