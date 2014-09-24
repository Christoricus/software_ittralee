package progmaths;
//Rational (Fraction) Class

public class lab3 {

	static Fraction f, g, h, add, subtract, multiply, divide, lcf;

	public static void main( String[] args ) 
	{
		// Testing fraction Add
		// Input a = 7/11 && b = 3/5

		f = new Fraction(7, 11);
		g = new Fraction(3, 5);
		h = new Fraction(48, 456);
		
		add = Fraction.Add(f, g);		// Expected output 68/55

		subtract = Fraction.Subtract(f, g);  	// Expected output 2/55

		multiply = Fraction.Multiply(f, g);		// Expected output 21/55

		divide = Fraction.Divide(f, g);		// Expected output 35/33
		
		lcf = Fraction.GCD(h);  //Expected output 2/19

		System.out.println( "Actual output for Addition: " + add.n + "/" + add.d );
		// Actual output 68/55. Add passed unit test 29/1/2014

		System.out.println( "\nActual output for Subtract: " + subtract.n + "/" + subtract.d ); 
		// Actual output 2/55. Add passed unit test 29/1/2014

		System.out.println( "\nActual output for Multiply: " + multiply.n + "/" + multiply.d ); 
		// Actual output 21/55. Add passed unit test 29/1/2014

		System.out.println( "\nActual output for Division: " + divide.n + "/" + divide.d ); 
		// Actual output 35/33. Add passed unit test 29/1/2014

		System.out.println( "\nActual output for Value (using float): " + f.floatValue() ); 
		// Actual output 0.6363636. Add passed unit test 29/1/2014

		System.out.println( "Actual output for Value (using double): " + f.doubleValue() ); 
		// Actual output 0.6363636363636364. Add passed unit test 29/1/2014

		System.out.println( "\nGreatest common factor (48/456): " + Fraction.findGCD(48, 456)); //h = new Fraction(48, 456);
		
		System.out.println( "\nFraction to its lowest terms: " + lcf.n + "/" + lcf.d);
		// Actual output 2/19. Add passed unit test 3/2/2014

		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Q. 3 Expansion
		Fraction tot  = new Fraction(1, 4);
		for (int i = 0; i < 9; i++)
		{
			tot = Fraction.Add(tot, g);
			
			
		}
		
		System.out.println( "\nActual output: " + tot.n + "/" + tot.d ); 
		// Actual output 113/20. Add passed unit test 3/2/2014

		//!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Q.4 Bigger fraction is causing round off error
	}



	public static class Fraction //Constructor
	{
		int n, d;

		public Fraction(int numerator, int denominator)
		{
			n = numerator;
			d = denominator;
		}


		// Finding out the Additional Fraction
		public static Fraction Add(Fraction f1, Fraction f2)
		{
			int numerator = (f1.n * f2.d) + (f1.d * f2.n);
			int denominator = f1.d * f2.d;

			return GCD( new Fraction(numerator, denominator ) );

		}


		//Finding out the Subtract
		public static Fraction Subtract(Fraction f1, Fraction f2)
		{
			int numerator = (f1.n * f2.d) - (f1.d * f2.n);
			int denominator = f1.d * f2.d;

			return new Fraction(numerator, denominator);

		}



		//Finding out the Multiplication
		public static Fraction Multiply(Fraction f1, Fraction f2)
		{
			int numerator = f1.n * f2.n;
			int denominator = f1.d * f2.d;

			return new Fraction(numerator, denominator);

		}

		//Finding out the Division
		public static Fraction Divide(Fraction f1, Fraction f2)
		{
			int numerator = f1.n * f2.d;
			int denominator = f1.d * f2.n;

			return new Fraction(numerator, denominator);

		}

		//Finding out the Value (using float)
		public float floatValue()
		{

			return (float) n / (float) d;
		}

		//Finding out the Value (using double)
		public double doubleValue()
		{

			return (double) n / (double) d;
		}

		
		
		//Finding out the Greatest common divisor
		private static int findGCD(int numerator, int denominator) {
	        //base case
	        if(denominator == 0){
	            return numerator;
	        }
	        return findGCD( denominator, numerator % denominator );
	    }

		//Finding out the lowest common factor
		public static Fraction GCD( Fraction f1 )
		{
			int GCD = findGCD(f1.n, f1.d);
			
			int numerator = f1.n/GCD;
			int denominator = f1.d/GCD;

			return new Fraction( numerator, denominator );

		}
		
		

	}
}
