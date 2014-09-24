//Exercise2.java
/*This program uses a JTextArea to display a table of values in a nicely aligned form
 *within a message dialog*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Exercise2{
	public static void main(String args[])
		{
			String name,tNumber,course,averageMarkAsString;
			float averageMark;
			int i=1;
			
			JTextArea textArea = new JTextArea();
			
			Font font = new Font("monospaced",Font.PLAIN,12);
			
			textArea.setFont(font);
				
			textArea.append(String.format("%-25s%-15s%-25s%-8s\n%-25s%-15s%-25s%-8s\n\n",
			                      					  "Name","T-Number","Course","Avg Mark",
			                      					  "====","========","======","========"));
		
			
			while(i<=5)
				{
					 name = JOptionPane.showInputDialog("\n\nPlease enter the name of student " + i);
					 tNumber = JOptionPane.showInputDialog("\n\nPlease enter the t-number of student " + i);
					 course = JOptionPane.showInputDialog("\n\nPlease enter the course of student " + i);
					 averageMarkAsString = JOptionPane.showInputDialog("\n\nPlease enter the average mark of student " + i);
					 
					 averageMark = Float.parseFloat(averageMarkAsString);
					 
					 textArea.append(String.format("%-25s%-15s%-25s%8.2f\n",name,tNumber,course,averageMark));
					 
					 i++;
					       
				}
							
			
		    JOptionPane.showMessageDialog(null,textArea,"Formatted Data", 
		    	                          JOptionPane.INFORMATION_MESSAGE);
				  
			System.exit(0);
		}
			
}


