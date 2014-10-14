package lab2;
import java.util.Scanner;

public class BicycleDriver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "", make = "";
		double value = 0;
		
		Bicycle bmx = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		/* Declares and creates a Bicycle using the no-arguments constructor, 
		 * then asks the user to enter a value for each of the attributes of this 
		 * second Bicycle and sets them accordingly
		 */
		for (int i = 1; i < 3; i++) {
			System.out.print("Enter your name " + i + ": ");
			name = in.nextLine();	
			System.out.print("Enter the value " + i + ": ");
			value = in.nextDouble();
			
			in.nextLine();
			
			System.out.print("Enter the make " + i + ": ");
			make = in.nextLine();
			System.out.print("\n");
			
			if (i == 1) {
				bmx.setName(name);
				bmx.setValue(value);
				bmx.setMake(make);
			} else {
				bike2.setName(name);
				bike2.setValue(value);
				bike2.setMake(make);
			}
		}
	
		
		/* Increases the value of the first Bicycle by 10 euro by getting the value, 
		 * then setting it to an increased value
		 */
		bmx.setValue(bmx.getValue()+10);
		//System.out.println(bmx.toString());
		
		//Outputs the owner names and values of the 2 Bicycles using the accessor methods 
		System.out.println(bmx.toString() + "\n" + bike2.toString());
		
		//Calculates and displays the total value of the 2 Bicycles
		System.out.println( "The total value: " + (bmx.getValue()+bike2.getValue()) );
		
		in.close();
	}
}
