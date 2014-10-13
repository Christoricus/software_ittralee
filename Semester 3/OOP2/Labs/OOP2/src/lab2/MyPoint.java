package lab2;

public class MyPoint {
	private double xVal;
	private double yVal;	
	
	public  MyPoint() {
		xVal = 0.0;
		yVal = 0.0;
	}
	
	public MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}
	
	//Accessor
	public double getX() {
		return xVal;
	}
	
	public double getY() {
		return yVal;
	}
	
	//Mutator
	public void setX(double x) {
		xVal = x;
	}
	
	public void setY(double y) {
		yVal = y;
	}
	
	//Other methods
	public void moveHorizontally(double x) {
		setX(x);
	}
	
	public void moveVertically(double y) {
		setY(y);
	}
    
	public void translate(int dx, int dy) {
        xVal += dx;
        yVal += dy;
    }
    
	public double distanceFromOrigin() {
		//d = sqrt(x^2 + y^2)
		double d = Math.sqrt( (Math.pow(xVal, 2) + Math.pow(yVal, 2)) );
		return d;
	}

	public String toString() {
		return "X: " + getX() + " Y: " + getY();
		//return msg;
	}
}
