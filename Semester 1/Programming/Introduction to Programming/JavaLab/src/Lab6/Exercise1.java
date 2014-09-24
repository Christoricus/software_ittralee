/* This program converts fahrenheit to celcius.
 * It repetively processes the user's input.
 */
package Lab6;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		float fahrenheit, celcius = 0f, totCelcius = 0f;
		float totConversion = 0f, percentCel = 0f;
		int belTen = 0, ovrThirty = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
		fahrenheit = input.nextFloat();
		if(fahrenheit < -459.67){
			System.out.println("\nNo conversions were performed....Goodbye!");
			System.exit(1);
		} else {
			while(fahrenheit >= -459.67f) {
			celcius = (5f/9f)*(fahrenheit-32f);
			totCelcius += celcius;
			totConversion++;
			
			if(celcius > 30)
				ovrThirty++;
			if(celcius < 10)
				belTen++;
			if(celcius >= 20)
				percentCel++;
				
			System.out.println("The equivalent Celsius temperature is " + String.format("%.3f", celcius));
			
			System.out.print("\nPlease enter the another Fahrenheit temperature (below -459.67 to exit): ");
			fahrenheit = input.nextFloat();
			}
			
			System.out.println("\n==============================\n\tProgram Results\n==============================");
			System.out.print("\nTotal conversion performed: " + totConversion +
					"\nAverage Celcius temperature: " + String.format("%.3f", (totCelcius/totConversion)) + "C");
	
			percentCel = (percentCel/totConversion)*100;
			System.out.print("\nTotal Celcius temperature > 30C: " + ovrThirty +
					"\nTotal Celcius temperature < 20C: " + belTen +
					"\nPercentage Celcius temperatures >= 20C: " + percentCel +"%");
			input.close();
		}

	}

}
