package firstca2014;
import javax.swing.JOptionPane;

public class Group1 {
	
	public static void main( String[] args )
	{
		String sideA, sideB, sideC;
		float a, b, c;
		
		sideA = JOptionPane.showInputDialog( "Please input the length of the first side of the triangle" );
		a = Float.parseFloat( sideA );
		
		sideB = JOptionPane.showInputDialog( "Please input the length of the second side of the triangle" );
		b = Float.parseFloat( sideB );
		
		sideC = JOptionPane.showInputDialog( "Please input the length of the third side of the triangle" );
		c = Float.parseFloat( sideC );
		
		triangleDetails( a, b, c );
		
		
		System.exit(0);
	}
	
	public static void triangleDetails( float a, float b, float c )
	{
		String typeOfTriangle;
		
		float s = ( a+b+c )/2f;
		
		double area = Math.sqrt( s*( s-a )*( s-b )*( s-c ) );
		
		if( a == b && b == c && c == a ) { typeOfTriangle = "\nand it is an equilateral triangle"; }
		
		else if( a == b || b == c || c == a ) { typeOfTriangle = "\nand it is an isoceles triangle"; }
		
		else { typeOfTriangle = "\nand it is a scalene triangle"; }
		
		JOptionPane.showMessageDialog( null 
				, "The area of the triangle is "
				+ String.format( "%.3f", area ) + " squared units"
				+ typeOfTriangle
				, "Triangle Details"
				, JOptionPane.INFORMATION_MESSAGE );
	}

}
