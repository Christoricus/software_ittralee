import java.util.Scanner;
public class Exercise4Lab4 {
	
	public static void main(String[] args) {
		
		float unitUsed, cost;
		final float first99 = 0.05f, next200 = 0.03f, next100 = 0.02f, anythingMore = 0.01f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the units used: ");
		unitUsed = input.nextFloat();
		
		if(unitUsed <= 99)
			cost = unitUsed * first99;
		else if(unitUsed <= 299 )
			cost = 99 * first99 + (unitUsed - 99) * next200;
		else if(unitUsed <= 399)
			cost = 99 * first99 + 200 * next200 + (unitUsed - 299) * next100;
		else
			cost = 99 * first99 + 200 * next200 + 100 * next100 + (unitUsed - 399) * anythingMore;
		
		
		System.out.println("The cost of your mobile phone bill EUR" + String.format("%.2f", cost));
		
	}

}
