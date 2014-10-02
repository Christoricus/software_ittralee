//Human.java

public class Human{
	//these are attributes
	private String eyecolour;
	private int age;
	private String name;
	private boolean terrorist;
	
	//constructor
	public Human(){
		eyecolour="red";
		age=0;
		name="unknown";
		terrorist=true;
	//alternative
	//this("red",0,"unknown",true);
	}
	
	//constructor
	public Human(String name){
		eyecolour="red";
		age=0;
		this.name=name;
		terrorist=true;
	//alternative
	//keyword this references multi-argument constructor
	//this("red",0,name,true);
	}
	
	//constructor
	public Human(String eyecolour,int age, String name, boolean terrorist){
		this.eyecolour=eyecolour;
		this.age=age;
		this.name=name;
		this.terrorist=terrorist;
	}
	//accessor method
	public String getName(){
		return name;
	}
	
	public String getEyeColour(){
		return eyecolour;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getTerrorist(){
		return terrorist;
	}
	
	//mutator method
	public void setName(String name){
		//keyword this differentiates between attribute and parameter
		this.name=name;
	}
	
	public void setEyeColour(String eyecolour){
		this.eyecolour=eyecolour;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setTerrorist(boolean t){
		terrorist=t;
	}
	
	public String toString(){
		String message=String.format("Name:%s\nEye Colour:%s\nAge:%d\nTerrorist:%s\n",
									name,eyecolour,age,terrorist);
	}
}