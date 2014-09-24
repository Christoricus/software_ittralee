//Tutorial2Qb.java
/*A program which reads in the type of exactly 10 animals and displays some information about them*/

import java.util.Scanner;

public class Tutorial2Qb {
	public static void main(String args[]) 	
	{
		String animal,startWitht="",endWithn="",containi="",containMoreThan8="",containBetween6And12="";
			
		Scanner input = new Scanner(System.in);

		for(int i=1;i<=10;i++)
		{
			System.out.print("Please enter the type of animal " + i + ": ");
			animal = input.nextLine();
			
			if(animal.charAt(0)=='t')
				startWitht += animal + " ";
				
			if(animal.charAt(animal.length()-1)=='n')
				endWithn += animal + " ";
				
			for(int j=0;j<animal.length();j++)
				if(animal.charAt(j)=='i')
					{
						containi += animal + " ";
						break;
					}
			
			if(animal.length()>8)
				containMoreThan8 += animal + " ";
				
			if(animal.length()>=6 && animal.length()<=12)
				containBetween6And12 += animal + " ";
				
		}
		
		System.out.println("\nThe list of animals beginning with 't' is : " + startWitht +
			               "\nThe list of animals ending with 'n' is: " + endWithn + 
			               "\nThe list of animals containing 'i' is: " + containi +
			               "\nThe list of animals with over 8 characters is: " + containMoreThan8 +
			               "\nThe list of animals with between 6 and 12 characters inclusive is: " + containBetween6And12);
	}
}