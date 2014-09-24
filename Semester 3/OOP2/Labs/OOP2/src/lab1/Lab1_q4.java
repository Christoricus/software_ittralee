package lab1;
import javax.swing.*;
import java.awt.Font;

//Discovering some methods from the String class; identifying variables, objects and methods used.
public class Lab1_q4 {
	public static void main(String[] args) {
		/* (i) 
		 * char charAt(int index), 
		 * int length(), 
		 * String toUpperCase(), 
		 * String substring(int beginIndex, int endIndex), 
		 * int lastIndexOf(int ch)
		 * 
		 * (ii) They all belong to the String class
		 */
		String name, surname;
		char initial;
		
		JTextArea output = new JTextArea();
		Font outputFont = new Font("Courier", Font.BOLD, 16);
		output.setFont(outputFont);
		
		//input
		name = JOptionPane.showInputDialog("Enter your full name");
		initial = name.charAt(0);
		surname = name.substring(name.lastIndexOf(" "), name.length());
		
		//output to console
		System.out.print("The number of characters in the name: " + name.length()
				+ "\nThe initial of the firstname: " + initial
				+ "\nEntirely in capital: " + name.toUpperCase()
				+ "\nSurname: " + surname);
		
		output.setText("The number of characters in the name: " + name.length()
				+ "\nThe initial of the firstname: " + initial
				+ "\nEntirely in capital: " + name.toUpperCase()
				+ "\nSurname: " + surname);
		
		//output to JTextArea
		JOptionPane.showMessageDialog(null, output, "Discovering the String class", JOptionPane.PLAIN_MESSAGE);
		
	}

}
