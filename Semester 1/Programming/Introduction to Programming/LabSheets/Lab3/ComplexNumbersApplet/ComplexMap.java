import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import ComplexGrid;

public class ComplexMap extends Applet
 {
  ComplexGrid grid;
  Choice functionChoice;
  Button clearButton;


   public boolean action(Event evt, Object what)
    {
     if (evt.target==functionChoice) 
      {
       String functionString = functionChoice.getSelectedItem();

       if (functionString.equals("z")) grid.setFunction(grid.IDENTITY);
       if (functionString.equals("2z")) grid.setFunction(grid.TWO_Z);
       if (functionString.equals("z^2")) grid.setFunction(grid.SQUARED);
       if (functionString.equals("1/z")) grid.setFunction(grid.INVERSE);
       if (functionString.equals("iz")) grid.setFunction(grid.TIMES_I);
       if (functionString.equals("(1+i)z")) grid.setFunction(grid.TIMES_1I);
       if (functionString.equals("z+i")) grid.setFunction(grid.PLUS_I);
       if (functionString.equals("9/z")) grid.setFunction(grid.INVERSE4);
       if (functionString.equals("9/zbar")) grid.setFunction(grid.INVERSEBAR4);
       if (functionString.equals("zbar")) grid.setFunction(grid.BAR);
       if (functionString.equals("-z")) grid.setFunction(grid.MINUS);
       if (functionString.equals("Re(z)")) grid.setFunction(grid.RE);
       if (functionString.equals("Im(z)")) grid.setFunction(grid.IM);
       if (functionString.equals("|z|")) grid.setFunction(grid.MOD);
       if (functionString.equals("x+2iy")) grid.setFunction(grid.X2Y);
       if (functionString.equals("exp(z)")) grid.setFunction(grid.EXP);

       return true;
      }

     if (evt.target==clearButton) grid.setFunction(grid.getFunction());

     return false;
    }

  public void init()
   {
    setLayout(new BorderLayout(15,15));
    add("North", UpperPanel());
    add("Center", grid = new ComplexGrid());
   }

  Panel UpperPanel()
   {
    Panel controls = new Panel();

    controls.add(new Label("f(z) = "));
    controls.add(functionChoice = new Choice());
    functionChoice.addItem("z");
    functionChoice.addItem("z+i");
    functionChoice.addItem("2z");
    functionChoice.addItem("-z");
    functionChoice.addItem("iz");
    functionChoice.addItem("(1+i)z");
    functionChoice.addItem("z^2");
    functionChoice.addItem("1/z");
    functionChoice.addItem("Re(z)");
//    functionChoice.addItem("Im(z)");
//    functionChoice.addItem("|z|");
    functionChoice.addItem("x+2iy");
    functionChoice.addItem("zbar");
    functionChoice.addItem("9/zbar");
    functionChoice.addItem("exp(z)");

    controls.add(clearButton = new Button("Clear"));

    return controls;
   }
 }
