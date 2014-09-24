//PS5Qa.java
/*This program processes the details of an arbitrary number of zoo animals, displaying the details neatly
 *aligned after the loop finishes*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PS5Qa {
	public static void main(String args[])
		{	
			String name,dateOfBirth,weightAsString;
			int i=1;
			
			JTextArea textArea = new JTextArea();
			Font font = new Font("monospaced",Font.PLAIN,12);
			textArea.setFont(font);
			textArea.setText(String.format("%-15s%-10s%s\n%-15s%-10s%s\n\n","Name","Weight","Date of Birth",
				                                                          "----","------","-------------"));

			name = JOptionPane.showInputDialog("Please enter the name of animal " + i);
			
			while(!name.equals(""))
				{
					weightAsString = JOptionPane.showInputDialog("Please enter the weight of animal " + i);
					dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth of animal " + i + " in the form dd/mm/yyyy");
					
					textArea.append(String.format("%-15s%-10s%s\n",name,weightAsString,dateOfBirth));
					
					i++;
		
					name = JOptionPane.showInputDialog("Please enter the name of animal " + i);
					
				}
			JOptionPane.showMessageDialog(null,textArea,"Animal Details",JOptionPane.INFORMATION_MESSAGE);	
			
			System.exit(0);
		}
}


			 		
			 		
			 
			 
			
			
			
			
			
		


	