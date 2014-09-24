package progmaths;

public class lab4 {

	public static void main( String[] args ) 
	{
		double answer = powerOf( 3.72, 6 );
		long factorial = factorial( 6 );
		
		double ex =  eX( 3.72 );
		
		double cos = cosX( 3.72 );
		double sin = sinX( 3.72 );
		
		//Examining for e^x, Cos(x), Sin(x)
		
		double p = e_X( 3.72 );
		double q = cos( 3.72 );
		double r = sin( 3.72 );
		
		System.out.println( "Expected 3.72 power of 6 is: 2650.071791407104"  );
		System.out.println( "Actual output is: " + String.format( "%.13f", answer ) );

		System.out.println( "\nExpected factorial of 6 is: 720"  );
		System.out.println( "Actual output is: " + factorial  );
		
		System.out.println( "\nExpected eX 3.72 is: 41.264394108610794704828685161265"  );
		System.out.println( "Actual output is: " + String.format( "%.27f", ex )  );
		
		System.out.println( "\nExpected Cos(3.72) is: -0.8373344009738_8008700560008948967"  );
		System.out.println( "Actual output is: " + String.format( "%.13f", cos )  );
		
		System.out.println( "\nExpected Sin(3.72) is: -0.54669104706928702583745896705622"  );
		System.out.println( "Actual output is: " + String.format( "%.13f", sin )  );
		
		System.out.println("\nThe maximum value of n! (20): " + factorial(20)  ); //20 is the answer
		System.out.println("The maximum value of n! (21): " + factorial(21)  );
		
		System.out.println("\nThe next term for eX(3.72) is: " + p  );
		System.out.println("The next term for Cos(3.72) is: " + q  );
		System.out.println("The next term for Sin(3.72) is: " + r  );


	}

	public static double powerOf(double x, long n)
	{
		double answer = 1;

		for( int i = 0; i < n; i++ )
		{
			answer *= x;

		}
		return answer;


	}
	
	public static long factorial(long f)
	{
		
		long fact = 1;
		
		for( long i = 1; i <= f; i++ )
		{
			
			fact *= i;

		}
		return fact;
		
		
	}
	
	
	public static double eX(double pow)		
	{
		double total = 0;
		
		for( int i = 0; i <= 20; i++ )
		{
			
			double term = powerOf(pow, i)/factorial(i);
			total += term;
		
		}
		return total;
	}
	
	public static double cosX(double lim)
	{
		
		double total  = 0;

		for( int i = 0; i <= 18; i += 2 )
		{
			
			double term = powerOf(-1, i/2)*(powerOf(lim, i)/factorial(i));
			
			total += term;
			
			
		}
		return total;
		
	}
	
	
	
	//Function of Sin(x)
	public static double sinX(double lim)
	{
		
		double total  = 0;
		double term = lim;
		
		for( int i = 1; i <= 18; i += 2 )
		{
			
			term = powerOf(-1, i/2) * (powerOf(lim, i)/factorial(i) );
			
			total += term;
			
			
		}
		return total;
		
	}
	
	
	
	
	
	
	//Examining the next term for eX
	public static double e_X(double x)		
	{
		
		double total = 0;
		double term = 1;
		double precision = 0.000001; 	//Modification to my code so they stop when the terms get smaller
		
		for( int i = 1; Math.abs( term ) > precision; i++ )
		{
			
			total += term;
			term = term * x  / i;
		
		}
		return total;
	}
	
	
	//Examining the next term for Cos(x)
	public static double cos( double x )
	{
		double precision = 0.0001; 	//Modification to my code so they stop when the terms get smaller
		double total  = 0;
		double term = 1;
		
		for( int i = 2; Math.abs( term ) > precision; i += 2 )
		{
			
			total += term;
			term = -term * x * x / (i * (i-1));
			//System.out.println( term );
			
		}
		return total;
	}
	
	//Examining the next term for Sin(x)
	public static double sin(double x)
	{
		double precision = 0.00001;  //Modification to my code so they stop when the terms get smaller
		double total  = 0;
		double term = x;
		
		
		for( int i = 3; Math.abs( term ) > precision ; i += 2 )
		{
			
		
			total += term;
			term = -term * x * x / (i * (i-1));
			
			
			//System.out.println( term );
			
		}
		return total;
		
	}
	
	
	

}
