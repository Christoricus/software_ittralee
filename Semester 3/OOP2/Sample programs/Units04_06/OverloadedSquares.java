/** example of method overloading
 *  also of providing a user-written method within the same class as main
 */
public class OverloadedSquares {
	/** calculates the area of a square
	 @param side the side of the square, a whole number
	 @return the area, as an int
	 */
	public static int square(int side){
		return side * side;
	} // end method
	
	/** calculates the area of a square
	 @param side the side of the square, may have decimals
	 @return the area, with decimal point
	 */
	public static double square(double side){
		return side * side;
	} // end method
	
	/** driver program to test the two methods
	 */
	public static void main (String args[]){
		int a = 5;
		double x = 10.0;
		System.out.printf("The square of %d is %d\n\n",a,square(a));
		System.out.printf("The square of %f is %f\n\n",x,square(x));
	} // end main
} // end class