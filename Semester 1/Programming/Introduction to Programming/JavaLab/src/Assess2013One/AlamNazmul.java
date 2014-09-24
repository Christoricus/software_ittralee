/*CA 2013 One
 * T00152975
 * Nazmul Alam
 * 24/10/2013
 * This program calculates the parking cost
 */
package Assess2013One;
import java.util.Scanner;
public class AlamNazmul {

	public static void main(String[] args) {
		
		final float ONE_HR = 0.60f, NEXT_TWO = 0.50f, ANY_MORE = 0.40f;
		float cost = 0.0f;
		Scanner input = new Scanner(System.in); 
		
		System.out.println("=====================================\r\tCar Park Calculator\r=====================================");
		
		//inputting the hours parked
		System.out.print("\nPlease enter the amount of time in hours you spent parking: ");
		float hours = input.nextFloat();
		if(hours < 0){ //if parking is below 0
			System.out.println("Error! you have entered an invalid time value ... exiting program");
			System.exit(1);
		}else if(hours <= 1){ //if parking is up to 1 hours
			cost = ONE_HR*hours;
		}else if(hours <= 3){ //if parking is up to 3 hours
			cost = ONE_HR + (hours-1)*NEXT_TWO;
		}else //if parking is above 3 hours
			cost = ONE_HR + NEXT_TWO*2 + ANY_MORE*(hours-3);
		
		System.out.printf("\nThe total cost of the parking for %.2f hours is EUR%.2f",hours,cost);	

	}

}