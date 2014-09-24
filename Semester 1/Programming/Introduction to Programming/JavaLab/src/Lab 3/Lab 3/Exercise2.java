import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		final float PI = 3.142f;
		float radius, height;

		//Inputting the radius
		System.out.println("Please enter the radius of the cylinder: ");
		radius = input.nextFloat();
		
		//Inputing the height
		System.out.println("Please enter the height of the cylinder: ");
		height = input.nextFloat();
		
		//Pi R.Squared. H
		float result = PI*radius*radius*height;
		
		//Formatting
		String formatString = "====Calculation Result==== \n\n" +
			 "Volume of cylinder is " + String.format("%.2f",result) + " metres squared.";
		
		//Printing out
		System.out.println(formatString);
		
	}
    
}