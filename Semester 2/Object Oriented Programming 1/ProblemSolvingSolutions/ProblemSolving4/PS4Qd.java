//PS4Qd.java
/*This program processes the details of 3 ITT students, displaying the values in a nice, tabular fashion and also determines some
 *stats based on the values entered. This program also validates the tnumber value entered*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class PS4Qd {
	public static void main(String args[])
		{	
		 	String tNumber,ageAsString,gender,tNumberYoungest="";
		 	int age,youngest=0,totalAge=0,male=0,index;
		 	
		 	boolean valid;
		 	
		 	JTextArea textArea = new JTextArea();
		 	Font font = new Font("monospaced",Font.PLAIN,12);
		 	textArea.setFont(font);
		 	textArea.setText(String.format("%-15s%-5s%s\n%-15s%-5s%s\n\n","T-number","Age","Gender",
		 	                 "=========","====","======="));
		 	
		 	for (int i = 1; i <= 3; i++)
		 	  { 	  
		 		tNumber = JOptionPane.showInputDialog("Please enter the t-number of student " + i);
			 	
			 	valid=false;
			 	while(!valid)
			 		{
			 			if (tNumber.length() == 9 && (tNumber.charAt(0) == 't' || tNumber.charAt(0) == 'T'))
			 				{
			 				   	index = 1;
			 				   	 
					 			while(index < 9 && Character.isDigit(tNumber.charAt(index)))
					 					index++;
					 					
					 			if(index == 9)
					 				valid = true;
					 			else
					 				tNumber = JOptionPane.showInputDialog("Invalid!Please re-enter the "
					 			    		  + "t-number of student "  + i);
			 					
			 	    		}
			 	    	else
			 	    		tNumber = JOptionPane.showInputDialog("Invalid!Please re-enter the "
			 			  			      + "t-number of student "  + i);
			 			
			 		}
			 		
			 	ageAsString = JOptionPane.showInputDialog("Please enter the age of student " + i);
			
			    gender = JOptionPane.showInputDialog("Please enter the gender of student " + i);
			    
			    textArea.append(String.format("%-15s%-5s%s\n",tNumber,ageAsString,gender));
			    
			    age = Integer.parseInt(ageAsString);
			    
			    if(i==1)
			        {
			    	  youngest = age;
			    	  tNumberYoungest = tNumber;
			        }
			    else if(age<youngest)
			    	{
			    	  youngest = age;
			    	  tNumberYoungest = tNumber;
			    	}
			    	
			    totalAge+=age;
			    
			    if(gender.equals("male"))
			    	male++;
			    
			       
		 	  }
		 	
		 	String stats = "\n\n**********Program Stats**********" +
        		  "\n\n% of male students: " + String.format("%.1f",male/3f*100) +
        		  "\n% of female students: " + String.format("%.1f",100-male/3f*100) +
                  "\nThe youngest student processed was : " + tNumberYoungest +
                  " at " + youngest + " years old" +
                  "\nAverage age of students: " +  String.format("%.1f",averageAge(totalAge));
                  
            textArea.append(stats);
                  
                   
		 	JOptionPane.showMessageDialog(null,textArea,"Student Details",JOptionPane.INFORMATION_MESSAGE);
		 	
		 	System.exit(0);
			    
		}
			
	public static float averageAge(int totalAge)
		{
			return totalAge/3f;
		}
}	    
			 	
		 	
		 	
		 	
			 
			
			
			
			
			
		


	