//HumanDriver.java

public class HumanDriver{
	public static void main(String args[]){
		
		Human adam=new Human();
		Human eve=new Human("Eve");
		Human abel=new Human("blue",20,"Abel",false);
		Human cain=new Human("brown",20,"Cain",true);
		
		adam.setName("Adam");
		adam.setAge(10);
		adam.setEyeColour("green");
		eve.setEyeColour("hazel");
		abel.setTerrorist(false);
		
		String aname=adam.getName();
		boolean aterrorist=adam.getTerrorist();
				
		//output
		System.out.println(adam.toString());
		System.out.println(eve.toString());
		System.out.println(abel.toString());
		System.out.println(cain.toString());
		System.out.println("Name:"+aname);
		System.out.println("Terrorist:"+aterrorist);
	}
}