/**
 * @(#)Exercise3.java
 *
 *
 * @author 
 * @version 1.00 2013/9/26
 */
import java.util.Scanner;

public class Exercise3 {
        
    public static void main(String[] args) {
        // TODO code application logic here
        String name, address;
        float weight, height;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name: " );
        name = input.nextLine();
        	
        System.out.print("What is your weight: ");
        weight = input.nextFloat();
        
        System.out.print("What is your height: ");
        height = input.nextFloat();
        
        System.out.print("What is your address: ");
        input.nextLine();
        address = input.nextLine();
        
        
        //Printing out the input of the user
        
        System.out.println("\n====================================" +
        	"\n\t\tDetails" +
        		"\n====================================");
        		
        System.out.println("Name: " + name +
        	"\nWeight: " + weight +
        		"\nHeight: " + height +
        			"\nAddress: " + address);
        
    }
}
