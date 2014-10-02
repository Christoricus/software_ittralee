/**This is an instantiable Student class.
 @author John Walsh
 @version 1.0 */ 

public class Student {
	//attributes
	private String name;
	private boolean studentStatus;
	
	
	/** single argument constructor method
	 @param name the full name of the student */
	 public Student(String name){
		this.name=name;
		studentStatus=true;
	}
	
	/** acessor method to return the student name
	 *@return the name of the student */
	public String getName(){return name;}
	
	/** mutator method to set the student name
	 *@param name the name of the student */
	public void setName(String name){
		this.name=name;
	}
	
	/** toString method to return the student details
	 *@return the name and status of the student as a string */
	public String toString(){
		return "Name: "+getName()+"Student: " +studentStatus;
	}

}
