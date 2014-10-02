/** Procedural all-in-one program to manage the details of 2 people*/
public class ProceduralPeople {
  public static void main(String args[]) {
  
    //Give first person some default values
  	String name="Not Given";
	int age=0;
	char gender='U';
	
	System.out.println("First Person:  " + name + " " + age + " " + gender);

	//Now give the second person some fresh, user-supplied, values
	// note if we want to keep track of 2 people, we need 2 sets of 3 variables
	String name2="Joe";
	int age2=20;
	char gender2='M';
	
	System.out.println("\nSecond Person: " +name2 + " " + age2 + " " + gender2);
	
	} //end of main() method

}
