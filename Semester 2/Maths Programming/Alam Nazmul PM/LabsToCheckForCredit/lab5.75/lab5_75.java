package progmaths;

public class lab5_75 {

	public static void main(String[] args) {
		double accuracy = 0.000000001;
		double currentGuess = 1; 
		boolean isFinished = false;
		int attempts = 1;

		do {

			double value = function(currentGuess);
			//System.out.println( "\nValue is " +  value );
			double poly = derivative(currentGuess);
			//System.out.println( "\nPoly is " +  poly );
			
			double change = (double) -(value/poly);
			//System.out.println( "\nChange value is " +  change );
			
			isFinished =  (Math.abs(change) < accuracy);
			
			currentGuess += change;
			
			attempts++;
			
			//System.out.println( "\nNext guess is " +  currentGuess );

		} while( !isFinished );

		System.out.println( "\n\nIt took " + attempts + " attempts only!!"
				+ "\nThis is accurate to 8 decimal places."
				+ "\nThe answer correct to 8 decimal places: " + String.format( "%.8f", currentGuess) );

	}
	
	public static double function(double x)
	{
		
		return (Math.pow(x, 5)-12345); // x^5 - 12345 = 0
		
	}
	
	public static double derivative(double x)
	{
		return (5*Math.pow(x, 4));   // 5x^4
	}
}
