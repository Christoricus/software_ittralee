package progmaths;

public class lab5_5 {

	public static void main(String[] args) {
		double accuracy = 0.000000001;
		double lowerBound = 1.0D, upperBound = 7.0D, answer = 0; 
		boolean isFinished = false;
		int attempts = 1;

		do {
			answer = (lowerBound + upperBound)/2;
			double value = function(answer);
			
			isFinished =  ((upperBound - lowerBound) < accuracy);

			if ( value > 0 ) {  // too high
				upperBound = answer;

			} else if ( value < 0 ) {  // too low
				lowerBound = answer;
				
			}
			attempts++;
			
			//System.out.println( "\nNext guess is " +  answer );

		} while( !isFinished );

		System.out.println( "\n\nIt took " + attempts + " attempts only!!"
				+ "\nThis is accurate to 8 decimal places."
				+ "\nThe answer correct to 8 decimal places: " + String.format( "%.8f", answer) );

	}
	
	public static double function(double x)
	{
		
		return (Math.pow(x, 5) - 12345); // x^5 - 12345 = 0 
		
	}
}
