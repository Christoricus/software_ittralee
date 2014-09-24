package lab0;

import javax.swing.*;
public class Lab0_q4_rev1 {

	public static void main(String[] args)
	{
		String numAsString;
		double newNum = 0f, totalNum = 0f;
		int numOfEntries = 0;

		numAsString =  JOptionPane.showInputDialog("Enter a number +ve or -ve (q to quit)" );

		while ( !numAsString.equals("q") )
		{
			newNum = Double.parseDouble(numAsString);

			totalNum += newNum;

			numOfEntries++;
			numAsString =  JOptionPane.showInputDialog("Enter a number +ve or -ve (q to quit)" );
		}

		if( numOfEntries > 0 ) {
			String message = String.format("# of Entries: %d\nTotal: %.2f", numOfEntries, totalNum);
			JOptionPane.showMessageDialog(null, message);
		}

	}

}
