package ExamPaper2012;
/* 1. Ask for the the length.
 * 2. Do calculations.
 * 3. Print it out.
 */
import java.util.Scanner;
public class Pendulum {
	
	public static void main( String[] args )
	{
		final float PI = 3.142f, G = 9.8f;
		float length;
		
		Scanner input = new Scanner( System.in );
		
		//1. Ask for the length
		
		System.out.print( "==========Pendulum Period Calculator============" + 
		"\n\nPlease enter the length of the pendulum: ");
		length = input.nextFloat();
		
		//2. Do calculations.
		double T = 2*PI*Math.pow( length/G, 0.5f );
		
		
		//3. Print it out.
		
		System.out.printf( "\nThe period of oscillation of the pendulum is %.4f seconds", T);
		
		input.close();
		
	}

}
