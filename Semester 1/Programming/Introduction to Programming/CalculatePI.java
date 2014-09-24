/*
 * Part 1:  (for 80% of the marks):
 * USING A WHILE OR A DO-WHILE LOOP write a program to compute PI using the following equation: 
 * PI = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + ...  
 * Allow the user to specify the number of terms (5 terms are shown) to use in the computation.  
 * Each time around the loop only one extra term should be added to the estimate for PI.
 * Part 2: (for 20% of the marks):
 * Alter your solution from part one so that the user is allowed to specify the precision 
 * required between 1 and 10 digits (i.e. the number of digits which are correct; 
 * e.g. to 5 digits PI is 3.14159), and so that the loop continues until the required precision is obtained.
 * Note that you need only submit this second version of the program (assuming you have it working).
 */
import java.util.Scanner;

public class CalculatePI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of terms: ");
		int terms = scanner.nextInt();
		scanner.close();

		double PI = 3.0f; double x = 2;
		do {
			PI = 3;
			if(x%2==0){
				PI += 4/(x*(x+1)*(x+2));
			}else if(x%2==1){
				PI -= 4/(x*(x+1)*(x+2));
			}
			x++;
			
		}while(x <= terms);
		
			
		System.out.print("The value of pi in " + terms + " term is: " + PI);
	}
}
