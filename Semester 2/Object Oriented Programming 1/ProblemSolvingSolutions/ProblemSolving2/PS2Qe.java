//PS2Qe.java
/*A program that gives the user some menu options and takes a certain course of
 *action depending on the option chosen*/
 
import javax.swing.JOptionPane;

public class PS2Qe {
	public static void main(String args[]) 	
	{
		float height,base,radius;
		char choice;
		String choiceAsString,heightAsString,baseAsString,radiusAsString;
		final float PI = 3.142f;
		
		choiceAsString = JOptionPane.showInputDialog("A. Calculate the area of a triangle\nB. Calculate the " + 
			             "volume of a cylinder\nC. Quit");
			             
		choice = choiceAsString.charAt(0);
		
	    switch(choice)
	    {
	    	case 'A':
	    		    baseAsString = JOptionPane.showInputDialog("Please enter the base length of the triangle");
	    		    base = Float.parseFloat(baseAsString);
	    		    heightAsString = JOptionPane.showInputDialog("Please enter the perpendicular height of the triangle");
	    		    height = Float.parseFloat(heightAsString);
	    		    JOptionPane.showMessageDialog(null,"The area of the triangle is " + String.format("%.3f",0.5*base*height) 
	    		    	       + "squared metres","Triangle Area Calculation",JOptionPane.INFORMATION_MESSAGE);
	    		    break;
	    	case 'B':
	    		    radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the cylinder");
	    		    radius = Float.parseFloat(radiusAsString);
	    		    heightAsString = JOptionPane.showInputDialog("Please enter the height of the cylinder");
	    		    height = Float.parseFloat(heightAsString);
	    		    JOptionPane.showMessageDialog(null,"The volume of the cylinder is " + 
	    		    	         String.format("%.3f",(1/3f)*PI*radius*radius*height) 
	    		    	       + "cubed metres","Cylinder Volume Calculation",JOptionPane.INFORMATION_MESSAGE);
	    		    break;
	    	case 'C':
	    		    JOptionPane.showMessageDialog(null,"Quitting the program ....", 
	    		    	       "Farewell!",JOptionPane.INFORMATION_MESSAGE);
	    		    break;
	    	default:
	    		    JOptionPane.showMessageDialog(null,"Error: Invalid choice entered!", 
	    		    	       "Error!",JOptionPane.INFORMATION_MESSAGE);
	    		    
	    }
		System.exit(0);
					
	}
}