//Exercise1.java
/*This program reads in the users age and determines whether they are under 20 or not*/
import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			int age;
					
			Scanner input = new Scanner(System.in);
								
			System.out.print("Please enter your age: ");
				
			age = input.nextInt();					
				
			if(age < 20)
				System.out.println("\n\nYou are under 20 years old");	
		    else
				System.out.println("\n\nYou are at least 20 years old");
				
			}		
}