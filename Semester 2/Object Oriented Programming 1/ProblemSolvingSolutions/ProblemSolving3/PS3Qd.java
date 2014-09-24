//PS3Qd.java
/*A program that uses a user-defined method called terminalVelocity() to determine the 
 terminal velocity of a body falling from rest at a height above the earth*/

import javax.swing.JOptionPane;

public class PS3Qd {
	public static void main(String args[]) 	
	{
		String massAsString,dragCoefficientAsString,projectedAreaAsString;
		float mass,dragCoefficient,projectedArea;
		
		massAsString = JOptionPane.showInputDialog("Please enter the mass of the object");
		mass = Float.parseFloat(massAsString);
	    dragCoefficientAsString = JOptionPane.showInputDialog("Please enter the drag coefficient of the object");
		dragCoefficient = Float.parseFloat(dragCoefficientAsString);
	    projectedAreaAsString = JOptionPane.showInputDialog("Please enter the projected area of the object");
		projectedArea = Float.parseFloat(projectedAreaAsString);
		
		
		JOptionPane.showMessageDialog(null,"The terminal velocity of the object is " + 
			    String.format("%.2f",terminalVelocity(mass,dragCoefficient,projectedArea)),"Terminal velocity",JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
		
	}
	
	public static double terminalVelocity(float m,float d,float a)
	{
		final double g = 9.8,p = 1.247;
		return Math.sqrt(2*m*g/(p*d*a));
	}
}