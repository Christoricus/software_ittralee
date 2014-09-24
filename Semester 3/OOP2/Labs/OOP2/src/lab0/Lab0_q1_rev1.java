package lab0;

//16/09/2014
import javax.swing.*;
//import java.util.Scanner;

public class Lab0_q1_rev1 {
	
	public static void main(String[] args) {
		
		//Scanner scannerIn = new Scanner(System.in);
		String name;
		double totalCost;
		String className;
		int numSnacks;
		
		//input
		name = JOptionPane.showInputDialog("What is your name?");
		className = JOptionPane.showInputDialog("What class are you in?");
		numSnacks = Integer.parseInt(JOptionPane.showInputDialog("# of snacks?"));
		
		//process
		totalCost = numSnacks * 2;
		
		String message = String.format("Name: %s\nClass: %s\n# of Snacks: %s\nTotal Cost: �%.2f", name, className, numSnacks, totalCost);
		JOptionPane.showMessageDialog(null, message);
		
		
	} //ends main

} //ends class
