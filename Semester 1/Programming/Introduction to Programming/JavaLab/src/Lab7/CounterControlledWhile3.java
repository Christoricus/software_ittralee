package Lab7;
import java.util.Scanner;
public class CounterControlledWhile3 {
	public static void main(String[] args) {
		float number, largest=0, smallest=0;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
		while(count < 4) {
			System.out.print("Iteratation " + (count+1) + " - please enter a number: ");
			number = input.nextFloat();
			
			if(count == 0){	
				largest = number;
				smallest = number;
			}else{
				if(number>largest)
					largest = number;
				else if(number<smallest)
					smallest = number;
			}
			count++;
		}
		System.out.println("\n==========================\n" +
					"\tProgram Results\n" +
					"==========================" +
					"\nLargest number: " + largest +
					"\nSmallest number: " + smallest);
		input.close();
	}

}
