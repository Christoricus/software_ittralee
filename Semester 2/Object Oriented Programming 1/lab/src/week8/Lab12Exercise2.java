package week8;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Lab12Exercise2 {
	
	public static void main(String[] args)
	{
		int[] idNumber =  new int[2];
		float[] height = new float[2];
		char[] grade = new char[2];
		int searchID, keyPosition;
		String positionAsString;
		
		populateArrays( idNumber, height, grade );
		
		displayTable( idNumber, height, grade );
		
		positionAsString = JOptionPane.showInputDialog("Please enter the id number of the student you seek" );
		searchID = Integer.parseInt(positionAsString);
		
		keyPosition = linearSearch( idNumber, searchID );
		
		if ( keyPosition != -1 ) {
			JOptionPane.showMessageDialog(null, "The details of the student are as follows\n"
					+ "ID Number ------- " + searchID 
					+ "\nHeight    ------- " + height[keyPosition]
					+ "\nAverage Grade --- " + grade[keyPosition]
					, "Student Details", JOptionPane.INFORMATION_MESSAGE);
		} else
			JOptionPane.showMessageDialog(null, "Sorry - the student ID " + searchID + " you are seeking"
					+ " is not found!", "Student Details", JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
	
	}
	
	//Populate Student ID Number, Heights & Grades
	public static void populateArrays( int[] id, float[] height, char[] grade )
	{
		String idNum, studentHeight, studentGrade;
		
		for (int i = 0; i < id.length; i++)
		{
			idNum = JOptionPane.showInputDialog("Please enter the ID number of student " + (i+1));
			id[i] = Integer.parseInt(idNum);
			
			studentHeight = JOptionPane.showInputDialog("Please enter the height of student " + (i+1));
			height[i] = Float.parseFloat(studentHeight);
			
			studentGrade = JOptionPane.showInputDialog("Please enter the average grade of student " + (i+1));
			grade[i] = studentGrade.toUpperCase().charAt(0);
			
		}
	}
	
	//Displaying the student information within TextArea
	public static void displayTable( int[] id, float[] height, char[] grade )
	{
		JTextArea textArea = new JTextArea(10, 20);
		Font myFont = new Font("monospaced", Font.PLAIN, 12);
		
		textArea.setFont(myFont);
		textArea.setText( String.format("%-13s %-10s %-15s\n", "Student ID", "Height", "Average Grade"));
		textArea.append( String.format("%-13s %-10s %-15s\n", "----------", "------", "-------------"));
		
		for (int i = 0; i < id.length; i++)
		{
			textArea.append( String.format("%-13d %-10.2f %-15c\n", id[i], height[i], grade[i]));

		}
		
		JOptionPane.showMessageDialog(null, textArea, "All Student Details", JOptionPane.INFORMATION_MESSAGE);

	}
	
	//Searching for a specific value within the array
	public static int linearSearch(int[] id, int key)
	{
		for (int i = 0; i < id.length; i++)
		{
			if (id[i] == key)
				return i;
		}
		
		return -1;
	}

}
