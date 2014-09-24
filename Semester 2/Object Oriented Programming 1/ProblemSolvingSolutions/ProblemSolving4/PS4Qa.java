//PS4Qa.java
/*This program processes the details of 3 ITT students, displaying the values in a nice, tabular fashion*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PS4Qa {
	public static void main(String args[])
		{	
		 	String tNumber,ageAsString,gender;
		 	
		 	JTextArea textArea = new JTextArea();
		 	Font font = new Font("monospaced",Font.PLAIN,12);
		 	textArea.setFont(font);
		 	textArea.setText(String.format("%-15s%-5s%s\n%-15s%-5s%s\n\n","T-number","Age","Gender",
		 	                 "=========","====","======="));
		 	
		 	for (int i = 1; i <= 3; i++)
		 	  { 	  
		 		tNumber = JOptionPane.showInputDialog("Please enter the t-number of student " + i);
			 	
			 	ageAsString = JOptionPane.showInputDialog("Please enter the age of student " + i);
			
			    gender = JOptionPane.showInputDialog("Please enter the gender of student " + i);
			    
			    textArea.append(String.format("%-15s%-5s%s\n",tNumber,ageAsString,gender));   
		 	  }
		 	  
		 	JOptionPane.showMessageDialog(null,textArea,"Student Details",JOptionPane.INFORMATION_MESSAGE);
		 	
		 	System.exit(0);
			    
		}
}	    
					 