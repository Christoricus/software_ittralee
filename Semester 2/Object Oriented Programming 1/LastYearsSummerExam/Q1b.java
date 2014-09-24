//Q1b.java
/*This program determines how much PRSI a worker needs to pay annually*/

import javax.swing.JOptionPane;

public class Q1b {
	public static void main(String args[])
		{					
			String workerType,incomeAsString;
			float income,PRSI;
			
			
			incomeAsString = JOptionPane.showInputDialog("Annual income?");
			income = Float.parseFloat(incomeAsString);
			
			
			if (income>=18304)
			{
				workerType = JOptionPane.showInputDialog("Worker Type? self-employed or public-sector?");
				
			    if(workerType.equals("self-employed"))
			    	if(income > 100100)
			    		PRSI = (income-100100)*0.025f+(100100)*0.03f;
			    	else
			    		PRSI = (income)*0.03f;
			    else
			    	PRSI = income*0.009f;
			    		
			    
				JOptionPane.showMessageDialog(null,"PRSI due by this worker is €" + String.format("%.0f",PRSI),
				                              "PRSI Calculation",JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null,"No PRSI due by this worker","PRSI Calculation",JOptionPane.INFORMATION_MESSAGE);
			  
			
			System.exit(0);
					
		}
}	



