package lab1;
import javax.swing.*;

/* This program uses "for" loop JTextArea to print Yards into Inches
 * 
 */

public class Lab1_q2 {
	
	public static void main(String[] args)
	{
		JTextArea output =  new JTextArea();
		
		output.setText("Yards	Inches\n");
		output.append("------	------\n");
		
		for (int yards = 1; yards < 11; yards++)
		{
			output.append(yards + "	" + yards*36 + "\n");
		}
		
		JOptionPane.showMessageDialog(null, output, "Yards to Inches"
				, JOptionPane.INFORMATION_MESSAGE);
		
	}//ends main

}//ends class
