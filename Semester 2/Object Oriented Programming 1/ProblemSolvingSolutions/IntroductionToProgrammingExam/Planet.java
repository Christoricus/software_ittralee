//Planet.java
/*This program initialises the values of a number variables concerning the planet Venus and displays some
 *results in a formatted fashion*/

public class Planet {
	public static void main(String args[])
		{					
			String name = "Venus";
			int yearLength = 224, avgDistanceFromSun = 108208930;
			float avgTemperature = 457.5f;
				
			System.out.println("\t=====================================\n" +
				               "\t\tSome details for a planet\n" +
				               "\t=====================================\n\n" +
				               String.format("%-30s%s\n%-30s%d Earth Days\n%-30s%d km\n%-30s%.1f C",
				               "Name:",name,"Year Length:",yearLength,"Average distance from sun:",
				               avgDistanceFromSun,"Average Temperature:",avgTemperature) +
				               "\n\n\"I think it is a sad reflection on our civilization that while" +
				               "\nwe can and do measure the temperature in the atmosphere of Venus" +
				               "\nwe do not know what goes on inside our souffles\"\n\n\t\t\t\tNicholas Kurti");		
		 }
}	



