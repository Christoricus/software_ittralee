
public class CircleRev2Util{
		//class method
		public static double calcArea(int rad){
		double area= Math.PI * Math.pow(rad,2);
		return area;
	}//end of calcArea
		//class method
		public static double perimeter(int rad){
			double peri = 2*Math.PI * rad;
			return peri;
		}
		
		//instance method
		public  double perimeterCirc(int rad){
			double peri = 2*Math.PI * rad;
			return peri;
		}
	
}