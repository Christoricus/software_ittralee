//Exercise3.java
/*This program reads in a list of students exam marks and determines and displays the
average mark. It then uses this to list all marks above the average. It adds to the 
original version by also displaying the highest and lowest marks entered*/

import javax.swing.JOptionPane;

public class Exercise3 {
      public static void main(String args[])
      { 
		int marks[] = new int[10];
		int total=0, i, highestMark=0, lowestMark=0;
		String text, markAsString; 
		double average;

      	for (i = 0; i < marks.length; i++)
      	 {
	   			markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
	   			marks[i] = Integer.parseInt(markAsString);
	   			total += marks[i];
	   			
	   			if(i==0)
	   				{
	   					highestMark = marks[i];
	   					lowestMark = marks[i];			
	   				}
	   			else
	   				{
	   					if(marks[i] > highestMark)
	   						highestMark = marks[i];
	   					
	   					if(marks[i] < lowestMark)
	   						lowestMark = marks[i];
	   				}	   			
      	 }

      	average = (double)total/marks.length;

      	JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
      	average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);

        text = "List of marks above the average is :\n\n";
      	for (i = 0; i < marks.length; i++)
	  			if (marks[i] > average)
	       			text += marks[i] + " ";
	    
		JOptionPane.showMessageDialog(null,text,"Marks Above Average",
		JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"The highest mark entered is " + highestMark +
		"\nThe lowest mark entered is " + lowestMark,"Highest/Lowest Marks",
		JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
     }

}


             
                    
                           
                                  
                                                
       