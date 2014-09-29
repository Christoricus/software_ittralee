public class HumanTest{
	
//// main method///	
public static void main(String [] args)	{

/// creating a Human object using the no-args constructor(xman = object reference)//
Human xman = new Human();	
	
Human yman = new Human("Jim");
yman.setHairColour("Black");
yman.setName("Jimmy");
yman.setName("Johnny");

//Human yman = new Human("John");

Human xwoman = new Human("Sarah",21,'F',"Blonde");
xwoman.setHairColour("Brunette");

Human ywoman = new Human("Mary");
ywoman.setAge(27);
ywoman.setGender('F');
ywoman.setHairColour("Red");

Human zdog = new Human("Skip",7);


Human qbird = new Human("Chirp",2,'M');



System.out.println(xwoman.toString());/// Objectname.method //
System.out.println(ywoman.toString());
System.out.println(xman.toString());
System.out.println(yman.toString());
System.out.println(zdog.toString());
System.out.println(qbird.toString());

	
	
	
}
	
	
	
	
	
}