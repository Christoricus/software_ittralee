package lab3;
import lab3.weightpackage.WeightPackage;

/** Driver class to test out the WeightPackage class functionality */

public class WeightPackageTest {
	public static void main(String args[]) {
		System.out
				.println("Start off by creating a WeightPackage object using the no-arg constructor");
		WeightPackage w1 = new WeightPackage();
		System.out
				.println("The value of the WeightPackage object after creation via no-arg copy constructor is "
						+ w1);
		System.out
				.println("Now will create a second WeightPackage object using the 2-arg copy constructor, making it 12st and 6lbs");
		WeightPackage w2 = new WeightPackage(12, 6);
		System.out.println("The value of the second weight object is " + w2);
		System.out.println("This is " + w2.getKilos() + " kilos");
		System.out
				.println("Will now attempt to set the value of the weight object to 10st 17lbs via the mutators");
		w2.setWeight(10, 17);
		System.out
				.println("The value of the WeightPackage object now is " + w2);
		System.out.println("This is " + w2.getKilos() + " kilos");

	}
}