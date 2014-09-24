//PS1Qe.java
/*This program illustrates using the Scanner class*/

import java.util.Scanner;

public class PS1Qe {
	public static void main(String args[])
	{
		int age;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		input.nextLine();
		
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		
		System.out.println("Your name is  " + name + " and you are " + age + " years old");
	}
}