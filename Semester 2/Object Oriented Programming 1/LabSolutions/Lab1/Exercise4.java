//Exercise4.java
/*This program reads in the tube radius, cross-sectional radius and mass of a torus
 *and uses them to determine its moments of inertia*/
 
import java.util.Scanner;

public class Exercise4 {
	 public static void main(String args[])
		{
			float momentOfInertiaAboutDiameter,momentOfInertiaAboutVerticalAxis,tubeRadius,xsectionalRadius,mass;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the tube radius of the torus: ");
			tubeRadius = input.nextFloat();
			
			System.out.print("Please enter the cross-sectional radius of the torus: ");
			xsectionalRadius = input.nextFloat();
			
			System.out.print("Please enter the mass of the torus: ");
			mass = input.nextFloat();
			
			momentOfInertiaAboutDiameter = (1/8f)*(4*tubeRadius*tubeRadius + 5*xsectionalRadius*xsectionalRadius)*mass;
				
			momentOfInertiaAboutVerticalAxis = (tubeRadius*tubeRadius+0.75f*xsectionalRadius*xsectionalRadius)*mass;
			
	   
			System.out.println("\n=======Results========\n\nMoment of inertia about a diameter is : " + 
							   String.format("%.3f",momentOfInertiaAboutDiameter) + "kg sq m" +
				               "\nMoment of inertia about a vertical axis is : " + 
				               String.format("%.3f",momentOfInertiaAboutVerticalAxis) + "kg sq m");
				               	
				               
		}
}