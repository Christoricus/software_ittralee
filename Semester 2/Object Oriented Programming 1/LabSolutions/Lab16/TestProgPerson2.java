//TestProgPerson2.java
/*This driver program tests out the class Person2 fully*/

import javax.swing.*;

public class TestProgPerson2                            
{                                                      
    public static void main(String[] args)             
    {   
        String text,firstName,middleName,lastName;
        
        
        text = "Calling the Person2() constructor .....";                                              
        Person2 person1 = new Person2();
        text += "\nValue of object person1 is now \"" + person1 + "\"";                    

		text += "\n\nCalling the Person2(String,String) constructor .....";
		
		firstName = JOptionPane.showInputDialog("Please enter the first name of the person");
		middleName = JOptionPane.showInputDialog("Please enter the middle name of the person");
		lastName = JOptionPane.showInputDialog("Please enter the last name of the person");
		    
        Person2 person2 = new Person2(firstName, middleName, lastName);
        text += "\nValue of object person2 is now \"" + person2 + "\"";
        
        text += "\n\nNow calling the equals() method to see whether the names of objects" +
        " person1 and person2 match";
        
        if(person1.equals(person2))
        	text += "\nThe name of object person1 equals the name of object person2";
        else
        	text += "\nThe name of object person1 does not equal the name of object " +
        	"person2";
        
        text += "\n\nMaking a third Person2 object with the values \"Mary Margaret Connors\"";
        	
        Person2 person3 = new Person2("Mary","Margaret","Connors");
        
        text += "\nNow calling the makeCopy() method to copy the name of object person3" +
        " into the object person1";
        
        person1.makeCopy(person3);
        
        text += "\nThe name of person1 is now " + person1;
        
         text += "\n\nNow calling the equals() method again to see whether the names of " +
         "objects person3 and person1 match (they should)";
        
        if(person1.equals(person3))
        	text += "\nThe name of object person1 equals the  name of object person3";
        else
        	text += "\nThe name of object person1 does not equal the  name of object " +
        	"person3";
        
         
        JOptionPane.showMessageDialog(null,"*****Person2 Class Tester*****\n\n" + text,"",
        JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
   
    }                                      
}                                                      