package lab4;
/**Driver class for Student
 */
 import javax.swing.*;
public class StudentTest {
   public static void main(String args[]){
   	
   		Person p= new Person();
   		
   		System.out.println(p.toString());
   	
   		Person p1= new Person("Joe",21,'m');
   		
   		p1.setName("Joey");
   		
   		System.out.println(p1.toString());
   		
   		
   		Student s11=new Student();
   		System.out.println(s11.toString());
   		
   		Student s12=new Student("T0000336666","Comp","Mary",18,'f');
   		System.out.println(s12.toString());
   		
   		s12.setName("John");
   		s12.setGender('m');
   		s12.setCourse("Business");
   		
   		
   		
   		System.out.println(s12.toString());
   		
   		String message=s12.hug(5);
   		String message1=s12.kiss(5);
   		System.out.println(message);
   		System.out.println("Kiss Me");
   		System.out.println(message1);
   	
      	      
		System.out.println("Creating a Student object via " +
					 "the Student no-argument constructor...");
		Student s1 = new Student();
		JOptionPane.showMessageDialog(null,"Values of default student object s1 as follows: \n" + s1.toString());
		// you can use methods from Person in connection with a Student: 
		JOptionPane.showMessageDialog(null,"Gender is : " + s1.getGender());
		s1.setName("Micky Mouse");
		JOptionPane.showMessageDialog(null, "After re-assigning the name, the details are now: " + s1);
	// create a Student object s2 via arguments to the Student constructor
		Student s2 = new Student("t00012345","CPMM200","Michael Jones", 21,'m');
		JOptionPane.showMessageDialog(null, "Create a Student object s2 via arguments to the Student constructor\n" +
		"The values of the Student object s2 at this stage are as follows: \n" + s2.toString());
	  }
}