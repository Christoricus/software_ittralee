package Assess2011One;
import java.util.Scanner;
public class AssessOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final float GRAVITATIONAL_CONSTANT = (float) (6.67428f * Math.pow(10,-11));
		final float PI = 3.142f;
		float radius, mass = 0; 
		double period = 0;
		
		System.out.println("--------------Planet Period Calculator------------");
		System.out.print("\nPlease enter the radius of the planets orbit(in m): ");
		radius = input.nextFloat();
		if(radius <= 0){
			System.out.println("\nRadius value is invalid .... exiting program now!!");
			System.exit(1);
		}
		System.out.print("Please enter the combined mass of the bodies(in kg): ");
		mass = input.nextFloat();
		if(mass <= 0){
			System.out.println("\nCombined mass value is invalid .... exiting program now!!");
			System.exit(1);
		}
		period = (double)Math.sqrt((4*Math.pow(PI, 2)*Math.pow(radius, 3))/(GRAVITATIONAL_CONSTANT*mass));
		System.out.printf("\n\nThe period of rotation of this planet is %.3f seconds", period);
		System.out.printf("\nThe period of rotation of this planet is %.0f days", period/86400); //86400 seconds a day
		
	}
}