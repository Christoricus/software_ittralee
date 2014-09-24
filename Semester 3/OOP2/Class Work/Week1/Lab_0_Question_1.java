import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Lab_0_Question_1 {
	public static void main (String args[])
	{
		String name, className,snacksAsString, output;
		int numberOfSnacks, totalCost;
		
		//Input
		name=JOptionPane.showInputDialog("WHat is your name? ");
		className=JOptionPane.showInputDialog("What is your class name? ");
		snacksAsString=JOptionPane.showInputDialog("How many snacks would you like? ");
		//Process
		numberOfSnacks = Integer.parseInt(snacksAsString);
		
		totalCost = numberOfSnacks * 2;
		
		//Output
		
		output=String.format("name:%s\n class name: %s\n total cost: €%d ",name,className,totalCost);
		
		JOptionPane.showMessageDialog(null,output,"Restuarant",JOptionPane.INFORMATION_MESSAGE);
		
		
		/*JOptionPane.showMessageDialog(null,"Your name is " + name + "," +
									  "\nyour class name is " + className + "," +
									  "\nand the total cost is €" + totalCost,"Total Cost",JOptionPane.INFORMATION_MESSAGE);*/
		
		
		
		
		
	}//end of main method
}// end of class