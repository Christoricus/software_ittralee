import javax.swing.JOptionPane;

public class Animal{
	private String type;
	private String[] continents;
	private double weight;
	private int age;

	public Animal(){
		this("No type specified",null,0.0,0);
	}

	public Animal(String type,String continents[],double weight,int age){
		setType(type);
		setContinents(continents);
		setWeight(weight);
		setAge(age);
	}

	// Mutators

	public void setType(String type){
		this.type = type;
	}

	public void setContinents(String continents[]){
		this.continents = continents;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public void setAge(int age){
		this.age = age;
	}

	// Accessors

	public String getType(){return type;}

	public String[] getContinents(){return continents;}

	public double getWeight(){return weight;}

	public int getAge(){return age;}

	public String toString(){
		String conts = "";
		int i;

		if(continents == null)
			conts = "Not specified";
		else{
			for(i=0;i<continents.length;i++){
				if (continents[i] == "" || continents[i] == null)
					break;
				else
					conts += continents[i] +", ";
			}

			//Remove preceeding comma
			conts = conts.substring(0,conts.length()-2);
		}

		return "Type: " + type + "\nContinents: " + conts + "\nWeight: " + String.format("%.2f",weight) + "\nAge: " + age;
	}
}