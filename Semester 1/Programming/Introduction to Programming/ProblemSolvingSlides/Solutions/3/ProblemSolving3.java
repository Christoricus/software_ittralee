/* Write a program which asks the user for a whole number quantity in
 * inches and displays to the screen its equivalent in feet and incesh.
 */
import java.util.Scanner;
public class ProblemSolving3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an amount in inches: ");
		int inches = input.nextInt();
		
		int foot = inches / 12;
		int remainder = inches % 12;
		
		
		System.out.println(inches + "''" + " is equivalent to " + foot + "'" + remainder + "''" );
	}

}
