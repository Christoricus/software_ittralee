package lab2;

public class Animal {
	private String type;
	private String[] continents = new String[7];
	private double weight;
	private int age;
	
	public Animal() {
		type = "unknown";
		continents = null;
		weight = 0.0D;
		age = 0;
	}
	
	public Animal(String typ, String[] cont, double wt, int age) {
		this.type = typ;
		this.continents = cont;
		this.weight = wt;
		this.age = age;
	}
	
	
}
