//User Defined Class
public class CircleAreaUtils{
	
	//User defined method to calculate method
	public static double calcArea(int rad){
		return Math.PI*Math.pow(rad,2);
	}// end area
	
	//User defined method to calculate perimeter
	public static double calcPerimeter(int radius){
		return Math.PI*2*radius;	
	}// end perimeter		
	
	public static String describe(){
	return "Calculates area and perimeter of a circle";
	}
}
