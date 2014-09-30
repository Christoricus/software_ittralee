package lab2;
//Class work
public class Human {
	//Setting up attributes
	private String eyeColour;
	private int age;
	private String name;
	private boolean terrorist;
	
	//Constructor
	public Human() {
		eyeColour = "Red";
		age = 0;
		name = "Unknown";
		terrorist = true;
		//Alternative
		//this("Red", 0, "Unknown", true); << this argument calls the multi-parameter constructor
	}
	
	public Human(String name) {
		eyeColour = "Red";
		age = 0;
		this.name = name; //this keyword refers to the attribute variable
		terrorist = true;
		//Alternative
		//this("Red", 0, name, true); << notice: name in this case isn't a String but a parameter
	}
	
	public Human(String eyeColour, int age, String name, boolean terrorist) { //multi-parameter constructor
		//this on the left refers to the attributes
		//eyeColour on the right refers to the parameters
		this.eyeColour = eyeColour;
		this.age = age;
		this.name = name;
		this.terrorist = terrorist;
	}
	
	//Accessor methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEyeColour() {
		return eyeColour;
	}
	
	public boolean getTerrorist() {
		return terrorist;
	}
	
	//Mutator methods
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTerrorist(boolean terrorist) {
		this.terrorist = terrorist;
	}
	
	public String toString() {
		String message = String.format("Name: %s\nEye Colour: %s\nAge: %d\nTerrorist: %s\n", name, eyeColour, age, terrorist);
		return message;
	}
}
