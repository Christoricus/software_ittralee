package week8;
import java.util.Scanner;

//This program processes array using methods
public class ArrayMethods {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] marks = new int[10];
		
		readArray(marks);
		
		displayArray(marks);
	}
	
	public static void readArray(int[] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			System.out.print("Enter mark for student " + (i+1) + ": ");
			m[i] = input.nextInt();
		}
	}
	
	public static void displayArray(int[] m)
	{
		System.out.println("The contents of the array is: \n");
		
		for (int i = 0; i < m.length; i++)
		{
			System.out.print(m[i] + " ");
		}
	}

}
