package week1;
import java.util.Scanner;

/* This program reads in user input and then prints it out.
 * By using String.format(), this program makes sure the output is displayed nicely.
 */


public class Lab1Exercise2 {
	
	public static void main( String[] args ) {
		
		String a = "Investment Type", b = "# Shares", c = "Share Price";
		String e = "---------------", f = "---------", g = "------------";
		
		Scanner input = new Scanner( System.in );
		
		//Asking for first investment
		System.out.print( "Please enter the type of the first investment: " );
		String firstInvestment = input.nextLine();
		
		System.out.print( "Please enter the number of shares purchased: " );
		int shares1 = input.nextInt();
		
		System.out.print( "Please enter the share price: " );
		float price1 = input.nextFloat();
		
		//Asking for 2nd investment
		input.nextLine();
		System.out.print( "\n\nPlease enter the type of the second investment: " );
		String secondInvestment = input.nextLine();
		
		System.out.print( "Please enter the number of shares purchased: " );
		int shares2 = input.nextInt();
		
		System.out.print( "Please enter the share price: " );
		float price2 = input.nextFloat();
		
		
		System.out.println( "\n\n\t\t==============================================="
				+ "\n\t\t\t\tInvestment Details\n"
				+ "\t\t==============================================="
				+ String.format( "\n\n%-25s%-15s%-20s\n%-25s%-15s%-20s\n", a,b,c,e,f,g )
				+ String.format( "%-25s%-15d%-10.4f\n%-25s%-15d%-10.4f\n", firstInvestment,shares1,price1, secondInvestment,shares2,price2 ) );
		
		input.close();
		
	}

}
