package Lab8;
import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args)
	{
		float balance = 1000f;
		int year = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the interest rate: ");
		float interest = input.nextFloat();
		
		System.out.println("\n");
		
		do
		{
			balance += (balance*interest)/100;
			System.out.println("Balance at the end of the year " + year + " is EUR" + String.format("%.2f", balance));
			year++;
			
		}while(balance <= 2000);
		input.close();
	}

}
