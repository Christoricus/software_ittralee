package lab1;
import javax.swing.*;

// This program converts British Sterling Pound to Euro
/* The program runs arbitrary amount of times until user enters 0
 * 
 */

public class Lab1_q1 {
	
	public static void main(String[] args)
	{
		double exchangeRate, sumEntered = 0d;
		
		exchangeRate = Double.parseDouble(JOptionPane.showInputDialog("What is the exchange rate?"));
		sumEntered = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount: "));

		while (sumEntered > 0) {
						
			String message = String.format("£%.2f British pound = €%.2f", exchangeRate, (exchangeRate*sumEntered));
			
			JOptionPane.showMessageDialog(null, message, "The exchange rate is: " + exchangeRate
					, JOptionPane.INFORMATION_MESSAGE);
			
			sumEntered = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount again: "));

		}
		
		System.exit(0);
		
		//The type of while loop needed in this program is called Sentinel Loop.
		//The digit 0 is the sentinel in this case.
		
	}

}
