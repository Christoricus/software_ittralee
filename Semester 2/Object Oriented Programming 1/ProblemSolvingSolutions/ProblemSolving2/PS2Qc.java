//PS2Qc.java
/*A program that asks the user to enter a whole number and determines whether it it
 *odd or even*/
 
import java.util.Scanner;

public class PS2Qc {
	public static void main(String args[]) 
	{
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a whole number: ");
		num = input.nextInt();
		
		
		if(num % 2 == 0)
			System.out.println("\nYou entered an even number");
		else
			System.out.println("\nYou entered an odd number");
	    
	}
}