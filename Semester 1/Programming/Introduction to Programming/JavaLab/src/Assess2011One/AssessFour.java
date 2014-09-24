/*Convert Celsius to Fahrenheit
 * Convert Fahrenheit to Celsius
 */
package Assess2011One;
import java.util.Scanner;
public class AssessFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float cToF = 0.0f, fToC = 0.0f;
		System.out.print("\t\t\"The Temperature Application\"" + 
		"\n1. Convert from Celsius to Fahrenheit \n2. Convert from Fahrenheit to Celsius" +
		"\n3. Display the current temperature in both Celsius and Fahrenheit" + 
		"\n\nPlease enter your choice (1 - 3): ");
		int choice = input.nextInt();
		
		switch(choice){
		case 1:
			System.out.print("Please enter the temperature in Celsius: ");
			cToF = input.nextFloat(); cToF = (cToF*9/5+32);
			if(cToF < -273){
				System.out.println("Error: You have entered an invalid temperature value .... exiting program now");
				System.exit(1);
			}else
				System.out.printf("This is equivalent to %.2f Fahrenheit",cToF);
			break;
		case 2:
			System.out.print("Please enter the temperature in Fahrenheit: ");
			fToC = input.nextFloat(); fToC = (fToC-32)*5/9;
			System.out.printf("This is equivalent to %.2f Celsius",fToC);
			break;
		case 3:
			float curTime = 14f; float curTimeF = (curTime*9/5+32);
			System.out.printf("The current temperature is %.2f Celsius or %.2f Fahrenheit.",curTime,curTimeF);
			break;
		default:
			System.out.println("You have entered an invalid choice - it shoudl be between 1 to 3");
			break;
			
		}
	}

}
