public class Character{
	private String name;
	private double height;
	private int strength;
	private boolean armed;
	
	//No arguement constructor
	public Character(){
		name = "unknown";
		height = 0.0;
		strength = 0;
		armed = false;
	}//End Construcor
	
	//Single arguement constructor
	public Character(String name){
		this.name = name;
		height = 0.0;
		strength = 0;
		armed = false;
		//Alternative
		//this(name,0.0,0,false);
	}//End character
	
	public Character(String name, double height, int strength, boolean armed){
		this.name = name;
		this.height = height;
		this.strength = strength;
		this.armed = armed;
	}//End multiple arguement constructor
	
	//Mutator methods
	public void setStrength(int strength){
		this.strength = strength;
		
	}//End set Strength
	
	public void setHeight(double height){
		this.height = height;
	}//End set height
	public void setName(String name){
		this.name = name;
	}//End set name
	public void setArmed(boolean armed){
		this.armed = armed;
	}//End set armed
	
	//Accessor method
	public boolean getArmed(){
		return armed;
	}//End accessor method
	public String getName(){
		return name;
	}
	public double getHeight(){
		return height;
	}
	public int getStrength(){
		return strength;
	}
	
	
	
	//To String Method
	
	public String toString(){
		String message = String.format("name:%s\n height:%.2f\n strength:%d\n armed:%s\n"
							,name,height,strength,armed);
		return message;
	}//End toString
	
	
	
}//End class