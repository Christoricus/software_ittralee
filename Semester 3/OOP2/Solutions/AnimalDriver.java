import javax.swing.*;
public class AnimalDriver{
	public static void main(String args[])
		{
		String continyou="Yes";
		
		Animal [] herd =new Animal[5];
		int i=0;
			
		while (continyou.equalsIgnoreCase("Yes")&& i<4){
			
			Animal a1 = new Animal();
			
			a1.setType(JOptionPane.showInputDialog("Enter name of animal"));
			a1.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Enter weight of animal")));
			a1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter age of animal")));
			
			a1.setContinents(enterContinents());

			System.out.println("\n\n" + a1.toString());
			
			herd[i]=a1;
			i++;

			continyou=JOptionPane.showInputDialog("Continue Yes/No");
			
			//System.out.println("Type: "+ a1.getType()+"Age: "+ a1.getAge());
			
			
			}//end outer while loop
			System.exit(0);
		}//end main method
		
	public static String[] enterContinents(){
			String []cons= new String[5];
			int count=0;
			String continent="Unknown";
			
			while (!continent.equalsIgnoreCase("")&&count<5){
			continent = JOptionPane.showInputDialog("Please enter continent(max 5) " + (count+1));
			
			if (continent.equals(""))
				for (int i=count;i<cons.length-1;i++)cons[i]=null;
			else
				cons[count]=continent;
			count++;
			}//end while
			return cons;
	}//end method
}//end class