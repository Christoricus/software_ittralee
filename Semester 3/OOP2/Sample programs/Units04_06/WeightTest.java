/** Driver class to test out the Weight class functionality*/
public class WeightTest{
   public static void main(String args[]) {
      System.out.println("Start off by creating a Weight object using the no-arg constructor");
      Weight w1 = new Weight();
      System.out.println("First weight, created via no-arg constructor is " + w1);         
      System.out.println("Now create a second Weight object using the 2-arg constructor, making it 12st and 6lbs");
	  Weight w2 = new Weight(12,6);
	  System.out.println("Second weight: " + w2);
	  System.out.println("This is " + w2.getKilos() + " kilos");
	  System.out.println("\nWill now attempt to set second weight to 10st 17lbs");
	  w2.setWeight(10,17);
	  System.out.println("Second weight now: " + w2);
	  System.out.println("Note that the internal setPounds() method in Weight didn't allow a value of 17");
	  System.out.println("\nFinally, create a third weight, this time 65 kg");
	  Weight w3 = new Weight(65.5);
	  System.out.println("Weight 3 in kg is (note the effects of lack of precision): " + w3.getKilos());
	  System.out.println("In the old system, this would be " + w3.toString());
   }
}