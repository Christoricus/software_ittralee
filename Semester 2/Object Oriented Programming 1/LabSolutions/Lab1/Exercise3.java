//Exercise3.java
/*This program reads in a number of inches and converts it to feet and inches */
 
import java.util.Scanner;

public class Exercise3 {
	 public static void main(String args[])
		{
			int totalInches;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the total number of inches: ");
			totalInches = input.nextInt();
	   
			System.out.println("\n" + totalInches + "\"" + " is equivalent to " + totalInches/12 + "'" + 
				               (totalInches - 12*(totalInches/12)) + "\"");
				               	
				               
		}
}