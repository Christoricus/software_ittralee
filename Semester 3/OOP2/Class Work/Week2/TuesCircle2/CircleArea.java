import java.util.Scanner;

public class CircleArea {
	public static void main(String args[])
		{
			double area;
			int radius;
			
			Scanner input = new Scanner(System.in);
			System.out.println(CircleAreaUtils.describe());
			System.out.println("Input radius: ");
			//Input
			radius = input.nextInt();
			//Process
			//area = Math.PI*Math.pow(radius,2);
			area = CircleAreaUtils.calcArea(radius);
			double perimeter = CircleAreaUtils.calcPerimeter(radius);
			//Output
			System.out.printf("Area is: %.2f ",area);
			System.out.println();
			System.out.printf("Perimeter is: %.2f ", perimeter);
		} //end main
	//User Defined Method
	//public static double calcArea(int rad){
			//return Math.PI*Math.pow(rad,2);
		//}
}