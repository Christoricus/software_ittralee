package lab0;

import javax.swing.*;

public class Lab0_q6_rev2 {
	
	public static void main(String[] args)
	{
		String input;
		int check = 0;
		double num1, num2, total;
		
		while ( check == JOptionPane.YES_OPTION ) {
			
			input =  JOptionPane.showInputDialog("Enter A to +, S to -, M to * or D to /");
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 1"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 2"));			
			
			switch (input) {
			case "A":
				total = num1 + num2;
				JOptionPane.showMessageDialog(null, "The total is: " + total);
				break;

			case "S":
				total = num1 - num2;
				JOptionPane.showMessageDialog(null, "The total is: " + total);
				break;

			case "M":
				total = num1 * num2;
				JOptionPane.showMessageDialog(null, "The total is: " + total);
				break;

			case "D":
				total = num1 / num2;
				JOptionPane.showMessageDialog(null, "The total is: " + total);
				break;

			default:
				JOptionPane.showMessageDialog(null, "You entered a wrong command!");

			} //end of switch
			
			
			check = JOptionPane.showConfirmDialog(null, "Please choose an option", "Choose Yes or No", JOptionPane.YES_NO_OPTION);
			
		}

	}

}
