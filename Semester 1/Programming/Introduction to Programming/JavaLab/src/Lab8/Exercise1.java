package Lab8;
public class Exercise1 {
	public static void main(String[] args) 
	{
		int cube = 0;
		while(Math.pow(cube, 3) >= -15000){
			cube--;
		}
		System.out.println("The largest negative integer whose cube is less than -15000 is " + cube);
	}
}
