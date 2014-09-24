//Group1Assess2Soln.java
/*This program reads in 5 username/password combinations and validates the password according to
 *a set of criteria. It then uses a text-area to display the valid username/password combinations*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Group1Assess2Soln {
	public static void main(String args[])
		{
			String username, password, allValidCombos="";
			boolean valid;
			int digitCount=0,j;
			
			JTextArea textArea = new JTextArea();
			Font font = new Font("monospaced",Font.PLAIN,11);
			textArea.setFont(font);
			
			for(int i=1;i<=5;i++)
				{
					username = JOptionPane.showInputDialog("Please enter the username of person " + i);
					password = JOptionPane.showInputDialog("Please enter the password of person " + i);
					
					valid=false;
					
					while(!valid)
						{
							digitCount=0;
							if(password.length()>=8 && password.length()<=15)
								{
									for(j=0;j<password.length();j++)
										if(!Character.isDigit(password.charAt(j)) && !Character.isLetter(password.charAt(j)))
											break;
										else if(Character.isDigit(password.charAt(j)))
											digitCount++;
										
									if(j==password.length())
										if(digitCount>=3)
											{
												valid = true;
												allValidCombos += String.format("%-25s%s\n",username,password);
											}
										else
											password = JOptionPane.showInputDialog("Password must contain at least 3 digits! Please re-enter the password of person " + i);					
									else
										password = JOptionPane.showInputDialog("Password must only contain letters and digits! Please re-enter the password of person " + i);
		
								}
							else
								password = JOptionPane.showInputDialog("Invalid password length! Please re-enter the password of person " + i);
						}		
				}
				
		    textArea.append("The valid username/password combinations are:\n\n" + allValidCombos);
			
			JOptionPane.showMessageDialog(null,textArea,"Valid Combinations",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);						
		}		
}