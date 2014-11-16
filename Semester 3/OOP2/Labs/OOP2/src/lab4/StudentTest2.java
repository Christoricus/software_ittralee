package lab4;
/**Driver class for Student
 */
 import javax.swing.*;
public class StudentTest2 {
   public static void main(String args[]){
   		Student s1 = new Student();
   		
   		/* Rewrite this program
   		 *  (a) so that it sends its output to a message dialog 
   		 *  (b) so that it asks for the student details to be entered via input dialogs before 
   		 *  	creating the second student object 
   		 *  (c) so that it creates a default student object, then asks for the 
   		 *  details and uses mutators to set them
   		 */

   		s1.setStudentNumber(JOptionPane.showInputDialog("Enter student number"));
   		s1.setCourse(JOptionPane.showInputDialog("Enter course code"));
   		s1.setName(JOptionPane.showInputDialog("Enter your name"));
   		s1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter your age")));
   		s1.setGender(JOptionPane.showInputDialog("Enter your gender M/F").charAt(0));
   		
   		JOptionPane.showMessageDialog(null, s1.toString());
   		System.exit(0);
	  }
}