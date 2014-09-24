import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import Plane;

public class PlaneApp extends Applet
 {
  Plane plane;
  public TextField xText, yText, rText, thetaText;
  public TextField outText;
  Button xDec, xInc, yDec, yInc, rDec, rInc, thetaDec, thetaInc;
  Button zero, plus1, plus2i, x2, bar, square, minus, half;
  Button real, im, imi, mod, iz, inverse, i32, exp;

   public boolean action(Event evt, Object what)
    {
     if (evt.target==xText) 
      {
       plane.setX();
       return true;
      }
     if (evt.target==yText) 
      {
       plane.setY();
       return true;
      }
     if (evt.target==rText) 
      {
       plane.setR();
       return true;
      }
     if (evt.target==thetaText) 
      {
       plane.setTheta();
       return true;
      }
     if (evt.target==xDec || evt.target==xInc)
      {
       plane.addX(evt.target == xInc);
       return true;
      }
     if (evt.target==yDec || evt.target==yInc)
      {
       plane.addY(evt.target == yInc);
       return true;
      }
     if (evt.target==rDec || evt.target==rInc)
      {
       plane.addR(evt.target == rInc);
       return true;
      }
     if (evt.target==thetaDec || evt.target==thetaInc)
      {
       plane.addTheta(evt.target == thetaInc);
       return true;
      }
     if (evt.target==zero)
      {
       plane.xpos = 0; plane.ypos = 0;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==i32)
      {
       plane.xpos = 3; plane.ypos = 2;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==plus1)
      {
       plane.xpos++;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==plus2i)
      {
       plane.xpos += 2; plane.ypos -= 1;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==x2)
      {
       plane.xpos *= 2; plane.ypos *= 2;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==half)
      {
       plane.xpos /= 2; plane.ypos /= 2;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==minus)
      {
       plane.xpos *= -1; plane.ypos *= -1;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==bar)
      {
       plane.ypos *= -1;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==exp)
      { 
       plane.r = (float) Math.exp(plane.xpos);
       plane.theta = plane.ypos;
       plane.xyUpdate(false);
       return true;
      }
     if (evt.target==iz)
      { 
       float x = plane.xpos;
       float y = plane.ypos;

       plane.xpos = -y;
       plane.ypos = x;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==square)
      { 
       float x = plane.xpos;
       float y = plane.ypos;

       plane.xpos = x*x - y*y;
       plane.ypos = 2*x*y;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==real)
      {
       plane.ypos = 0;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==im)
      { 
       plane.xpos = plane.ypos;
       plane.ypos = 0;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==imi)
      { 
       plane.xpos = 0;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==mod)
      { 
       plane.xpos = (float) Math.sqrt(plane.xpos * plane.xpos + plane.ypos * plane.ypos);
       plane.ypos = 0;
       plane.xyUpdate(true);
       return true;
      }
     if (evt.target==inverse)
      {
       if (plane.r <= 0.01) return false;
       plane.xpos /= plane.r * plane.r;
       plane.ypos /= -plane.r * plane.r;
       plane.xyUpdate(true);
       return true;
      }
     return false;
    }

  public void init()
   {
    setLayout(new BorderLayout(15,15));
    add("North", UpperPanel());
    add("Center", plane = new Plane(this));
    add("South", LowerPanel());
   }

  Panel LowerPanel()
   {
    Panel controls = new Panel();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    Label end;
   
    c.gridwidth = GridBagConstraints.REMAINDER;
 
    controls.setLayout(gridbag);
    controls.add(new Label("x="));
    controls.add(xDec = new Button("<"));
    controls.add(xText = new TextField(11));
    controls.add(xInc = new Button(">"));
    controls.add(new Label("  y="));
    controls.add(yDec = new Button("<"));
    controls.add(yText = new TextField(11));
    controls.add(yInc = new Button(">"));
    controls.add(end = new Label(" [Cartesian co-ordinates]"));
    gridbag.setConstraints(end, c);

    controls.add(new Label("r="));
    controls.add(rDec = new Button("<"));
    controls.add(rText = new TextField(11));
    controls.add(rInc = new Button(">"));
    controls.add(new Label("  theta="));
    controls.add(thetaDec = new Button("<"));
    controls.add(thetaText = new TextField(11));
    controls.add(thetaInc = new Button(">"));
    controls.add(end = new Label(" [Polar co-ordinates]"));
    gridbag.setConstraints(end, c);

    controls.add(outText = new TextField(60));
    outText.setEditable(false);
    gridbag.setConstraints(outText, c);
    return controls;
   }

  Panel UpperPanel()
   {
    Panel controls = new Panel();

    controls.add(zero = new Button("0"));
    controls.add(i32 = new Button("3+2i"));
    controls.add(plus1 = new Button("z+1"));
    controls.add(plus2i = new Button("z+2-i"));
    controls.add(x2 = new Button("2z"));
    controls.add(minus = new Button("-z"));
    controls.add(half = new Button("z/2"));
    controls.add(iz = new Button("iz"));
    controls.add(bar = new Button("z-bar"));
    controls.add(square = new Button("z^2"));
    controls.add(real = new Button("Re(z)"));
    controls.add(im = new Button("Im(z)"));
    controls.add(imi = new Button("Im(z) i"));
    controls.add(mod = new Button("|z|"));
    controls.add(inverse = new Button("1/z"));
    controls.add(exp = new Button("exp(z)"));
    return controls;
   }
 
 }
