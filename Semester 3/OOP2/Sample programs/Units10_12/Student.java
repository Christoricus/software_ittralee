/** Models a student,inherits from Person*/
public class Student extends Person{

  private String studentNumber;
  private String course;							 		
  		
  public Student() {
  
	    setStudentNumber("Unknown");
	    setCourse("Unassigned");
  }

  public Student(String snum,String c, String name,int age, char gender){
	     super(name,age,gender);
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
  
  public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nName is " + getName() +
	     "\nAge is " + getAge() +
	     "\nGender is " + getGender();
  }	
  	// alternative way to write subclass toString()
  	/*  public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nOther details: " + super.toString();
   } */
    		
}