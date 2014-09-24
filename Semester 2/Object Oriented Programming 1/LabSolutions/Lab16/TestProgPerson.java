//TestProgPerson.java
/*This driver program tests out the class Person fully*/

import javax.swing.*;

public class TestProgPerson                            
{                                                      
    public static void main(String[] args)             
    {   
        String text,firstName,lastName;
        
        text = "Calling the Person() constructor .....";                                              
        Person person1 = new Person();
        text += "\nValue of object person1 is now \"" + person1 + "\"";                    

		text += "\n\nCalling the Person(String,String) constructor .....";
		
		firstName = JOptionPane.showInputDialog("Please enter the first name of the person");
		lastName = JOptionPane.showInputDialog("Please enter the last name of the person");
		    
        Person person2 = new Person(firstName, lastName);
        text += "\nValue of object person2 is now \"" + person2 + "\"";
        
        JOptionPane.showMessageDialog(null,"*****Person Class Tester*****\n\n" + text,"",
        JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
   
    }                                      
}                                                      