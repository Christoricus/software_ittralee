import java.util.Scanner;

public class PoundsToOunces {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Input
		System.out.print("Please enter the amount in ounces: ");
		int ounces = input.nextInt();
		
		//Calculation
		int pound = ounces / 16;
		int remainder = ounces % 16;
		
		//Printing out
		System.out.println(ounces + "oz is equivalent to " + pound + "lbs " + remainder + "oz");

	}
}
