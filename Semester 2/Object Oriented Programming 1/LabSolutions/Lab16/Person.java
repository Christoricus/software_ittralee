//Person.java
/* This class is a very simple representation of a Person, only implementing their name*/

public class Person
{
    private String firstName; 
    private String lastName;  

    public Person()
    {
        setName("","");
    }

    public Person(String first, String last)
    {
        setName(first, last);
    }


    public void setName(String first, String last)
    {
        setFirstName(first);
        setLastName(last);
    }


    public void setFirstName(String first)
    {
        firstName = first;
    }


    public void setLastName(String last)
    {
        lastName = last;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public String getLastName()
    {
        return lastName;
    }
    
    public String toString()
    {
        return getFirstName() + " " + getLastName();
    }
}
