package lab1;
import java.awt.Font;
import javax.swing.*;

//This program uses JTextArea and Font to output user inputed data.
public class Lab1_q3 {
	
	public static void main(String[] args)
	{
		String name;
		double length, breadth, costPerSquare;
		
		JTextArea output = new JTextArea(14, 30);
		Font outputFont = new Font("monospaced", Font.PLAIN, 12);
		
		//user input
		name = JOptionPane.showInputDialog("What is your name?");
		length = Double.parseDouble(JOptionPane.showInputDialog("Length of room"));
		breadth = Double.parseDouble(JOptionPane.showInputDialog("Breadth of room"));
		costPerSquare = Double.parseDouble(JOptionPane.showInputDialog("Cost Per Square"));
		
		output.setFont(outputFont);
		//output.setText("Quotation for " + name +"\n");
		
		//Output console
		System.out.printf("%s%s\n%-20s%.2f m.\n%-20s%.2f m.\n%-20s%.2f sq. m.\n%-20s%.2f euro\n%-20s%.2f euro\n"
				, "Quotation for ", name, "Length of room: ", length, "Breadth of room: ", breadth,
				"Total area: ", (length*breadth), "Cost per square: ", costPerSquare,
				"Total cost: ", ((length*breadth)*costPerSquare) );
		
		output.append(String.format("%s%s\n%-20s%.2f m.\n%-20s%.2f m.\n%-20s%.2f sq. m.\n%-20s%.2f euro\n%-20s%.2f euro\n"
				, "Quotation for ", name, "Length of room: ", length, "Breadth of room: ", breadth,
				"Total area: ", (length*breadth), "Cost per square: ", costPerSquare,
				"Total cost: ", ( (length*breadth)*costPerSquare) ));
		
		//output JTextArea
		JOptionPane.showMessageDialog(null, output, "Quotation for " + name, JOptionPane.PLAIN_MESSAGE);
		
		
	}//ends main

}//end of class
