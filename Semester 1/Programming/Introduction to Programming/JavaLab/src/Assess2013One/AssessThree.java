package Assess2013One;
import java.util.Scanner;
public class AssessThree {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("*******************Current Calculator*******************" 
				+ "\nPlease enter the voltage of the battery: ");
		
		float volt = input.nextFloat();
		if(volt <= 0)
			System.out.println("Error! The voltage of the battery must be postive .... now quittting program");
		else
			System.out.print("Please enter the resistance of the first resistor: ");
			float res1 = input.nextFloat();
			System.out.print("Please enter the resistance of the second resistor: ");
			float res2 = input.nextFloat();
			
			float current = (volt*(res1+res2))/(res1*res2);
			
			System.out.printf("\nThe total current flowing in the circuit is %.0f Amps",current);
			
		
	}
}
