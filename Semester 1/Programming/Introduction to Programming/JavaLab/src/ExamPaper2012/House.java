package ExamPaper2012;
//House.java
/* This is a multiline comment.
 * This is part of the multiline.
 * This program prints out the advertisement for the Estage Agency.
 */
public class House {

	public static void main( String[] args )
	{
		String location = "Oakpark Demense, Tralee, Co. Kerry";
		String type = "Two Storey";
		int numberOfRooms = 8;
		int price = 220000;

		String formatString = "%15s%s\n\n\nDetails of house ref 87435682 are as follows: \n\n" +
				"\t%-17s%s\n\t%-17s%s\n\t%-17s%d\n\t%-17sEUR%d\n\n" +
				"Please note that the data above is valid to 31/1/2013.\n" +
				"All communication with regard to the property must take place through this \n" +
				"agency. Opening hours are 9-5 Monday-Friday, telephone (066)7112345";	 


		System.out.println(String.format(formatString,"","********** ACME ESTATE AGENTS" + (char)169 + "**********",
				"Location:",location,"Type:",type,"Number of Rooms:",numberOfRooms,"Price:",price));

	}

}
