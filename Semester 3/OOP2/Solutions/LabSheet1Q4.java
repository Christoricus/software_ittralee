/** Program playing with String methods 
 @author Thomas Bermingham
 @version 1.0
 */


import javax.swing.*;


public class LabSheet1Q4{
	
	public static void main(String[]args){
		
		String fullName;
		int iSpace;
		fullName = JOptionPane.showInputDialog("Please Enter your full name");
		
		JTextArea output = new JTextArea();
		output.setText("Length of name: " + fullName.length());
		
		output.append("\nFirst Initial: " + fullName.charAt(0));
		
		output.append("\nIn Capitals: " + fullName.toUpperCase());
		
		iSpace = fullName.lastIndexOf(" ");
		
		String surname = fullName.substring(iSpace+1);
		
		output.append("\nLast name: " + surname); 
		
		JOptionPane.showMessageDialog(null,output);
		
	}
	
}