package lab2;

public class Animal {
	private String type;
	private String[] continents;
	private double weight;
	private int age;
	
	/** Test */
	public Animal() {
		this("unknown", null, 0.0, 0); //"Constructor call" calls the main constructor
	}
	
	public Animal(String typ, String[] cont, double wt, int age) {
		
		/**this.type = typ;
		this.continents = cont;
		this.weight = wt;
		this.age = age;
		*/
		setType(typ);
		setContinents(cont);
		setWeight(wt);
		setAge(age);
	}
	
	//Accessor methods
	public String getType() {
		return type;
	}
	
	public String[] getContinents() {
		return continents;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
	//Mutator methods
	public void setType(String typ) {
		type = typ;
	}
	
	public void setContinents(String[] cont) {
		continents = cont;
	}
	
	public void setWeight(double wt) {
		weight = wt;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/** Formatting the document 
	 @return everything formatted
	 */
	public String toString() {
		String conts = "";
		
		if (continents == null) {
			conts = "Not specified";
		} else {
			for (int i = 0; i < continents.length; i++) {
				if (continents[i] == "" || continents[i] == null) { break; }
				else { 
					conts += continents[i] + ", "; 
				}
			
			} //end of for loop
		
		}//end of if statement
		
		String msg = String.format("Type: %s\nContinents: %s\nWeight: %.2f\nAge: %d",
									type, conts, weight, age);
		return msg;
	}
}
