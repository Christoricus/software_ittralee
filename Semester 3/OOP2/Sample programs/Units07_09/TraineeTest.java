/** Driver class to test Trainee class functionality*/
public class TraineeTest {
      public static void main(String args[]){
           System.out.println("First create a Trainee p1 via" + 
           " the no-argument constructor...");
           Trainee p1 = new Trainee();
           System.out.println("Values of the Trainee object p1:\n" + p1.toString());
           System.out.println("\n\nNow create a second Trainee object" +
           ", this time via arguments passed to the constructor...");
           Trainee p2 = new Trainee("Jerry McGuire", "Tralee", 25, 1.8, 15, 10);
           System.out.println("Values of the Trainee p2 are as follows:\n" + p2.toString());        
		   System.out.println("\n\nCheck the functionality of the setAddress() method separately by setting the address of p1 to \"Ballyheigue\"");
		   p1.setAddress("Ballyheigue");
		   System.out.println("The address of the Trainee object p1 ( obtained using getAddress() ) is now " + p1.getAddress());
		   System.out.println("\n\nCheck the functionality of the getStartWeight() method separately on p2");
		   System.out.println("Starting weight of the Trainee p2 is " + p2.getStartWeight().toString());
		   System.out.println("\n\nCan also set the starting weight of p2 to 14 st 6 oz using setStartWeight()");
		   p2.setStartWeight(14,6);
		 
		   System.out.println("New starting weight of the Trainee p2 is " + p2.getStartWeight().toString());
		 }
}