//Exercise1.java
/*This program uses a for loop which displays the sum of the first
 *20 positive integers*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			int sum=0;
				
			for(int i=0;i<=20;i++)
				{
				   sum+=i;	
				}		
			System.out.println("The sum of the first 20 positive integers is " + sum);													
		}		
}


