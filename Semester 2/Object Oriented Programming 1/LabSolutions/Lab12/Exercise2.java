//Exercise2.java
/*This program uses 3 parallel arrays and uses them to perform some input and 
 *output in a nice easy-to-read tabular fashion. It also has a linear search.*/

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class Exercise2 {
    public static void main(String args[])
      {
			int idNums[] = new int[2];	
			int searchID, subscript;
			float heights[] = new float[2];
			char grades[] = new char[2];
			String text = "",searchIDAsString;
		
			populateArrays(idNums,heights,grades);
			
			displayTable(idNums,heights,grades);
			
			searchIDAsString = JOptionPane.showInputDialog("Please enter the id number of the" + 
			" student you seek: ");
			
			searchID = Integer.parseInt(searchIDAsString);

			subscript = linearSearch(idNums,searchID);
			
			if(subscript != -1)
			    {
			    	text += "The details of the student are as follows:";
			    	text += String.format("\n%-22s","ID number ......... ") + searchID;
			    	text += String.format("\n%-22s","Height    ......... ") + heights[subscript];
			    	text += String.format("\n%-22s","Average Grade ..... ") + grades[subscript];
			    
			    	JOptionPane.showMessageDialog(null,text,"Student Details",
			    	JOptionPane.INFORMATION_MESSAGE);
			    }
			else
				JOptionPane.showMessageDialog(null,"Sorry ... no student with that " +
				"id number exists!","Student Details",JOptionPane.INFORMATION_MESSAGE);
				
			System.exit(0);
			    
	   }

	public static void populateArrays(int id[],float ht[],char gr[])
		{
			int i;
			String IDAsString,heightAsString,gradeAsString;
			
			for(i = 0; i < id.length; i++)
				{
					IDAsString = JOptionPane.showInputDialog("\n\nPlease enter the ID number " +
					"of student " + (i+1));	
					id[i] = Integer.parseInt(IDAsString);
					
					heightAsString = JOptionPane.showInputDialog("\n\nPlease enter the height " +
					"of student " + (i+1));	
					ht[i] = Float.parseFloat(heightAsString);					
					
					gradeAsString = JOptionPane.showInputDialog("\n\nPlease enter the grade " +
					"of student " + (i+1));	
					gr[i] = gradeAsString.charAt(0);
					
				}
		}

	public static void displayTable(int id[],float ht[],char gr[])
		{
			int i;
			String text = "";
			
			Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
			
			JTextArea textArea = new JTextArea(10,20);
			
			textArea.setFont(textAreaFont);
			
			text += String.format("%-13s%-10s%-15s","Student ID","Height","Average Grade");
			text += String.format("\n%-13s%-10s%-15s","----------","-------","-------------");
			
			for(i = 0;i < id.length;i++)
				text += String.format("\n%-13d%-10.2f%-15c",id[i],ht[i],gr[i]);
			
			textArea.append(text);
				
			JOptionPane.showMessageDialog(null,textArea,"All Student Details",
			JOptionPane.INFORMATION_MESSAGE);
		}

	public static int linearSearch(int numbers[], int key)
		{
	      int i;
	      for(i = 0; i < numbers.length; i++)
		  	  if (numbers[i] == key)
		          return i;
	
	      return -1;
		}
  	 
}

       	
       	
       	
       	
       