/*Convert Celsius to Fahrenheit
 * Convert Fahrenheit to Celsius
 */
package Lab8;
import java.util.Scanner;
public class DoWhile2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float cToF = 0.0f, fToC = 0.0f;
		int choice;
		String menuText = "\n\n\t\t1. Convert from Celsius to Fahrenheit"
				+ "\n\t\t2. Convert from Fahrenheit to Celsius" +
				"\n\t\t3. Quit system" + 
				"\n\nPlease enter your choice (1 - 3): ";
		String error = "Please enter 1, 2 or 3 as your choice!";
		

		do{
			System.out.print(menuText);
			choice = input.nextInt();
			
			if(choice > 3)
				System.out.println("\n\t\t" + error.toUpperCase());
				
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
				System.out.println("Thanks for using the system....goodbye");
				

			}
		}while(choice != 3);
		
		input.close();
	}

}