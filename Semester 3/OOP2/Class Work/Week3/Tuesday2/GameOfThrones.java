public class GameOfThrones{
	public static void main(String args[])
	{
		Character jonSnow = new Character();
		System.out.println(jonSnow.toString());
		
		Character dani = new Character("Dani");
		System.out.println(dani.toString());
		
		Character jamie = new Character("Jamie",1.78,10,false);
		System.out.println(jamie.toString());
		
		dani.setArmed(true);
		jamie.setStrength(8);
		
		System.out.println(jamie.toString());
		System.out.println(dani.toString());
		
		if(dani.getArmed()){
			System.out.println("Dani is armed");
		}
		else
			System.out.println("Dani is unarmed");
		
		
		
	}//End main
}//End class