//Exercise4.java
/*This program uses 2 parallel arrays to simultaneously store a list of student names 
 *along with their associated marks.It then processes both arrays and displays the 
 *names of all the students whose mark was above the average*/

import javax.swing.JOptionPane;

public class Exercise4 {
      public static void main(String args[])
      { 
		int marks[] = new int[3];
		String names[] = new String[3];
		int total=0, i;
		String text, markAsString; 
		double average;

      	for (i = 0; i < marks.length; i++)
      	 {
	   			markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
	   			marks[i] = Integer.parseInt(markAsString);
	   			total += marks[i];
	   			
	   			names[i] = JOptionPane.showInputDialog("Enter name for student " + (i+1));	   			
      	 }

      	average = (double)total/marks.length;

      	JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
      	average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);

        text = "The following students have marks above the average :\n\n";
      	for (i = 0; i < marks.length; i++)
	  			if (marks[i] > average)
	       			text += names[i] + ", ";
	    
	    text = text.substring(0,text.length()-2);
		JOptionPane.showMessageDialog(null,text,"Above Average Students",
		JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
     }

}


             
                    
                           
                                  
                                                
       