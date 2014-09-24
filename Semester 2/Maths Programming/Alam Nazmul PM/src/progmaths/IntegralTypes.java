package progmaths;

/* This program prints out the minimum and maximum values of primitive variables.
 * 
 */

public class IntegralTypes {

	/*
	public static void main(String[] args) {
		
		System.out.println( "Minimum Value for Byte: " + Byte.MIN_VALUE );
		System.out.println( "Maximum Value for Byte: " + Byte.MAX_VALUE );
		
		System.out.println( "\nMinimum Value for Short: " + Short.MIN_VALUE );
		System.out.println("Maximum Value for Short: " + Short.MAX_VALUE);
			
		System.out.println( "\nMinimum Value for Int: " + Integer.MIN_VALUE );
		System.out.println( "Maximum Value for Int: " + Integer.MAX_VALUE );
		
		System.out.println( "\nMinimum Value for Long: " + Long.MIN_VALUE );
		System.out.println( "Maximum Value for Long: " + Long.MAX_VALUE );
		
	}
	*/
	
	public static void main(String[] args )
	{
		byte lastValue = 0;
		byte nextValue = 0;
		
		for( nextValue = 0; nextValue >= lastValue; nextValue++ )
		{
			 lastValue = nextValue;
			 //System.out.println( "Min value is: " + nextValue );
			//System.out.println( "Max value is: " + lastValue );
		}
		System.out.println( "Min value is: " + nextValue );
		System.out.println( "Max value is: " + lastValue );
		//System.out.println( "Maximum Value for Long: " + Long.MAX_VALUE );
	}
	
}
