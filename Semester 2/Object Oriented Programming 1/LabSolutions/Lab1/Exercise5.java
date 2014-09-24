//Exercise5.java
/*This program reads in the weight in kg and the height in metres of a person and then
 *uses a formula to determine their BMI. It then uses a table to display an appropriate
 *message based on their BMI*/
 
import java.util.Scanner;

public class Exercise5 {
	 public static void main(String args[])
		{
			float weight,height,BMI;
			String message = "";
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your weight: ");
			weight = input.nextFloat();
			
			if(weight<0)
				System.out.println("\nInvalid weight! Quitting program now...");
			else
				{
					System.out.print("Please enter your height: ");
					height = input.nextFloat();
					
					if(height<0)
						System.out.println("\nInvalid height! Quitting program now...");
					else
						{
							BMI = weight/(height*height);
							
						    if(BMI<18.5f)
						    	message = "underweight";
						    else if(BMI<25f)
						    	message = "normal";
						    else if(BMI<30f)
						        message = "overweight";
						    else
						    	message = "obese";
						    	
						    System.out.println("\nYour BMI is " + BMI + " so you are " + message);
						}
				}			               	
				               
		}
}