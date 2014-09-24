package lab0;

import javax.swing.*;
public class Lab0_q2_rev1 {
	
	public static void main(String[] args)
	{
		String  firstName, surName, initial;
		int totalCycled;
		double totalCost;
		
		//input
		firstName = JOptionPane.showInputDialog("Firstname: ");
		initial = JOptionPane.showInputDialog("Intial: ");
		surName = JOptionPane.showInputDialog("Surname: ");
		totalCycled = Integer.parseInt(JOptionPane.showInputDialog("Number Cycled: "));
		
		//process
		totalCost = totalCycled * 0.07;
		
		if (totalCycled > 10) 	
			totalCost = 10 *.07d + ((totalCycled-10) * 0.1);
		
		
		String message = String.format("Firstname: %s\nInitial: %s\nSurname: %s\n Total Cost: �%.2f", firstName, initial, surName, totalCost);
		JOptionPane.showMessageDialog(null, message);
		
	}
}
