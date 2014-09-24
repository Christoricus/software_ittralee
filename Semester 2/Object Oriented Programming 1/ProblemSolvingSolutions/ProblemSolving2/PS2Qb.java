//PS2Qb.java
/*A program that will ask the user to enter their name and address. If they enter
 *their name as Joe Bloggs and their address as Tralee then they will get a certain
 *message displayed confirming this. Otherwise the message displayed will confirm the
 *opposite*/
 
import java.util.Scanner;

public class PS2Qb {

	public static void main(String args[]) 
	
	{
		String name,address;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		
		System.out.print("Please enter your address: ");
		address = input.nextLine();
		
		if(name.equals("Joe Bloggs") && address.equals("Tralee"))
			System.out.println("\nYou are " + name + " from " + address);
		else
			System.out.println("\nYou definitely are not Joe Bloggs from Tralee");

	}
}