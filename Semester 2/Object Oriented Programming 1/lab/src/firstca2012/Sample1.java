package firstca2012;
import javax.swing.JOptionPane;

public class Sample1 {
	
	public static void main( String[] args )
	{
		String wageString = JOptionPane.showInputDialog( "Please enter the gross income of the citizen" );
		double wage = Double.parseDouble( wageString );
		
		String group = JOptionPane.showInputDialog( "Please enter the class of the citizen" );
		
		double totalPRSI = PRSICalculator( wage, group );
		
		JOptionPane.showMessageDialog( null
				, "The PRSI due by the citizen is " + String.format( "%.2f", totalPRSI )
				, "PRSI Calculator"
				, JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
		
	}
	
	
	public static double PRSICalculator( double wage, String group )
	{
		double totalPRSI = 0.0d;
		
		if( wage > 18_304D && group.toUpperCase().equals( "A" ) )
		{
			totalPRSI = wage * 0.04d;
		
		} else if ( wage <= 75_036D && group.toUpperCase().equals( "B" )
				 				   || group.toUpperCase().equals( "C" )
				 				   || group.toUpperCase().equals( "D" ) ) 
		{
			
			if ( wage > 75_036D ) { totalPRSI = (wage * 0.009D) + ((wage-75036)*0.04D); }
			else { totalPRSI = wage * 0.009D; }
			
		
		} else if( group.toUpperCase().equals( "S" ) )
			
		{
			totalPRSI = wage * 0.04D;
			
			if( totalPRSI < 500D ) { totalPRSI = 500.00D; }
			
		} else
			totalPRSI = 0.00D;
		
		
		return totalPRSI;
		
	}
}
