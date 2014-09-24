//Exercise3.java
/*This program uses the Scanner class to read in user-supplied numbers and strings
 *from the keyboard*/
 
import java.util.Scanner;


public class Exercise3 {
	 public static void main(String args[])
		{
			String name, address;
			float weight,height;
			
			Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter your name: ");
			name = input.nextLine();
	
			System.out.print("Please enter your weight: ");
			weight = input.nextFloat();	
			
			System.out.print("Please enter your height: ");
			height = input.nextFloat();	
			
			input.nextLine(); //need this nextLine() to get rid of the trailing '\n'
			
			System.out.print("Please enter your address: ");
			address = input.nextLine();	
			
			System.out.println("\n\n\n=========================================\n" +
			"\t\tDetails\n=========================================\nName: " + name + 
		    "\nWeight: " + weight +"kg\nHeight: " + height + "m" + "\nAddress: " + address);
		    
	
		}
}