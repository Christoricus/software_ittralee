//PS2Qa.java
/*A program that will test to see if user is less than 20. If they are a simple
 *message will be displayed, otherwise the program will indicate they are at least 20*/
 
import java.util.Scanner;

public class PS2Qa {
	public static void main(String args[]) 
	{
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		if(age<20)
			System.out.println("\n\nYou are less than 20 years old");
		else
			System.out.println("\n\nYou are at least 20 years old");
	}
}