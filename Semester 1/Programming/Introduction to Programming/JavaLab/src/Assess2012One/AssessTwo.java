package Assess2012One;
import java.util.Scanner;
public class AssessTwo {
	
	public static void main(String[] args){
		
		double diaMin, diaMax, average;
		String condition;
		char cond;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the condtion of the potato - (g)ood or (b)ad: ");
		condition = input.nextLine();
		cond = condition.toLowerCase().charAt(0);
		
		if(cond != 'g')
			System.out.println("The condition of this potato is bad ..... exiting program now");
		else
			System.out.print("\nPlease enter the minimum diameter of the potato: ");
			diaMin = input.nextDouble();
			
			System.out.print("Please enter the maximum diameter of the potato: ");
			diaMax = input.nextDouble();
		
		average = (diaMin + diaMax)/2;
		
		if(average >=0.01d && average <= 24.99d)
			System.out.println("\n\nThe average diameter of the potato is " + String.format("%.2f",average) + "mm and so its grade D");
		else if(average <= 49.99d)
			System.out.println("\n\nThe average diameter of the potato is " + String.format("%.2f",average) + "mm and so its grade C");
		else if(average <= 74.99d)
			System.out.println("\n\nThe average diameter of the potato is " + String.format("%.2f",average) + "mm and so its grade B");
		else
			System.out.println("\n\nThe average diameter of the potato is " + String.format("%.2f",average) + "mm and so its grade A");

	}

}
