package lab2;

public class Bicycle {
	private String name;
	private double value;
	private String make;
	
	public Bicycle() {
		this("Unknown", 0.0, "Unspecified");
	}
	
	public Bicycle(String nm, double vlu, String mk) {
		setName(nm);
		setValue(vlu);
		setMake(mk);
	}
	
	//Accessor methods
	public String getName() {
		return name;	
	}
	
	public double getValue() {
		return value;
	}
	
	public String getMake()	 {
		return make;
	}
	
	//Mutator methods
	public void setName(String nm) {
		name = nm;
	}
	
	public void setValue(double vlu) {
		value = vlu;
	}
	
	public void setMake(String mk) {
		make = mk;
	}
	
	public String toString() {
		return "Name: " + getName() + "\nValue: " + getValue() + "\nMake: " + getMake() + "\n";
	}
}
