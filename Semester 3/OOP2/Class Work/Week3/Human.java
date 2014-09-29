public class Human{
	
//// define attributes ///encapsulation


private String name;
private int age;
private char gender;
private String hairColour;


/// no argument constructor //
public Human ()	{
 /*this.name ="Unknown";
 this.age = 0;
 this.gender = 'N';
 this.hairColour = "Brown";	
 */
 
 //// alternate::	
  this("Unknown",0,'N',"Brown");	
 	
 	
}///// end no args constructor
	
public Human(String name){///single arg constructor
	
	this.name=name;
	this.age = 0;
	this.gender = 'N';
	this.hairColour = "Brown";	
		
		
/// alternat this(name,0,'N',"Brown)

}	

public Human(String name,int age){///double arg constructor
	
	this.name=name;
	this.age=age;
	this.gender = 'N';
	this.hairColour = "Brown";	

}	

public Human(String name,int age,char gender){///triple arg constructor
	
	this.name=name;
	this.age=age;
	this.gender =gender;
	this.hairColour = "Brown";	

}	
//// four args constructor
public Human(String name,int age,char gender,String hairColour){
	this.name=name;	
	this.age=age;
	this.gender=gender;
	this.hairColour=hairColour;


}

/// this is an accessor method that returns a String//
public String getName(){
	
	return name;
}



public int getAge(){
	
	return age;
}



	
public char getGender(){
	
	return gender;
}


	
public String getHairColour(){
	
	return hairColour;
}
		
	
////// Now we write Mutator Methods!!CHANGE Value	
	

public void setName(String name){
	
	this.name=name;
	
}



public void setAge(int age){
	
	this.age=age;
	
}



public void setGender(char gender){
	
	this.gender=gender;
	
}




public void setHairColour(String hairColour){
	
	this.hairColour=hairColour;
	
}

public String toString(){

  return String.format("Name :%s\nAge :%d\nGender :%c\nHairColour :%s\n"
               ,name,age,gender,hairColour);	
	
}


	
	
}// end public class Human//