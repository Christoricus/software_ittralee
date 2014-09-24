package lab0;

import javax.swing.*;

public class Lab0_q5_rev1 {
	
	public static void main(String[] args)
	{
		
		String input;
		double num1, num2, total;
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
			
		}
		
	}

}
