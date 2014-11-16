package lab4;
/** Models a student,inherits from Person*/
public class Student extends Person implements Hugable, Kissable {

  private String studentNumber;
  private String course;							 		
  		
  public Student() {
	  	//new Person();
	    super();  //not necessary to use super(), it'll automatically call the base constructor.
	    setStudentNumber("Unknown");
	    setCourse("Unassigned");
  }

  public Student(String snum,String c, String name,int age, char gender){
	     //new Person(name,age,gender);
	     super(name,age,gender);
	     //setName(name);
	     //setAge(age);
	     //setGender(gender);
	     setStudentNumber(snum);
	     setCourse(c);
  }

  public String getStudentNumber(){
	     return studentNumber;
  }

  public String getCourse() {
	     return course;
  }

  public void setStudentNumber(String snum){
	     studentNumber=snum;
  }

  public void setCourse(String c){
	     course=c;
  }
  
 /* public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nName is " + getName() +
	     "\nAge is " + getAge() +
	     "\nGender is " + getGender();
  }	*/
  	// alternative way to write subclass toString()
  	  public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nOther details: " + super.toString();
   } 
   	
   	
   public String hug(int x){
   	
   	return "You've benn hugged " +x+ " times";
   	
   }
   	public String kiss(int x){
   	
   	return "Get Lost";
   	
   }
    		
}