package week3;
import javax.swing.JOptionPane;

//BankAccountMethod.java
/* This program uses many methods - some to read in a customers account details
 * and another method to check if the customers credit limit is exceeded.
 */

public class Lab6Exercise2 {

	public static void main( String[] args )
	{
		String accountNumber;
		float balance, debits, credits, creditLimit;

		accountNumber = getCustomerAccountNumber();

		//accountNumber = JOptionPane.showInputDialog( "Enter account number <CR to exit>" );

		while( !accountNumber.equals( "" ) ) 
		{
			balance = getCustomerBalance();
			debits = getCustomerDebits();
			credits = getCustomerCredits();
			creditLimit = getCustomerCreditLimit();

			displayResults( accountNumber, balance, debits, credits, creditLimit );

			accountNumber = getCustomerAccountNumber();

		}

		JOptionPane.showMessageDialog( null
				, "Thank you for using the system...goodbye"
				, "Exiting sytem...."
				, JOptionPane.PLAIN_MESSAGE );

		System.exit(0);

	}

	//Find the account number of the customer
	public static String  getCustomerAccountNumber()
	{
		String accountNumber;
		
		accountNumber = JOptionPane.showInputDialog( "Enter account number <CR to exit>");
		
		return accountNumber;
	}
	
	public static float getCustomerBalance()
	{
		float balance;
		String balanceAsString;
		balanceAsString = JOptionPane.showInputDialog( "Enter account balance" );
		balance = Float.parseFloat(balanceAsString);
		return balance;
	}

	public static float getCustomerDebits()
	{
		float debits;
		String debitsAsString;
		debitsAsString = JOptionPane.showInputDialog( "Enter total debits" );
		debits = Float.parseFloat(debitsAsString);
		return debits;
	}

	public static float getCustomerCredits()
	{
		float credits;
		String creditsAsString;
		creditsAsString = JOptionPane.showInputDialog( "Enter total credits" );
		credits = Float.parseFloat(creditsAsString);
		return credits;
	}

	public static float getCustomerCreditLimit()
	{
		float creditLimit;
		String creditLimitAsString;
		creditLimitAsString = JOptionPane.showInputDialog( "Enter credit limit" );
		creditLimit = Float.parseFloat(creditLimitAsString);
		return creditLimit;
	}

	public static boolean checkCreditLimit( float balance, float limit  )

	{
		
		boolean result;
	
		if ( balance < -limit ) { result = true; }
		else { result = false; }


		return result;
		
	}
	
	public static void displayResults( String accountNumber, float balance, float debits
			, float credits, float creditLimit )
	{
		
		float newBalance;
		newBalance = balance - debits + credits;
		
		String text = "\nAccount number  ==> " + accountNumber + "\nCredit Limit        "
				+ "    ==> " + String.format("%.2f", creditLimit) + "\nNew balance      "
				+ "  ==> " + String.format("%.2f", newBalance);
		
		
		
		if( checkCreditLimit( newBalance, creditLimit ) ) {
			text += "\n\nSorry - credit limit has been exceeded";
		} else {
			text += "\n\nCredit limit has not been exceeded";
		}
		
		JOptionPane.showMessageDialog( null
				, text
				, "Account Details"
				, JOptionPane.PLAIN_MESSAGE );
	
	}

}
