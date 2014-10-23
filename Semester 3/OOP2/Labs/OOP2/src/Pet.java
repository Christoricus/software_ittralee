
public class Pet {
	private String type;
	private String[] vaccinations;
	private int age;
	
	public Pet() {
		this("Unknown", null, 0);
	}
	
	public Pet(String type, String[] vac, int age) {
		/*this.type = type;
		this.vaccinations = vac;
		this.age = age; */
		setAge(age);
		setType(type);
		setVaccinations(vac);
	}
	
	//Mutator
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setVaccinations(String[] vacs) {
		this.vaccinations = vacs;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	//Accessor
	public int getAge() {
		return age;
	}
	
	public String[] getVaccinations() {
		return vaccinations;
	}
	
	public String getType() {
		return type;
	}
	
	
	public String toString() {
		
		String vacs = "";
		
		if (vaccinations == null) {
			vacs = "Unknown";
		} else {
			for (int i = 0; i < vaccinations.length; i++) {
				if (vaccinations[i] == null || vaccinations[i] == "") {
					break;
				
				} else {
					vacs += vaccinations[i] + ", ";
				}
					
			}
		}
		
		String msg = String.format("Type: %s\nAge: %d\nVaccinations: %s\n", getType(),  getAge(), vacs);
		
		return msg;
	}
}