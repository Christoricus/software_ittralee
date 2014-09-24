package Lab7;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float weight = 0f, totalWeight = 0f, averageWeight = 0f, percentageWeight = 0f, ovr80 = 0f;
		int count = 0;
		float heaviest = 0f, lightest = 0f;
		
		while(count < 5) {
			System.out.print("Please enter the weight of person " + (count+1) + ": ");
			weight = input.nextFloat();
			
			//Checking for weights from 80kgs
			if(weight >= 80)
				ovr80++;
			
			//Checking for heaviest and lightest weight
			if(count==0){
				heaviest = weight;
				lightest = weight;
			}else {
				if(weight>heaviest)
					heaviest=weight;
				else if(weight<lightest)
					lightest=weight;
			}
				
			totalWeight += weight; //add total weight
			averageWeight = totalWeight/5; //average the total weight by 5
			percentageWeight = (ovr80/5)*100; //get the percentage weight over 80
			
			count++; 
			
		}
		System.out.println("\n\n====================================" +
							"\n\tProgram Results\n" +
							"====================================" +
							"\nAverage weight: " + String.format("%.2f", averageWeight) + "kg" +
							"\nPercentage >= 80kg: " + String.format("%.2f",percentageWeight) + "%" +
							"\nHeaviest weight: " + heaviest + "kg" +
							"\nLightest weight: " + lightest + "kg");
		input.close();
	}

}
