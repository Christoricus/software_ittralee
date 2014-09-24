package Lab7;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float weight = 0f, totalWeight = 0f, averageWeight = 0f, percentageWeight = 0f, ovr80 = 0f;
		int count = 0;
		
		while(count < 5) {
			System.out.print("Please enter the weight of person " + (count+1) + ": ");
			weight = input.nextFloat();
			
			if(weight >= 80)
				ovr80++;
			
			totalWeight += weight;
			averageWeight = totalWeight/5;
			percentageWeight = (ovr80/5)*100;
			count++;
			
		}
		System.out.println("\n\n====================================" +
							"\n\tProgram Results\n" +
							"====================================" +
							"\nAverage weight: " + String.format("%.2f", averageWeight) + "kg" +
							"\nPercentage >= 80kg: " + String.format("%.2f",percentageWeight) + "%");
		input.close();
	}

}
