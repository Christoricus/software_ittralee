//Q1a.java
/*This program reads in the mass and velocity of an object along with its radius of curvature
 *to determine the centripetal force acting on it*/

import java.util.Scanner;

public class Q1a {
	public static void main(String args[])
		{
			double m,v,r;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the mass of the object: ");
			m = input.nextDouble();
			
			System.out.print("Please enter the velocity of the object: ");
			v = input.nextDouble();
			
			System.out.print("Please enter the radius of curvature of the object: ");
			r = input.nextDouble();				
			
			System.out.printf("\n\n**********Centripetal Force Calculation********\n\nThe centripetal force " +
				         "acting on the object is %.3fN\n\n\n",m*v*v/r);				
		}		
}


