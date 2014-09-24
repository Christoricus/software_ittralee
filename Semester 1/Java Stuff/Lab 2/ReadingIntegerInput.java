/**
 * @(#)ReadingIntegerInput.java
 *
 *
 * @author 
 * @version 1.00 2013/9/26
 */
import java.util.Scanner;
public class ReadingIntegerInput {

    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfCPU, RAM;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the number of CPUs in your computer: ");
        numberOfCPU = input.nextInt();
        
        System.out.print("Please enter the number of RAM in your computer in MB: ");
        RAM = input.nextInt();
        
        System.out.println("\n\n\nThe details you entered were as follows:\n\nNumber of " +
        	"CPUs: " + numberOfCPU + "\nNumber of RAM: " + RAM + "MB\n\n\n");
    }
}
