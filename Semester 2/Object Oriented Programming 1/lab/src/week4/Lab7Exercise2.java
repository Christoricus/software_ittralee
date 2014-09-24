package week4;
import javax.swing.JOptionPane;

public class Lab7Exercise2 {

	public static void  main( String[] args )
	{

		String message;
		String monthNum = JOptionPane.showInputDialog( "Please enter the number of a month (1-12)" );
		int choice = Integer.parseInt( monthNum );

		if( choice >= 1 && choice <= 12 )
		{
			message = "There are " + numberInDays( choice ) + " days in this month."; 
		
		} else
			message = "Invalid - you must enter a month number between 1 and 12";


		JOptionPane.showMessageDialog( null
				, message
				, "Message"
				, JOptionPane.INFORMATION_MESSAGE );

		System.exit(0);

	}

	public static int numberInDays( int choice )
	{
		int days;

		switch( choice )
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;

		case 2:
			days = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;

		default:
			days = 0;
		
		}

		return days;
	}

}
