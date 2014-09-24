
public class CircleUtils {
	//Class method
	public static double calcArea(double r) {
		return Math.PI*Math.pow(r, 2);
	}
	
	//Class method
	public static double calcPerimeter(double radius) {
		return 2*Math.PI*radius;
	}
	
	//Instance method
	public double calcPeri_1(double rad) {
		return 2*Math.PI*rad;
	}
}