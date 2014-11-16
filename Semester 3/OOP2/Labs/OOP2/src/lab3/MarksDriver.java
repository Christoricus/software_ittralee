package lab3;
import java.util.Scanner;
/*  In a separate class, write a driver program
 * which will ask the user to enter the 3 marks, calculate the result (using the method from the other
 * class), and output the result to a dialog.
 */

public class MarksDriver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Marks naz = new Marks();
		
		System.out.print("What did you get in your classroom CA? ");
		Marks.setClassCA(in.nextDouble());
		
		System.out.print("What did you get in your hand-in CA? ");
		Marks.setHandinCA(in.nextDouble());
		
		System.out.print("What did you get in your final? ");
		Marks.setFinalExam(in.nextDouble());
		
		//Calculate the weighted mark for the three marks
		System.out.println("\nOverall weighted mark: " + Marks.calcOverallMark());
		
		in.close();
	}//end of main
}
