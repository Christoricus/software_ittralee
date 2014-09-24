package Lab5;
import java.util.Scanner;
public class Lab5Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t\t1. Calculate the area of a circle." + 
		"\n\t\t\t2. Calculate the volume of a sphere." + 
				"\n\t\t\t3. Quit");
		
		System.out.print("\n\nPlease enter your choice (1-3): ");
		int choice = input.nextInt();
		
		switch(choice){
		case 1:
			System.out.print("\n\nPlease enter the radius of the circle: ");
			double radius = input.nextDouble();
			double areaCircle = Math.PI*radius*radius;
			System.out.println("\nThe area of the circle is " + String.format("%.3f",areaCircle) + " metres squared.");
			break;
		
		case 2:
			System.out.print("\n\nPlease enter the radius of the circle: ");
			double sphere = input.nextDouble();
			double areaSphere = (4/3)*Math.PI*sphere*sphere*sphere;
			System.out.println("\nThe area of the sphere is " + String.format("%.3f",areaSphere) + " metres cubed.");
			break;
		
		case 3:
			System.out.println("\nThanks for using the system. Goodbye!");
			break;
		
		default:
			System.out.println("\nSorry you must be entered an invalid choice - must be between 1 to 3.");
			break;
			
		}
		
	}

}
