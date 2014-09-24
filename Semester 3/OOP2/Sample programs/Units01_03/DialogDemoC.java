import javax.swing.*; 
import java.awt.*;  // needed for Color and Font
/** demonstrates using a JTextarea within a JScrollPane within a message Dialog
 also a Color and a Font object, and an ImageIcon */
public class DialogDemoC {
   public static void main( String args[] )
   {
  	// Colors can be mixed giving r,g,b values in that order, from 0 to 255
   	Color c1 = new Color(100,40,40);  // dark red
   	Color c2 = new Color(200,190,10); // horrible mustard colour
   	// Fonts can have a font name, a style (BOLD, ITALIC, PLAIN) and a size
   	Font bigFont = new Font("SansSerif",Font.BOLD,24);
   	
    JTextArea output = new JTextArea();
    output.setForeground(c1);
    output.setBackground(c2);
    output.setFont(bigFont);
   	   
    output.append("Greetings, all mortals\n");
    output.append("Now you can have full colour");	

   JOptionPane.showMessageDialog(null,output);
   output.setText("And a customised title");
   JOptionPane.showMessageDialog(null,output,"Here's the title",JOptionPane.WARNING_MESSAGE);
   
   // icons can be constructed from any gif or jpg file, in the same folder nb not too big
   output.setText("Or even an icon: you'll need T17.gif for this");
   ImageIcon duke = new ImageIcon("T17.gif");
   JOptionPane.showMessageDialog(null,output,"If you don't see the icon, look for T17.gif",JOptionPane.PLAIN_MESSAGE,
                                              duke);
    
   }
}

