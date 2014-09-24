//Assess1Sample1.java
/*A program that uses a user-defined method called PRSICalculator() to determine the 
 PRSI due by a citizen based on their gross income and PRSI class*/

import javax.swing.JOptionPane;

public class Assess1Sample1 {
	public static void main(String args[]) 	
	{
		String incomeAsString,classAsString;
		double income;
		
		incomeAsString = JOptionPane.showInputDialog("Please enter the gross income of the citizen");
		income = Double.parseDouble(incomeAsString);
	    classAsString = JOptionPane.showInputDialog("Please enter the PRSI class of the citizen");
		
		
		JOptionPane.showMessageDialog(null,"The PRSI due by the citizen is €" + 
			    String.format("%.2f",PRSICalculator(income,classAsString)),"PRSI Calculator",JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
		
	}
	
	public static double PRSICalculator(double income,String PRSIClass)
	{
		if(PRSIClass.equals("A"))
			if(income>18304)
				return income*0.04;
			else
				return 0;
				
		else if(PRSIClass.equals("B")||PRSIClass.equals("C")||PRSIClass.equals("D"))
			if(income<=75036)
				return income*0.009;
			else
				return (75036*0.009)+ (income-75036)*0.04;
		
		else if(PRSIClass.equals("S"))
			if(income*0.04>500)
				return income*0.04;
			else
				return 500;		
		else
			return 0;
			
		
			
	}
}