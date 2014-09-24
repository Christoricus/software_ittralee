package week4;
import java.util.Random;
import java.util.Scanner;

public class Lab7Exercise8 {
	
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter the number of times you want to toss the coin: ");
		int numOfToss = input.nextInt();
		
		//if( coinToss( numOfToss ) != 0 )
	}
	
	public static int coinToss( int a )
	{
		int result = 0;
		for(int i = 1; i <= a; i++ )
		{
			int toss = (int) Math.random()+1;
			
			if( (toss-1) < 0 ) 
				result = 0;
			else
				result = 1;
		
		}
		
		return result;
		
	}

}
