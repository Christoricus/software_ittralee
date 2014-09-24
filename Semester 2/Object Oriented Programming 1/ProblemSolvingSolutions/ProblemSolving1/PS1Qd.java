//PS1Qd.java
/*This program illustrates using the Scanner class*/

import java.util.Scanner;

public class PS1Qd {
	public static void main(String args[])
	{
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		System.out.println("You are " + age + " years old");
	}
}