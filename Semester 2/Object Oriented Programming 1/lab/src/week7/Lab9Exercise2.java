//Exercise2.java
/*This program gets the user to enter an arbitrary amount of positive or negative
 *whole numbers and validates each one perfectly. It then determines a number of
 *results based on the numbers entered.*/

package week7;
import javax.swing.JOptionPane;

public class Lab9Exercise2 {

	public static void main(String[] args)
	{
		boolean valid;
		String numberAsString;
		double numberAsDouble = 0;
		int number = 0, largest = 0, smallest = 0, sum = 0;
		int j, negative = 0, over1000 = 0, even = 0, dots = 0, count = 0;

		numberAsString = JOptionPane.showInputDialog("Please enter a number: " );

		while ( !numberAsString.equalsIgnoreCase("x") )
		{

			valid = false;

			while (!valid)
			{

				//Check if the first character is not empty && (digit or '-' or '.')
				if (!numberAsString.equals("") && ( Character.isDigit(numberAsString.charAt(0) ) 
						|| numberAsString.charAt(0) == '-' || numberAsString.charAt(0) == '.') )
				{
					if (numberAsString.charAt(0) == '.') { dots++; }

					for (j = 1; j < numberAsString.length(); j++)
					{
						//Break the loop if the digits aren't valid && dots aren't > 1 
						// && it doesn't contain '.' 
						if ( !Character.isDigit(numberAsString.charAt(j)) && dots > 1 
								&& numberAsString.charAt(j) != '.' )
							break;

						else if (numberAsString.charAt(j) == '.') 
							dots++;
					}

					//If j == number && != '.' && != '-' && != '-.' && dots <= 1
					if ( j == numberAsString.length() && !numberAsString.equals(".")
							&& !numberAsString.equals("-") && !numberAsString.equals("-.")
							&& dots <= 1 && !numberAsString.equals("-0") )
					{
						number = Integer.parseInt(numberAsString);

						if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE )
							valid = true;

						else
							numberAsString = JOptionPane.showInputDialog("Invalid! Please enter a number: " );

					} else
						numberAsString = JOptionPane.showInputDialog("Invalid! Please enter a number: " );


					dots = 0;  // reset dots to 0

				} else if (numberAsString.equalsIgnoreCase("x")) 
					break; 

				else
					numberAsString = JOptionPane.showInputDialog("Invalid! Please enter a number: " );


			} // end of validating while loop -- validates the number
		
			if (!numberAsString.equalsIgnoreCase("x"))
			{
				/* Every time the while loop validates a valid input
				 * it'll do the outlined determination below
				 */

				sum += number;
				count++;
				
				//find the largest
				if (number > largest) { largest = number; }

				//find the smallest & largest
				if (count == 1 ) { 
					smallest = number;
					largest = number;
				} else if ( number < smallest )  
					smallest = number;
				
				else if ( number > largest )
					largest = number;	
				

				//find the amount of negative numbers & over1000
				if (number < 0)  
					negative++; 
					
				else if (number > 10000)  
					over1000++; 

				//find the amount of even numbers
				if (number% 2 != 1) { even++; }

				
				numberAsString = JOptionPane.showInputDialog("Please enter another number: " );
			
			}

		} // end of main while loop -- terminates by x


		if (count == 0 && numberAsString.equalsIgnoreCase("x"))
		{
			JOptionPane.showMessageDialog(null, "There was no input!", "Results", JOptionPane.INFORMATION_MESSAGE );

		} else
			JOptionPane.showMessageDialog(null
					, "The average of the numbers entered is: " + (float)sum/count
					+ "\nThe largest of the numbers entered is: " + largest
					+ "\nThe smallest of the numbers entered is: " + smallest
					+ "\nThe percentage of the negative numbers entered is: " + String.format("%.2f", (float)(negative/count*100))
					+ "\nThe percentage of the numbers that exceeded 1000 is: " + String.format("%.2f", (float)(over1000/count*100))
					+ "\nThe number of even values: " + even
					, "Results"
					, JOptionPane.INFORMATION_MESSAGE );


		System.exit(0);


	} 

}
