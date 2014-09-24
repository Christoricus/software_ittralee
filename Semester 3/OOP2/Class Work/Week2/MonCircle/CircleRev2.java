import java.util.*;


public class CircleRev2{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		//Input
		int radius = input.nextInt();
		//calling user defined method
		double ans = CircleRev2Util.calcArea(radius);
		
		String output = String.format("AREA: %.2f m2",ans);
		System.out.println(output);
		//caclculate perimeter
		double perimeter = CircleRev2Util.perimeter(radius);
		
		 output = String.format("Perimeter: %.2f m2",perimeter);
		System.out.println(output);
		
	}//main
	
/*	public static double calcArea(int rad){
		double area= Math.PI * Math.pow(rad,2);
		return area;
		}*/
	//end of calcArea
}