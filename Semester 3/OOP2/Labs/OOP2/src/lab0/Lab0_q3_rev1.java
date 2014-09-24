package lab0;

import javax.swing.*;

public class Lab0_q3_rev1 {
	
	public static void main(String[] args)
	{
		String name;
		double income, totalTax, taxRate = 0;
		
		name = JOptionPane.showInputDialog("What is your name? ");
		income = Double.parseDouble(JOptionPane.showInputDialog("What is your income?"));
		

		if ( income <= 20000 ) {
			totalTax = 0f;
			taxRate = 0f;
		} else if ( income <= 36000) {
			totalTax = income * 0.2f;
			taxRate = 20f;
		} else {
			totalTax = 36000 * 0.2d + (income - 36000) * 0.41d;
			taxRate = 41f;
		}
		
		
		String message = String.format("Name: %s\nGross income: %.2f\nTax rate: %.2f\nTax due: %.2f\nNet income: %.2f"
				, name, income, taxRate, totalTax, (income-totalTax) );
		
		JOptionPane.showMessageDialog(null, message);
		//System.exit(0);
		
	}

}
