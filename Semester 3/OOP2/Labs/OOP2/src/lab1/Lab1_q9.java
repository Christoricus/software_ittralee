package lab1;

public class Lab1_q9 {
	public static void main(String[] args) {
		int below250 = 0, over400 = 0;
		double lightest = 0, total = 0;
		//Initialising a double array of weights for 10 cows
		double[] animalsWeight = {234.2, 123.04, 344.8, 455.4, 150.6, 243.2, 323.0, 844.3, 455.4, 605.1};
		lightest = animalsWeight[0]; //set lightest weight to the first index
		//Loop through the entire array to find the required objective
		for (int i = 0; i < animalsWeight.length; i++) {
			//Find weights below 250
			if (animalsWeight[i] < 250D)
				below250++;
			//Find weight over 400
			if (animalsWeight[i] > 400D)
				over400++;
			//Find the lightest weight
			if (animalsWeight[i] < lightest)
				lightest = animalsWeight[i];
			
			total += animalsWeight[i];
		}
		//outputting the weights
		System.out.print("Weights: ");
		for (int j = 0; j < animalsWeight.length; j++) { //Or use Arrays.toString(animalsWeight);
			System.out.print(animalsWeight[j]);
			if (j != animalsWeight.length-1)
				System.out.print(", ");
		}
		//outputting other stuff
		System.out.println("\nNumber under 250kg: " + below250
				+ "\nPercentage over 400kg: " + (over400/10D)*100D + "%"
				+ "\nLightest animal: " + String.format("%.1f", lightest) + "kg"
				+ "\nAverage weight: " + String.format("%.1f", (total/10)) + "kg");
	}

}
