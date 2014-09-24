package ExamPaper2012;
import java.util.Scanner;
public class Formatting {
	
	public static void main( String[] args )
	{
		int count = 0;
		double sum = 0;
		
		while( sum <= 500 ) 
		{
			sum = sum + Math.pow(count, 2);
			
			count++;
		}
		System.out.println("The sum is " + sum);
		

	}

}
