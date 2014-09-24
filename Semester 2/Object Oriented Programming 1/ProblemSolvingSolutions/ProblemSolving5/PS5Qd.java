//PS5Qd.java
/*This program processes the details of an arbitrary number of zoo animals, displaying the details neatly
 *aligned after the loop finishes. It also determines the details of the lightest and heaviest animals and also
 *the weight range, through a user-defined method. This version also validates the date of birth to a large extent*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PS5Qd {
	public static void main(String args[])
		{	
			String name,dateOfBirth,weightAsString,lightestName="",lightestDOB="",heaviestName="",heaviestDOB="";
			int i=1,dayPart,monthPart,yearPart;
			float weight,heaviest=0,lightest=1E38f;
			boolean valid;
			
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
					
					valid = false;
					
				 	while(!valid)
				 		{
				 			if(dateOfBirth.length() == 10)
				 				{
				 			
				 			     if(dateOfBirth.charAt(2)== '/' && dateOfBirth.charAt(5) == '/' && 
				 			     	Character.isDigit(dateOfBirth.charAt(0)) &&
				 				    Character.isDigit(dateOfBirth.charAt(1)) && Character.isDigit(dateOfBirth.charAt(3))&&
				 				    Character.isDigit(dateOfBirth.charAt(4)) && Character.isDigit(dateOfBirth.charAt(6)) &&
				 				    Character.isDigit(dateOfBirth.charAt(7)) && Character.isDigit(dateOfBirth.charAt(8)) &&
				 				    Character.isDigit(dateOfBirth.charAt(9)))	
				 					{
				 						dayPart = Integer.parseInt(dateOfBirth.substring(0,2));
										monthPart = Integer.parseInt(dateOfBirth.substring(3,5));
										yearPart = Integer.parseInt(dateOfBirth.substring(6,10));
										
										if(dayPart>=1 && dayPart<=31 && monthPart>=1 && monthPart<= 12 && yearPart>=1900 &&
				 						   yearPart<=2014)
				 								valid = true;
				 						else	
				 							dateOfBirth = JOptionPane.showInputDialog("Invalid!Please re-enter the "
				 			    		  	+ "date of birth of animal "  + i + " in the form dd/mm/yyyy");
				 					}	
								 else		
									 dateOfBirth = JOptionPane.showInputDialog("Invalid!Please re-enter the "
				 			  		 + "date of birth of animal "  + i + " in the form dd/mm/yyyy");	
				 	    		}
				 	    	else
				 	    	    dateOfBirth = JOptionPane.showInputDialog("Invalid!Please re-enter the "
				 			  	+ "date of birth of animal "  + i + " in the form dd/mm/yyyy");
				 		}	
					
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
		 	
			
			
		


	