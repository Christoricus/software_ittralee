package Assess2013One;
import java.util.Scanner;
public class AssessOne {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the slope of the first line: ");
		float s1 = input.nextFloat();
		
		System.out.print("Please enter the slope of the second line: ");
		float s2 = input.nextFloat();
		
		System.out.println("\n======================================\n\tProgram Results\n"
				+ "======================================");
		
		float result = (float)(1/s1)*(1/s2);
		if(result == -1)
			System.out.println("\nThe product of the slope is -1 so the lines must be perpendicular");
		else if(s1 == s2)
			System.out.println("\nThe slopes you entered are the same so the lines must be parallel");
		else
			System.out.println("\nThe lines involved here intersect but are not perpendicular each other");
		
		if(s1 == 0 && s2 == 0)
			System.out.println("\nBoth lines are parallel to the x-axis");
		else if(s1 == 0)
			System.out.println("\nOnly the first line is parallel to the x-axis");
		else if(s2 == 0)
			System.out.println("\nOnly the second line is parallel to the x-axis");
		else
			System.out.println("\nNeither lines are parallel to x-axis");
	}

}
