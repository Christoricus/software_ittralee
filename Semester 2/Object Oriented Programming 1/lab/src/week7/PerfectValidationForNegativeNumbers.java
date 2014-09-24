/* The program gets the user to input 5 numbers which could be whole or fractional
 * positive or negative and validates each one.
 */

package week7;
import javax.swing.JOptionPane;

public class PerfectValidationForNegativeNumbers {

	public static void main(String[] args)
	{
		int j, numberOfDots = 0;
		float number, sum = 0;
		boolean valid;
		double numberAsDouble = 0;
		String numberAsString;

		for (int i = 1; i <= 5; i++)
		{
			numberAsString = JOptionPane.showInputDialog("Please enter number " + i + ": ");

			valid = false;

			while (!valid)
			{

				if ( !numberAsString.equals("") && ( Character.isDigit(numberAsString.charAt(0))
						|| numberAsString.charAt(0) == '-' || numberAsString.charAt(0) == '.' ) )
				{
					
					if (numberAsString.charAt(0) == '.' ) { numberOfDots++; }

					//validating the number 
					for (j = 1; j < numberAsString.length(); j++)
					{
						if ( !Character.isDigit(numberAsString.charAt(j)) && numberAsString.charAt(j) != '.'
								|| numberOfDots > 1 )
							break;

						else if (numberAsString.charAt(j) == '.')
							numberOfDots++;
					}

					//if j validates to be a legit number
					if ( j == numberAsString.length() && numberOfDots <= 1
							&& !numberAsString.equals("-") && !numberAsString.equals(".")
							&& !numberAsString.equals("-.") )
					{
						numberAsDouble = Double.parseDouble(numberAsString);

						if ( numberAsDouble >= -Float.MAX_VALUE && numberAsDouble <= Float.MAX_VALUE )
						{
							valid = true;

						} else 
							numberAsString = JOptionPane.showInputDialog("Invalid! Please enter number " + i + ": ");

					} else
						numberAsString = JOptionPane.showInputDialog("Invalid! Please enter number " + i + ": ");

					
					numberOfDots = 0;  //reset numberOfDots = 0 to avoid logical errors
				
				
				} else
					numberAsString = JOptionPane.showInputDialog("Invalid! Please enter number " + i + ": ");

			
			} //end of while loop (to validate the number)

			
			number = (float) numberAsDouble;
			sum += number;

		} //end of for loop which iterates 5 times



		//Printing out the result
		JOptionPane.showMessageDialog(null 
				, "The sum of the numbers entered was: " + sum
				, "Sum of Numbers"
				, JOptionPane.INFORMATION_MESSAGE );


		System.exit(0);

	} //end of main method

}
