import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ComplexGrid extends Canvas
{
  Image offImage;
  Graphics offGraphics;

  int xscale, yscale, leftx, lefty, rightx, righty;

  int xnew, ynew;
  int last_x, last_y;
  int last_xnew, last_ynew;

  int function;
  boolean legit;

  final int IDENTITY = 1;
  final int TWO_Z = 2;
  final int SQUARED = 3;
  final int INVERSE = 4;
  final int TIMES_I = 5;
  final int PLUS_I = 6;
  final int INVERSE4 = 7;
  final int INVERSEBAR4 = 8;
  final int BAR = 9;
  final int MINUS = 10;
  final int TIMES_1I = 11;
  final int RE = 12;
  final int IM = 13;
  final int MOD = 14;
  final int X2Y = 15;
  final int EXP = 16;
  final int EXP_INVERSE = 17;

  ComplexGrid()
  {
    function = IDENTITY;
    offImage = null;
    legit = true;
  }

  public void compute(int x, int y)
   {
    float X = ((float)x-leftx)/xscale * 5;
    float Y = (lefty-(float)y)/yscale * 5;
    float Xnew=0, Ynew=0;
    
    legit = true;

    switch (function)
     {
      case IDENTITY:
        Xnew = X; Ynew = Y; break;
      case TWO_Z:
        Xnew = 2*X; Ynew = 2*Y; break;
      case PLUS_I:
        Xnew = X; Ynew = Y+1; break;
      case TIMES_I:
        Xnew = -Y; Ynew = X; break;
      case TIMES_1I:
        Xnew = X-Y; Ynew = X+Y; break;
      case SQUARED:
        Xnew = X*X-Y*Y; Ynew = 2*X*Y; break;
      case INVERSE:
      case INVERSE4:
      case INVERSEBAR4:
      case EXP_INVERSE:        
        float mod = X*X+Y*Y;
        if (mod < 0.01) {legit = false; return;}
        Xnew = X/mod; Ynew = -Y/mod; 
        if (function == INVERSE) break;
        if (function == EXP_INVERSE)
         {
          float Xtemp = Xnew, Ytemp = Ynew;
          Xnew = (float) (Math.exp(Xtemp) * Math.cos(Ytemp)); 
          Ynew = (float) (Math.exp(Xtemp) * Math.sin(Ytemp));
          break;
         }
        Xnew *= 9; Ynew *= 9;
        if (function == INVERSEBAR4) Ynew = -Ynew;
        break;
      case BAR:
        Xnew = X; Ynew = -Y; break;
      case MINUS:
        Xnew = -X; Ynew = -Y; break;
      case RE:
        Xnew = X; Ynew = 0; break;
      case IM:
        Xnew = Y; Ynew = 0; break;
      case MOD:
        Xnew = (float) Math.sqrt(X*X + Y*Y); Ynew = 0; break;
      case X2Y:
        Xnew = X; Ynew = 2*Y; break;
      case EXP:
        Xnew = (float) (Math.exp(X) * Math.cos(Y));
        Ynew = (float) (Math.exp(X) * Math.sin(Y));
        break;
     }

    xnew = rightx + (int)(Xnew * xscale / 5);
    ynew = righty - (int) (Ynew * yscale / 5);
   }

  public void doGrid(Graphics g, int x, int y, int xscale, int yscale)
   {
    g.setColor(Color.black);
    g.drawRect(x-xscale, y-yscale, xscale*2, yscale*2);

    g.drawLine(x-xscale, y, x+xscale,y);
    g.drawLine(x,y-yscale,x,y+yscale);

    int i,j;

    for (i = -4; i <= 4; i++)
     {
      g.drawLine(x-3, y+yscale*i/5, x+3, y+yscale*i/5);
      g.drawLine(x+xscale*i/5, y-3, x+xscale*i/5, y+3);
     }

    for (i = -4; i <= 4; i++)
      for (j = -4; j <= 4; j++)
       {
        if (i != 0 && j != 0)
          g.drawRect(x+xscale*i/5,y+yscale*j/5,1,1);
       }
   }

  public void drawArrow(int x, int y, int xn, int yn, Color color)
   {
    Graphics g = this.getGraphics();

    g.setColor(color);
    g.clipRect(x-xscale,y-yscale,xscale*2,yscale*2);
    g.drawLine(x,y,xn,yn);
   }

  public int getFunction()
   {
    return function;
   }

  public boolean inside(int x, int y, int xc, int yc)
   {
    return !(x < xc - xscale || x > xc + xscale ||
             y < yc - yscale || y > yc + yscale);
   }

  public boolean mouseDown(Event e, int x, int y)
   {
    if (!inside(x,y,leftx,lefty))
      return false;

    compute(x,y);
    last_x = x; last_y = y; 
    last_xnew = xnew; last_ynew = ynew;
 
    return true;
   }
 
  public boolean mouseDrag(Event e, int x, int y)
   {
    if (!inside(x,y,leftx,lefty))
      return false;

    compute(x,y);

    Graphics g = offImage.getGraphics();
    g.setColor(Color.red);
    g.drawLine(last_x,last_y,x,y);

    if ((inside(last_xnew,last_ynew,rightx,righty) ||
        inside(xnew,ynew,rightx,righty)) && legit)
     {
      g.clipRect(rightx-xscale, righty-yscale, xscale*2, yscale*2);
      g.drawLine(last_xnew,last_ynew,xnew,ynew);
     }
 
    this.getGraphics().drawImage(offImage,0,0,this);

    drawArrow(leftx, lefty, x, y, Color.blue);
    if (legit)
     drawArrow(rightx, righty, xnew, ynew, Color.blue); 

    last_x = x; last_y = y; 
    last_xnew = xnew; last_ynew = ynew;

    return true;
   }

  public boolean mouseMove(Event e, int x, int y)
   {

    if (!inside(x,y,leftx,lefty))
      return false;


    Graphics g = this.getGraphics();

    g.drawImage(offImage,0,0,this);

    compute(x,y);

    drawArrow(leftx, lefty, x, y, Color.blue);
    if (legit)
     drawArrow(rightx, righty, xnew, ynew, Color.blue); 

    return true;
   }

  public boolean mouseUp(Event e, int x, int y)
   {
    if (!inside(x,y,leftx,lefty))
      return false;

    Graphics g = offImage.getGraphics();
    g.setColor(Color.red);
    g.drawLine(x,y,x,y);

    compute(x,y);
    if (inside(xnew,ynew,rightx,righty) && legit)
     {
      g.drawLine(xnew,ynew,xnew,ynew);
     }
 
    this.getGraphics().drawImage(offImage,0,0,this);

    return true;
   }

  public void paint(Graphics g)
  {
    if (offImage == null) 
     {
      offImage = createImage(size().width, size().height);
      offGraphics = offImage.getGraphics();

      xscale = size().width/4 - 25;
      yscale = size().height/2 - 5;
      lefty = righty = 5 + yscale;
      leftx = 10 + xscale;
      rightx = 20 + 3*xscale;

      if (yscale > xscale) yscale = xscale;
      if (xscale > yscale) xscale = yscale;
    
      doGrid(offGraphics, leftx, lefty, xscale, yscale);
      doGrid(offGraphics, rightx, righty, xscale, yscale);
     }
    g.clipRect(0,0,size().width, size().height);
    g.drawImage(offImage,0,0,this);
  }

  public void setFunction(int function)
   {
    this.function = function;
    offImage.flush();
    offGraphics.dispose();
    offImage = null;
    paint(this.getGraphics());
   }

}
