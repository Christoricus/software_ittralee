package lab3;

/* Static utility methods. Write a class which contains a class (static) method called
 * calcOverallMark() to work out a weighted average of three marks, taking 15% of each of the first
 * two marks (classroom c/a and hand-in c/a) and 70% of the third mark (end-of-module exam).
 * The 3 marks should be supplied as arguments, and the method should return the weighted average
 * mark. This method should not do any input or output. 
 */

public class Marks {
	private static double classCA;
	private static double handinCA;
	private static double finalExam;
	
	public Marks() {
		this(0,0,0);
	}
	
	public Marks(double classroom, double handin, double exam) {
		setClassCA(classroom);
		setHandinCA(handin);
		setFinalExam(exam);
	}
	
	//Setting
	public static void setClassCA(double classroom) {
		classCA = classroom;
	}
	
	public static void setHandinCA(double handin) {
		handinCA = handin;
	}
	
	public static void setFinalExam(double exam) {
		finalExam = exam;
	}
	
	//Getter
	public static double getClassCA() {
		return classCA;
	}
	
	public static double getHandinCA() {
		return handinCA;
	}
	
	public static double getFinalExam() {
		return finalExam;
	}
	
	//Get weighted marks
	public static double calcOverallMark() {
		
		double classRoom = Marks.getClassCA();
		double handin = Marks.getHandinCA();
		double exam = Marks.getFinalExam();
		
		return (classRoom/100*15) + (handin/100*15) + (exam/100*70);
		
	}
	
	public String toString() {
		return "Total weighted mark: " + String.format("%.2f", Marks.calcOverallMark());
	}
	
}