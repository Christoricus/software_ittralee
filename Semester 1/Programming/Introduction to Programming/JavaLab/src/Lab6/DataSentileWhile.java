package Lab6;
import java.util.Scanner;
public class DataSentileWhile {

	public static void main(String[] args) {
		float height, totalHeight = 0;
		int numProcessed = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the height of student " + (numProcessed+1) + " (-1 to exit): ");
		height = input.nextFloat();

		
		while(height != -1) {
			totalHeight += height;
			numProcessed += 1;
			
			System.out.print("Please enter the height of student " + (numProcessed + 1) + " (-1 to exit): ");
			height = input.nextFloat();
			
		}
		if(numProcessed != 0)
		System.out.println("\n\nThe number of students processed is " + numProcessed +
				"\nThe average height of the students is " + String.format("%.2f", totalHeight/numProcessed));
		input.close();
	}

}
