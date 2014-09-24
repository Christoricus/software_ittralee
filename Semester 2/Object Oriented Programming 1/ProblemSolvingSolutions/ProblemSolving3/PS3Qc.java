//PS3Qc.java
/*A program that uses a user-defined method called pressureCalculator() to determine the 
 pressure exerted on a body immersed in a fluid*/

import javax.swing.JOptionPane;

public class PS3Qc {
	public static void main(String args[]) 	
	{
		String densityAsString,depthAsString;
		float density,depth;
		
		densityAsString = JOptionPane.showInputDialog("Please enter the density of the fluid");
		density = Float.parseFloat(densityAsString);
	    depthAsString = JOptionPane.showInputDialog("Please enter the depth of the object within the fluid");
		depth = Float.parseFloat(depthAsString);
		
		JOptionPane.showMessageDialog(null,"The pressure exerted on the body is " + 
			    String.format("%.3f",pressureCalculator(density,depth)),"Pressure",JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
		
	}
	
	public static double pressureCalculator(float p,float h)
	{
		return p*9.8*h;
	}
}