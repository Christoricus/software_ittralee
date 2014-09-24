package Assess2011One;
import java.util.Scanner;
public class AssessTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double firstHr = 0.60d, nextTwo = 0.50d, anyMore = 0.40d;
		double cost = 0;
		
		System.out.println("\t**********Car Park Calculator**********");
		System.out.print("\nPlease enter the amount of time in hours you spent parking: ");
		double hour = input.nextDouble();
		if(hour < 0){
			System.out.println("\nError: you have entered an invalid time value ... exiting program.");
			System.exit(1);
		}else if(hour <= 1)
			cost = hour*firstHr;
		else if(hour <=3)
			cost = firstHr+ ((hour-1)*nextTwo);
		else
			cost = firstHr + nextTwo*2 + ((hour-3)*anyMore);
		
		System.out.printf("\nTotal cost of parking for %.2f hours is EUR%.2f",hour, cost);
	}

}
