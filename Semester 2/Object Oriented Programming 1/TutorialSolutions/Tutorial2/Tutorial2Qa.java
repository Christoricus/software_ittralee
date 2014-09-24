//Tutorial2Qa.java
/*A program which reads in a sequence of +ve whole numbers terminated by -1 and detmermines some information 
 *about them*/

import java.util.Scanner;

public class Tutorial2Qa {
	public static void main(String args[]) 	
	{
		int number,total=0,count=0,over1000=0;
		String greaterThan20LessThan100="",multiplesOf3="",factorsOf88="";
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a positive whole number (-1 to exit): ");
		number = input.nextInt();
		
		while(number!=-1)
		{
			if(number>20&&number<100)
				greaterThan20LessThan100 += number + " ";
			else if(number>1000)
				over1000++;
				
			if(number%3==0)
				multiplesOf3 += number + " ";
				
			if(88%number==0)
				factorsOf88 += number + " ";
				
			total+=number;
			count++;
				
			System.out.print("Please enter another positive whole number (-1 to exit): ");
			number = input.nextInt();
		}
		
		System.out.println("\nThe list of numbers > 20 and < 100 is : " + greaterThan20LessThan100 +
			               "\nThe list of numbers that are multiples of 3 is: " + multiplesOf3 + 
			               "\nThe list of numbers that are factors of 88 is: " + factorsOf88 +
			               "\nThe average of the numbers to 2 d.p. is: " + String.format("%.2f",(float)total/count) +
			               "\nThe percentage of the numbers > 1000 is: " + String.format("%.0f",(float)over1000/count*100) + "%");
	}
}