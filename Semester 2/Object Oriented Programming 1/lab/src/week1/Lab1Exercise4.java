package week1;
import java.util.Scanner;
/* This program reads in user supplied values to calculate the moments of inertia
 * of a torus of a tube.
 * Diameter: 1/8(4a^2 + 5b^2)m
 * Vertical Axis: (a^2 + 3/4b^2)m
 */
public class Lab1Exercise4 {
	
	public static void main( String[] args ) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter the tube radius of the torus: " );
		float a = input.nextFloat(); //tube radius
		
		System.out.print( "Please enter the cross-sectional radius of the torus: " );
		float b = input.nextFloat(); //cross-sectional radius
		
		System.out.print( "Please enter the mass of the torus: " );
		float m = input.nextFloat(); //mass of the torus
		
		//Calculating the diameter
		double diameter = (double) 1f/8f*( 4*Math.pow(a, 2) + 5*Math.pow(b, 2) )*m;
		
		//Calculating the vertical axis
		double vAxis = (double) ( Math.pow(a, 2) + 3f/4f*Math.pow(b, 2) )*m ;
		
		System.out.println( "\n============Results============\n" 
				+ "\nMoment of inertia about a diameter: " + String.format( "%.3f", diameter ) + "kg sq m"
				+ "\nMoment of intertia about a vertical axis is: " + String.format( "%.3f", vAxis ) + "kg sq m" );
		
		input.close();
		
	}

}
