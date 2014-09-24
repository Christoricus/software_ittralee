//Exercise2.java
/*This program declares variables of different types for storing the details of an
 *investment and then displays them nicely in a tabular form using format() */
 
import java.util.Scanner;

public class Exercise2 {
	 public static void main(String args[])
		{
			String investmentType1,investmentType2;
			int sharesPurchased1,sharesPurchased2;
			float sharePrice1,sharePrice2;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the type of the first investment: ");
			investmentType1 = input.nextLine();
			
			System.out.print("Please enter the number of shares purchased: ");
			sharesPurchased1 = input.nextInt();
			
			System.out.print("Please enter the share price: ");
			sharePrice1 = input.nextFloat();
			
			input.nextLine();
			
			System.out.print("\n\n\nPlease enter the type of the second investment: ");
			investmentType2 = input.nextLine();
			
			System.out.print("Please enter the number of shares purchased: ");
			sharesPurchased2 = input.nextInt();
			
			System.out.print("Please enter the share price: ");
			sharePrice2 = input.nextFloat();
			
			
		   
			System.out.println("\n\n\t\t===============================" +
				               "\n\t\t\tInvestment Details" +
				               "\n\t\t===============================\n\n" +
				               String.format("%-20s%-10s%-10s\n%-20s%-10s%-10s",
				               "Investment Type","# Shares","Share Price",
				               "---------------","--------","-----------") +
				               String.format("\n%-20s%-10d%-10.4f\n%-20s%-10d%-10.4f",
				               investmentType1,sharesPurchased1,sharePrice1,
				               investmentType2,sharesPurchased2,sharePrice2));
				               	
				               
		}
}