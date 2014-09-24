//ProblemSolving5MarksAndGrades.java
/*Program that determines what the appropriate grade is based on the user-supplied GPA*/

import java.util.Scanner;

public class ProblemSolving5MarksAndGrades{
	public static void main(String args[])
	{
		String grade;
		float gpa;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your grade point average between 0 and 5: ");
		gpa = input.nextFloat();
		
		if(gpa>=4)
			grade = "A";
		else if(gpa>=3.5)
			grade = "B";
		else if(gpa>=3)
			grade = "C";
		else if(gpa>=2)
			grade = "D";
		else
			grade = "F";
		
		
		System.out.printf("\nYou got a %s grade",grade);
			
			
		System.out.println("\n\n\n");
				                 		
	}
}

