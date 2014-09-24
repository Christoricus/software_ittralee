import javax.swing.*;
/** demonstrates a static user-written method
 */
public class AppWithUserwrittenCubeMethod{
	
	public static void main (String args[]) {
		// declare variables, construct objects and set headings
		JTextArea out = new JTextArea("Table of Cubes\n");
		out.append("Number    Cube\n");
		// calculate the cubes of all values
		for (int y = 1; y<=15; y++){
			out.append(y + "          " + cube(y) + "\n");
		} // end for 
		JOptionPane.showMessageDialog(null,out);
	}
    /** calculates the cube of an int
     *@param num the number to be cubed
     *@return the cube, as an int
     */	
	public static int cube (int num){
		int result;
		result = num * num * num;
		return result;
	}
}