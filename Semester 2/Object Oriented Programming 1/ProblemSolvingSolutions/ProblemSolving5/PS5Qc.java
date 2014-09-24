//PS5Qc.java
/*This program processes the details of an arbitrary number of zoo animals, displaying the details neatly
 *aligned after the loop finishes. It also determines the details of the lightest and heaviest animals and also
 *the weight range, through a user-defined method*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PS5Qc {
	public static void main(String args[])
		{	
			String name,dateOfBirth,weightAsString,lightestName="",lightestDOB="",heaviestName="",heaviestDOB="";
			int i=1;
			float weight,heaviest=0,lightest=1E38f;
			
			JTextArea textArea = new JTextArea();
			Font font = new Font("monospaced",Font.PLAIN,12);
			textArea.setFont(font);
			textArea.setText(String.format("%-15s%-10s%s\n%-15s%-10s%s\n\n","Name","Weight","Date of Birth",
				                                                          "----","------","-------------"));

			name = JOptionPane.showInputDialog("Please enter the name of animal " + i);
			
			while(!name.equals(""))
				{
					weightAsString = JOptionPane.showInputDialog("Please enter the weight of animal " + i);
					weight = Float.parseFloat(weightAsString);
					
					dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth of animal " + i + " in the form dd/mm/yyyy");
					
					if(weight>heaviest)
						{
							heaviest = weight;
							heaviestName = name;
							heaviestDOB = dateOfBirth;	
						}
					else if(weight<lightest)
						{
							lightest = weight;
							lightestName = name;
							lightestDOB = dateOfBirth;	
						}
					
					textArea.append(String.format("%-15s%-10s%s\n",name,weightAsString,dateOfBirth));
					
					i++;
		
					name = JOptionPane.showInputDialog("Please enter the name of animal " + i);	
				}
			textArea.append("\n\nDetails of heaviest animal: " + heaviestName + " " + heaviest + " " + heaviestDOB +
				            "\nDetails of lightest animal: " + lightestName + " " + lightest + " " + lightestDOB +
				            "\nWeight Range is : " + String.format("%.0f",weightRange(lightest,heaviest)) + "kg");
				            
			JOptionPane.showMessageDialog(null,textArea,"Animal Details",JOptionPane.INFORMATION_MESSAGE);	
			
			System.exit(0);
		}
		
	public static float weightRange(float lightest,float heaviest)
		{
			return heaviest-lightest;	
		}
}
		 

			 		
			 		
			 
			 
			
			
			
			
			
		


	