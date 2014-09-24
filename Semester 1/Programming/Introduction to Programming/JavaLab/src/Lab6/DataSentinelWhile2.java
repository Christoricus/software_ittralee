package Lab6;
import java.util.Scanner;
public class DataSentinelWhile2 {

	public static void main(String[] args) {
		float price, totalPrice = 0;
		int numProducts = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the price of product " + (numProducts+1) + " (-1 to exit): ");
		price = input.nextFloat();
		
		while(price != -1) {
			totalPrice += price;
			numProducts += 1;
			
			System.out.print("Please enter the price of product " + (numProducts+1) + " (-1 to exit): ");
			price = input.nextFloat();
			
		}
		System.out.println("\nTotal products entered: " + numProducts + "\nTotal price: EUR" + String.format("%.2f", totalPrice));
		input.close();
	}

}
