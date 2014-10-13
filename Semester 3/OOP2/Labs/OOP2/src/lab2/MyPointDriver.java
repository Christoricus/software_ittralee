package lab2;

public class MyPointDriver {
	public static void main(String[] args) {
		
		MyPoint a = new MyPoint(-5, -12); //distance from origin = 13
		MyPoint b = new MyPoint(4, 3); //translate points
		MyPoint c = new MyPoint(15, 8); //move points
		
		//translate() a point a specific distance in x- and y- directions
		b.translate(8, 1);
		System.out.println("Translating a point \n" + b.toString());
		
		/* A method which will calculate the distanceFromOrigin() 
		 * of the point using Pythagoras’ formula (the origin is at 0,0).
		 */
		System.out.println("Distance from the origin\n" + a.distanceFromOrigin());
		
		/* Methods must be written which can moveHorizontally() or moveVertically() 
		 * a point through a supplied number of units
		 */
		c.moveHorizontally(13);
		System.out.println("Move horizontally\n" + c.toString());
		
		c.moveVertically(-1);
		System.out.println("Move vertically\n" + c.toString());
	}

}
