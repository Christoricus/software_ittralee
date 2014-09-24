package Assess2011One;
import java.util.Scanner;
public class AssessThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("***********Viscosity Calculator***********");
		System.out.print("\nPlease enter the density of the ball-bearing: ");
		int bBearing = input.nextInt();
		if(bBearing <=0){
			System.out.println("Error! The density of the ball-bearing must be positive .... now quitting program");
			System.exit(1);
		}
		System.out.print("Please enter the density of the fluid: ");
		int fluid = input.nextInt();
		if(fluid <=0){
			System.out.println("Error! The density of the fluid must be positive .... now quittting program");
			System.exit(1);
		}
		System.out.print("Please enter the radius of the ball-bearing: ");
		double radius = input.nextDouble();
		
		System.out.print("Please enter the velocity of the ball-bearing: ");
		double velocity = input.nextDouble();
		
		double viscosity = (double)((2*(bBearing-fluid))*9.8*Math.pow(radius, 2))/(9*velocity);
		System.out.printf("\nThe viscosity of the fluid is %.2fPa s",viscosity);

	}

}
