package lab2;
//Class work
public class HumanDriver {
	public static void main(String[] args) {
		Human adam = new Human();
		Human eve = new Human("Eve");
		Human abel = new Human("Blue", 20, "Abel", false);
		Human cain = new Human("Green", 19, "Cain", true);
		
		adam.setName("Adam");
		adam.setAge(32);
		adam.setEyeColour("Brown");
		eve.setEyeColour("Hazel");
		cain.setTerrorist(false); //<< reset the value for Cain
		
		System.out.println(adam.toString());
		System.out.println(eve.toString());
		System.out.println(abel.toString());
		System.out.println(cain.toString());
		
		//Accessing something specific via accessor methods
		System.out.println(cain.getName());
	}

}
