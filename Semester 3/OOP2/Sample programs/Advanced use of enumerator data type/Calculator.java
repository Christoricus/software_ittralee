//program example showing the use of the enumerator data type
import javax.swing.*;

public class Calculator{
	
	//enum can not be local.
	//can be defined within the class as follows or in separate file 
	//public enum CalcOption{ADD,SUBTRACT,MULTIPLY,DIVIDE};
		
	public static void main(String []args){
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Enter num"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Enter another num"));
		double total=0;;
		CalcOption choice=null;
		String option=JOptionPane.showInputDialog("ADD/SUBTRACT/MULTIPLY/DIVIDE");
		
		if (option.equals("ADD"))
				choice=CalcOption.ADD;
		else if (option.equals("SUBTRACT"))
				choice=CalcOption.SUBTRACT;
		else if (option.equals("MULTIPLY"))
				choice=CalcOption.MULTIPLY;
		else if (option.equals("DIVIDE"))
				choice=CalcOption.DIVIDE;
		else{
			JOptionPane.showMessageDialog(null,"Invaid entry");
			System.exit(0);
		}		
		
		switch (choice){
			case ADD:total=num1+num2;break;
			case SUBTRACT:total=num1+num2;break;
			case MULTIPLY:total=num1*num2;break;
			case DIVIDE:total=num1/num2;break;
		}
			
		JOptionPane.showMessageDialog(null,String.format("Total is: %.2f ",total));	
			
		}
		
		
		
		
		
		//Switch (opt)
		
	}
	

	
