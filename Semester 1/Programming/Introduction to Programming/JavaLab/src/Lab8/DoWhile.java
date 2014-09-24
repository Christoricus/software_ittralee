package Lab8;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args)
	{
		int count=0;
		float highest=0, totMarks=0, mark=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Please enter the mark of student " + (count+1) + " (-1 to exit): ");
			mark = input.nextFloat();

			if(mark == -1)
				break;
			
			if(mark > highest)
				highest = mark;
			
			totMarks += mark;
			count++;
			
		}while(mark != -1);
		
		//System.out.println("\nHighest mark was: " + highest);
		if(count != 0){
			System.out.println("\nHighest mark was: " + highest);
			System.out.printf("Average mark was: %.0f",totMarks/count);
		}else
			System.out.println("\nMarking system was not computed.");
		
		input.close();
	}
}
