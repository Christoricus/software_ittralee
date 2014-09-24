import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Complex extends Object
 {
  public float x, y;
  public boolean infinite;

  Complex()
   {
    this.x = this.y = 0;
    infinite = false;
   }

  Complex(boolean infinite)
   {
    this.x = this.y = 0;
    this.infinite = infinite;
   }

  Complex(float x)
   {
    this.x = x; this.y = 0;
    infinite = false;
   }

  Complex(float x, float y)
   {
    this.x = x; this.y = y;
    infinite = false;
   }

  Complex(double x, double y)
   {
    this((float) x, (float) y);
   }

  public Complex plus(Complex z)
   {
    if (infinite || z.infinite) return new Complex(true);
    return new Complex(x + z.x, y + z.y);
   }

  public Complex plus(float a)
   {
    if (infinite) return new Complex(true);
    return new Complex(x + a, y);
   }

  public Complex minus()
   {
    if (infinite) return new Complex(true);
    return new Complex(-x,-y);
   }

  public Complex minus(Complex z)
   {
    if (infinite || z.infinite) return new Complex(true);
    return new Complex(x - z.x, y - z.y);
   }

  public Complex times(Complex z)
   {
    if (infinite || z.infinite) return new Complex(true);
    return new Complex(x*z.x - y*z.y, x*z.y + y*z.x);
   }

  public Complex times(float k)
   {
    if (infinite) return new Complex(true);
    return new Complex(x*k, y*k);
   }

  public boolean equals(Complex z)
   {
    if (infinite && z.infinite) return true;
    if (infinite || z.infinite) return false;

    if ( (x-z.x)*(x-z.x) + (y-z.y)*(y-z.y) > 0.001) return false;
    return true;
   }

  public float norm()
   {
    return x*x + y*y;
   }

  public float abs()
   {
    return (float) Math.sqrt(x*x + y*y);
   }

  public static float dist(Complex z1, Complex z2)
   {
    return z1.minus(z2).abs();
   }

  public Complex phase()
   {
    float a = abs();
    if (a < 0.01) return new Complex(true);
    return new Complex(x/a,y/a);
   }

  public Complex bar()
   {
    return new Complex(x, -y);
   }

  public Complex inverse()
   {
    float n = norm();

    if (infinite) return new Complex(0,0);

    if (n < 0.01) return new Complex(true);

    return new Complex(x/n, -y/n);
   }

  public float Arg()
   {
    float r = abs();
    float theta;

    if (infinite) return 0;    
    if (r < 0.0001) return 0;
    
    if (x*x > y*y)
     {
      theta = (float) Math.atan(y/x);
      if (x < 0)
       {
        if (y >= 0) theta += (float) Math.PI;
        else        theta -= (float) Math.PI;
       }
     }
    else
     {
      theta = (float) (0.5 * Math.PI - Math.atan(x/y));
      if (y < 0) theta -= (float) Math.PI;
     }

    return theta;
   }

  public float Arg(float a)
   {
    float theta = Arg();
    float pi2 = 2*(float) Math.PI;

    if (infinite) return 0;

    while (theta <= a) theta += pi2;
    while (theta > a + pi2) theta -= pi2;

    return theta;
   }

  public Complex Log()
   {
    return new Complex((float) Math.log(abs()), Arg());
   }

  public Complex Log(float a)
   {
    return new Complex((float) Math.log(abs()), Arg(a));
   }

  public Complex exp()
   {
    return new Complex((float)(Math.exp(x)*Math.cos(y)),
                       (float)(Math.exp(x)*Math.sin(y)));
   }

  public Complex over(Complex z)
   {
    return times(z.inverse());
   }

  public String toString()
   {
    return toString(false);
   }

  public String toString(boolean signed)
   {
    String string = new String();

    if (signed)
     {
      if (x > 0.001) { string += "+ "; string += String.valueOf(x); }
      if (x < -0.001) { string += "- "; string += String.valueOf(-x); }
     } 
    else if (Math.abs(x) > 0.001)
      string += String.valueOf(x);
    else if (Math.abs(y) < 0.001)
     {
      string += "0";
      return string;
     }
    
    if (y > 0.001)
     {
      if (Math.abs(x) > 0.001) string += " + ";
      else if (signed) string += "+ ";
      string += String.valueOf(y);
      string += "i";
      return string;
     }
    if (y < -0.001)
     {
      if (Math.abs(x) > 0.001) 
       {
        string += " - ";
        string += String.valueOf(-y);
       }
      else if (signed)
       {
        string += "- ";
        string += String.valueOf(-y);
       }
      else string += String.valueOf(y);

      string += "i";
      return string;
     }  
    return string;
   }
 }
