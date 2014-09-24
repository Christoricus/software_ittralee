//Person2.java
/*This class builds on the original Person class, adding an extra attribute and several
 *extra methods*/

public class Person2
{
    private String firstName; 
    private String lastName;
    private String middleName; 

    public Person2()
    {
        setName("","","");
    }

    public Person2(String first, String middle, String last)
    {
        setName(first, middle, last);
    }

    public Person2(Person2 otherPerson)
    {
     	setFirstName(otherPerson.firstName);
    	setMiddleName(otherPerson.middleName);
    	setLastName(otherPerson.lastName);   	
    }
    

    public void setName(String first, String middle, String last)
    {
        setFirstName(first);
        setMiddleName(middle);
        setLastName(last);
    }


    public void setFirstName(String first)
    {
        firstName = first;
    }


	public void setMiddleName(String middle)
    {
        middleName = middle;
    }

    public void setLastName(String last)
    {
        lastName = last;
    }


    public String getFirstName()
    {
        return firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public boolean matchesFirstName(String fname)
    {
    	return firstName.equals(fname);
    }
    
    public boolean matchesMiddleName(String mname)
    {
    	return middleName.equals(mname);
    }
    
    public boolean matchesLastName(String lname)
    {
    	return lastName.equals(lname);
    }
    
    public boolean equals(Person2 otherPerson)
    {
    	return (matchesFirstName(otherPerson.firstName) && matchesMiddleName(otherPerson.middleName)
    	 && matchesLastName(otherPerson.lastName));
    }
    
    public void makeCopy(Person2 otherPerson)
    {
    	setFirstName(otherPerson.firstName);
    	setMiddleName(otherPerson.middleName);
    	setLastName(otherPerson.lastName);
    }
    
    public String toString()
    {
        return getFirstName() + " " + getMiddleName() + " " + getLastName();
    }
}
