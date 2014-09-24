/**
 * @(#)FormattingOutput.java
 *
 *
 * @author 
 * @version 1.00 2013/9/26
 */

public class FormattingOutput {
        
    public static void main(String[] args) {
        // TODO code application logic here
        String module1Name = "Mathematics", module2Name = "Introduction to Programming", 
        	module3Name = "Web Design";
        	
        int module1Students = 64, module2Students = 84, module3Students = 62;
        float module1Mark = 72.031f, module2Mark = 61.845f, module3Mark = 72.774f;
        
        String formatString = String.format("%-35s%-10d%.1f\n%-35s%-10d%.1f\n%-35s%-10d%.1f",module1Name,module1Students,module1Mark,module2Name,module2Students,module2Mark,module3Name,module3Students,module3Mark);
        
        System.out.println("Module Name                    #Studetns   Average Mark\n" + formatString);
        
    }
}
