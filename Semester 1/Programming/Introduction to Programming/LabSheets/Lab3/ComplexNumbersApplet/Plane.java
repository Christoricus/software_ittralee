import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Plane extends Canvas
{
  Image offImage;
  Graphics offGraphics;
  PlaneApp applet;
  final int n = 8; // number of grid spaces

  int xscale, yscale, leftx, lefty;

  public float xpos, ypos;
  public float r, theta;

  Plane(PlaneApp applet)
  {
    offImage = null;
    this.applet = applet;
    xpos = ypos = r = theta = 0;
  }

  public void addR(boolean up)
   {
    if (up) r += 0.5; else r -= 0.5;
    if (r < 0) r = 0;
    xyUpdate(false);
   }

  public void addTheta(boolean up)
   {
    if (up) theta += 0.1; else theta -= 0.1;
    xyUpdate(false);
   }
 
  public void addX(boolean up)
   {
    if (up) xpos += 0.5; else xpos -= 0.5;
    xyUpdate(true);
   }

  public void addY(boolean up)
   {
    if (up) ypos += 0.5; else ypos -= 0.5;
    xyUpdate(true);
   }

  public void doGrid(Graphics g, int x, int y, int xscale, int yscale)
   {
    g.setColor(Color.white);
    g.clearRect(0, 0, size().width, size().height);

    g.setColor(Color.black);
    g.drawRect(x-xscale, y-yscale, xscale*2, yscale*2);

    g.drawLine(x-xscale, y, x+xscale,y);
    g.drawLine(x,y-yscale,x,y+yscale);

    int i,j;

    for (i = 1-n; i < n; i++)
     {
      g.drawLine(x-3, y+yscale*i/n, x+3, y+yscale*i/n);
      g.drawLine(x+xscale*i/n, y-3, x+xscale*i/n, y+3);
     }

    for (i = 1-n; i < n; i++)
      for (j = 1-n; j < n; j++)
       {
        if (i != 0 && j != 0)
          g.drawRect(x+xscale*i/n,y+yscale*j/n,1,1);
       }

    g.setColor(Color.red);
    g.fillOval(x + (int)(xscale*xpos/n)-4, y - (int)(yscale*ypos/n)-4, 8, 8);
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

    xpos = (x - leftx) * n / (float) xscale;
    ypos = (lefty - y) * n / (float) yscale;

    xyUpdate(true);
    
    
    return true;
   }
 
  public void paint(Graphics g)
  {
    if (offImage == null) 
     {
      offImage = createImage(size().width, size().height);
      offGraphics = offImage.getGraphics();

      xscale = size().width/2 - 5;
      yscale = size().height/2 - 5;
      lefty = 5 + yscale;
      leftx = 10 + xscale;

      if (yscale > xscale) yscale = xscale;
      if (xscale > yscale) xscale = yscale;

      offGraphics.clipRect(leftx-xscale, lefty-yscale, 2*xscale+1, 2*yscale+1);
      doGrid(offGraphics, leftx, lefty, xscale, yscale);
     }
    xyUpdate(false);
  }

 public void setR()
  {
   try
    {
     r = Float.valueOf(applet.rText.getText()).floatValue();
    }
   catch (NumberFormatException e)
    { 
     System.out.println("Number format exception!");
     return;
    }
   xyUpdate(false);
  }

 public void setTheta()
  {
   try
    {
     String test = applet.thetaText.getText().replace('p', ' ').replace('i', ' ').trim();  // eliminate pi
     theta = Float.valueOf(test).floatValue();
    }
   catch (NumberFormatException e)
    {
     System.out.println("Number format exception!");
     return;
    }
   xyUpdate(false);
  }

 public void setX()
  {
   try
    {
     xpos = Float.valueOf(applet.xText.getText()).floatValue();
    }
   catch (NumberFormatException e)
    {
     System.out.println("Number format exception!");
     return;
    }
   xyUpdate(true);
  }

 public void setY()
  {
   try
    {
     ypos = Float.valueOf(applet.yText.getText()).floatValue();
    }
   catch (NumberFormatException e)
    {
     System.out.println("Number format exception!");
     return;
    }
   xyUpdate(true);
  }
 
 public void xyUpdate(boolean cartesian)
// cartesian is true if the cartesian co-ordinates have been changed
  {

    if (cartesian)
     {
      r = (float) Math.sqrt(xpos * xpos + ypos * ypos);
      if (r < 0.01)
        theta = 0;
      else
       {
        if (xpos*xpos > ypos*ypos)
         {
          theta = (float) (Math.atan(ypos/xpos) / Math.PI);
          if (xpos < 0 && ypos > 0) theta += 1.0;
          if (xpos < 0 && ypos < 0) theta -= 1.0;
         }
        else
         {
          theta = (float) 0.5 - (float) (Math.atan(xpos/ypos) / Math.PI);
          if (ypos < 0) theta -= 1.0;
         }
       }
     }
    else
     {
      xpos = r * (float)Math.cos(theta * Math.PI);
      ypos = r * (float)Math.sin(theta * Math.PI);
     }

    doGrid(offGraphics, leftx, lefty, xscale, yscale);
    getGraphics().drawImage(offImage,0,0,this);

    applet.xText.setText(String.valueOf(xpos));
    applet.yText.setText(String.valueOf(ypos));
    applet.rText.setText(String.valueOf(r));
    applet.thetaText.setText(String.valueOf(theta) + " pi");

    String buffer = new String();

    buffer = "z = ";
    buffer += String.valueOf(xpos);
    buffer += (ypos < 0) ? " " : " + ";
    buffer += String.valueOf(ypos);
    buffer += "i = ";
    buffer += String.valueOf(r);
    buffer += " exp(";
    buffer += String.valueOf(theta);
    buffer += " pi i)";
    applet.outText.setText(buffer);
    
  }
}
