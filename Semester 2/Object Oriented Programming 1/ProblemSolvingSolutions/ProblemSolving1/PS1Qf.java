//PS1Qf.java
/*This program uses format specifiers to display data in a certain way*/

public class PS1Qf {
	public static void main(String args[])
	{
		int mathsMark=45,programmingMark=64,digitalImagingMark=73,webDesignMark=82;
			
		System.out.println(String.format("%-25s%d\n%-25s%d\n%-25s%d\n%-25s%d","Maths:",mathsMark,"Programming:",programmingMark,
		                                "Digital Imaging:",digitalImagingMark,"Web Design:",webDesignMark));
	}
}