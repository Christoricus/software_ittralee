/** demonstrates the use of a static class constant
 *  and dividing main()into methods */
public class MathTest{
	public static void main (String args[]){
		double circleRadius = 5.0;
		// display the value of the static constant PI from class Math
		System.out.printf("Value of PI: %f rounded to 2dp: %.3f\n\n",
		                     Math.PI, Math.PI);
		// calculate the area of the circle, and display it
		calcAndPrintArea(circleRadius);
	}
	// do the action in a separate method: it must be static
	public static void calcAndPrintArea(double radius){
		System.out.printf("The area of a circle with radius %.1f cm is %.3f sq cm\n\n",
		                     radius,Math.PI * Math.pow(radius, 2));
		}
}