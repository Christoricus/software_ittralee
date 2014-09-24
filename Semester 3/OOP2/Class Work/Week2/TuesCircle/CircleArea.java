//find the area of a circle
import javax.swing.JOptionPane;

public class CircleArea {
	public static void main(String[] args) {
		double radius, area, perimeter;
		//input
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
		
		//process
		//area = Math.PI*Math.pow(radius, 2);
		area = CircleUtils.calcArea(radius);
		perimeter = CircleUtils.calcPerimeter(radius);
		
		CircleUtils cu = new CircleUtils();
		double peri = cu.calcPeri_1(radius);
		
		//output
		String message = String.format("The perimeter is %.2f", perimeter);
		JOptionPane.showMessageDialog(null, message,null , JOptionPane.INFORMATION_MESSAGE);
		
		String message1 = String.format("The other perimeter is %.2f", peri);
		JOptionPane.showMessageDialog(null, message1,null , JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "The area is: " + area);
		
	} //end main
	
	//method to calcuate the area
	/*public static double calcArea(double r) {
		return Math.PI*Math.pow(r, 2);
	}*/
}