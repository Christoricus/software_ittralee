import javax.swing.*;
/** models animals interacting */
public class AnimalFarm{
	public static void main (String args[]){
		JTextArea display = new JTextArea();
		Bear b1 = new Bear();
		b1.setName("Teddy");
		b1.setSize(3);
		Bear b2 = new Bear("Billy", 4, 2);
		
		Rabbit r1 = new Rabbit();
		r1.setName("Bugsy");
		r1.setSize(7);
		Rabbit r2 = new Rabbit("Jimmy",4);
		
		display.append("I have the following animals on the farm: \n");
		display.append (b1 + "\n" + b2 + "\n" + r1 + "\n" + r2 + "\n");
		JOptionPane.showMessageDialog(null,display);
		// what if a rabbit were to hug a bear?
		// or even kick one...
	}
}