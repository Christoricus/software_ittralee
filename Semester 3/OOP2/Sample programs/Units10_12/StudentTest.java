/**Driver class for Student
 */
 import javax.swing.*;
public class StudentTest {
   public static void main(String args[]){
      	      
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