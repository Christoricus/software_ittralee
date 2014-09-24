import javax.swing.JOptionPane;
public class Lab_0_Question_1_rev1 {

    public static void main(String args[]) {
    	//variables
    	String className;
    	String name;
    	double totalCost;
    	int numSnacks;
    	
    	//input
    	name = JOptionPane.showInputDialog("What is your name?");
    	className = JOptionPane.showInputDialog("What is your class name?");
    	numSnacks = Integer.parseInt(JOptionPane.showInputDialog("# of snacks?"));
    	
    	//process
    	totalCost = numSnacks * 2;
    	
    	//output
    	
    	String message = String.format("name: %s\nclass: %s\ntotal cost: €%.2f",name,className,totalCost);
    	JOptionPane.showMessageDialog(null,message,"Calculations",JOptionPane.INFORMATION_MESSAGE);
    	
    }//ends main
    
    
}//ends class