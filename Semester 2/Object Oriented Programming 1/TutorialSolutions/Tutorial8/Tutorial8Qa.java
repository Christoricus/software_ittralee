//Tutorial8Qa.java
/*This program uses a for loop to display the end of year balance
 *for a bank account based on a certain initial investment amount and interest rate*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Tutorial8Qa {
	public static void main(String args[])
		{
			String interestRateAsString, yearsAsString,initialBalanceAsString;
			int years,i;
			float interestRate,balance,interest;
			
			JTextArea textArea = new JTextArea(15,40);
			Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
			textArea.setFont(textAreaFont);
			
			initialBalanceAsString = JOptionPane.showInputDialog("Please enter the initial balance:");
			balance = Float.parseFloat(initialBalanceAsString);
			
			interestRateAsString = JOptionPane.showInputDialog("Please enter the interest rate:");			
			interestRate = Float.parseFloat(interestRateAsString);
			
			yearsAsString = JOptionPane.showInputDialog("How many years do you wish to invest for:");
			years = Integer.parseInt(yearsAsString);
			
									
			for(i=1;i<=years;i++)
				{
					interest = balance * interestRate / 100;
					balance += interest;
					
					textArea.append("The balance at the end of year " + i + " is " + 
									String.format("EUR%.2f",balance)+ "\n");	
				}
			
			JOptionPane.showMessageDialog(null,textArea,"Bank Details",JOptionPane.PLAIN_MESSAGE);
								
			System.exit(0);										
		}				
}			
		