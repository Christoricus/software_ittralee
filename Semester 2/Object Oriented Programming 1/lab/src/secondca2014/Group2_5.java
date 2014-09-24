package secondca2014;
import javax.swing.JOptionPane;

public class Group2_5 {
	
	public static void main(String[] args)
	{
		boolean valid = false;
		String debitCard, doubleDigit = "";
		int i, j, k, l, totalSum = 0, singleDigitDoubled = 0, singleDigitDoubledSum = 0, doubleDigitDoubled = 0;
		int doubleDigitAdded = 0, doubleDigitDoubledSum = 0, otherNumAdded = 0;
		
		debitCard = JOptionPane.showInputDialog("Please enter a 16 digit credit card number");
		
		while (!valid)
		{
			if (debitCard.length() == 16 ) 
			{
				if ( debitCard.charAt(0) == '4')
				{
					for (i = 0; i < debitCard.length(); i++)
					{
						if (!Character.isDigit(debitCard.charAt(i)) )
							break;
					}
					
					
					if ( i == debitCard.length() ) {
					
						for (j = 0; j < debitCard.length(); j+= 2)
						{
							if ( Character.getNumericValue(debitCard.charAt(j)) < 4 )
							{
								singleDigitDoubled = debitCard.charAt(j)*2;
								singleDigitDoubledSum =+ singleDigitDoubled;
								System.out.println(singleDigitDoubled);
								
							} else {
								doubleDigitDoubled = debitCard.charAt(j)*2;
								doubleDigit = Integer.toString(doubleDigitAdded);
								
								for (k = 0; k < doubleDigit.length(); k++)
								{
									doubleDigitAdded += doubleDigit.charAt(k);
									doubleDigitDoubledSum += doubleDigitAdded;
								}
							}
						}
						
						//Add the second number and every third number
						for ( l = 1; l < debitCard.length(); l += 2)
						{
							if (Character.isDigit(debitCard.charAt(l)))
								otherNumAdded +=  debitCard.charAt(l);
							else
								break;
						}
						
						//Once all the calculation is done, add all of of them
						totalSum = otherNumAdded + singleDigitDoubledSum + doubleDigitDoubledSum;
						
						if ( totalSum % 10 == 0 )
							valid = true;
						else
							debitCard = JOptionPane.showInputDialog("Invalid! failed the golden rule - Please re-enter a 16 digit credit card number");
					
					} else
						debitCard = JOptionPane.showInputDialog("Invalid! Must be digits - Please re-enter a 16 digit credit card number");
				
				} else
					debitCard = JOptionPane.showInputDialog("Invalid! Must begin with 4 - Please re-enter a 16 digit credit card number");
			
			} else
				debitCard = JOptionPane.showInputDialog("Invalid length! Please re-enter a 16 digit credit card number");

			
			if (valid)
				JOptionPane.showMessageDialog(null, "The debit card number " + debitCard + " is valid"
						, "Valid!", JOptionPane.INFORMATION_MESSAGE);
		
		} //validating while loop
	
	
		System.exit(0);

	}

}
