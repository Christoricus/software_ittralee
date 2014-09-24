package progmaths;
import java.util.Scanner;

public class lab5 {
	
	static Scanner input = new Scanner( System.in );
	
	public static void main( String[] args ) 
	{
		
		String result = "";

		int random = (int) (Math.random()*100+1);
		//System.out.println( "Random is " + random );
		
		do {

			System.out.print( "\nPlease guess a number between 1 to 100: " );
			int numberGuessed = input.nextInt();
			
			if( numberGuessed > random )
			{
				System.out.print( "\t!!!!!!!!!!!!!!!  TOO HIGH !!!!!!!!!!!!!!!" );

			} else if ( numberGuessed < random ) { 
				System.out.print( "\t!!!!!!!!!!!!!!! TOO LOW !!!!!!!!!!!!!!!" );
			
			} else {
				System.out.print( "\tCorrect" );
				break;
			}
						
			//input.nextLine();	
		
		}
		while( !result.equals("Correct") );
		
		
		input.close();
	}


}
