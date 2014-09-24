import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class mycalander extends JFrame
{
	
	private Container c;
	
	//to store the year,month and the strting day of the week
	private int month,year,day;
	private	boolean leap; //to store if it is a leap year
	
	
	private JLabel lbl_month=new JLabel(""); //to display the month name
	private String[] monthnames= new String[12]; 
	private JLabel[] days; // to display the days
	private JLabel w1,w2,w3,w4,w5,w6,w7; // to display the name of the week
	
		
	private JLabel lbldays[]=new JLabel[42]; //initialize the day lables
	private JPanel p,p1,p2,p3;
	private JTextField t1= new JTextField("Enter Year"); //to get the year
	private JButton b1=new JButton(" Make Calander");  // button to make the calander
	private JButton b2=new JButton("<< Previous");  
	private JButton b3=new JButton("Next >>");
	private JButton b4=new JButton("Clear");
	private ButtonHandeler h;  //to handle the button click event 
	
	private int[] nod=new int[12]; //to store the number of days of the months.
	
	
	public void makeGui()  //to initialize the interface of the calander
	{
		setTitle("My Calander");
		c=getContentPane();	
				
		monthnames[0]="January";
		monthnames[1]="February";
		monthnames[2]="March";
		monthnames[3]="April";
		monthnames[4]="May";
		monthnames[5]="June";
		monthnames[6]="July";
		monthnames[7]="Augest";
		monthnames[8]="September";
		monthnames[9]="October";
		monthnames[10]="November";
		monthnames[11]="December";

		
		p1=new JPanel();
		p=new JPanel();
		p3=new JPanel();
		p1.setLayout(new GridLayout(2,2,5,5));
		p3.setLayout(new GridLayout(1,3,5,5));
		p1.add(t1);
		p1.add(b1);
		p1.add(lbl_month);
		
		c.add(p1,BorderLayout.NORTH);
		
		h=new ButtonHandeler();
		b1.addActionListener(h); // assigning the actionlistener
		b2.addActionListener(h); // assigning the actionlistener
		b3.addActionListener(h); // assigning the actionlistener
		b4.addActionListener(h); // assigning the actionlistener
		
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		Icon ico=new ImageIcon("compose.png");  //for the icon in the make calander button
		b1.setIcon(ico); 
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(7,8,5,5));  //initializing the center panel to hold all the labels
		
	
		w1=new JLabel("SUN");
		w2=new JLabel("MON");
		w3=new JLabel("TUE");
		w4=new JLabel("WED");
		w5=new JLabel("THU");
		w6=new JLabel("FRI");
		w7=new JLabel("SAT");

		// make the text in the center of the lable		
		w1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		w7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		// to make the Sunday and Saturday lables as red
		w1.setForeground(new java.awt.Color(255, 0, 0));
		w7.setForeground(new java.awt.Color(255, 0, 0));
		lbl_month.setForeground(new java.awt.Color(0, 0, 255));  //month lable as blue
		lbl_month.setFont(new java.awt.Font("Tahoma", 1, 14)); //set the font to thoma
				
		p2.add(w1);
		p2.add(w2);
		p2.add(w3);
		p2.add(w4);
		p2.add(w5);
		p2.add(w6);
		p2.add(w7);
		
		
		nod[0]=31;//set the number of days in the months
		nod[1]=28;
		nod[2]=31;
		nod[3]=30;
		nod[4]=31;
		nod[5]=30;
		nod[6]=31;
		nod[7]=31;
		nod[8]=30;
		nod[9]=31;
		nod[10]=30;
		nod[11]=31;
		
			
		int i=0; //initializing all the day lables and make the text to the center of the lable
		for(i=0;i<42;i++)
		{
			lbldays[i]=new JLabel("");
			lbldays[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//center
			p2.add(lbldays[i]); //put them to the pannel
		}
		
		lbldays[0].setForeground(new java.awt.Color(255, 0, 0));//set saturdays and sundays as red
		lbldays[6].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[7].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[13].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[14].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[20].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[21].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[27].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[28].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[34].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[35].setForeground(new java.awt.Color(255, 0, 0));
		lbldays[41].setForeground(new java.awt.Color(255, 0, 0));
			 
		
		
		c.add(p2,BorderLayout.CENTER);
		
		p3.add(b2);
		p3.add(b4);
		p3.add(b3);
		c.add(p3,BorderLayout.SOUTH);
		
		setSize(400,300);
		show();
		
	}
	
	
	public void clear() //to clear all the lables and make the >>,<< buttons as dissabled
	{
		for(int x=0;x<42;x++)
		{
			lbldays[x].setText("");
		}
		lbl_month.setText("");
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		t1.setText("Enter Year");
		
	}
	
	
	
	public void setcal(int y,int m)
	{
		
		GregorianCalendar cal1= new GregorianCalendar(y,m,1);  //creating the calander to the given year and month
  	day=cal1.get(cal1.DAY_OF_WEEK); //get the starting day of the week
		leap=cal1.isLeapYear(year);  //find out whether it is a leap or not
		
		int i,j;
		j=1; // for Calculate the days that have displayed
				 // if it is more than the number of days of the month then stop
		
		
		lbl_month.setText("   " + monthnames[m] + "   " + y); // display the name of the month
		
			for(int x=0;x<42;x++)  //clearing all the lables 
			{
				lbldays[x].setText("");
			}
		
		for(i=0;i<day;i++) // put spaces untill the first day of the week
			{
				lbldays[i].setText(".");
			}
		
		
		if(leap==true && m==1) //for a leap year make the number of days of the month as 29
		{
			for(j=1;j<=29;j++)  // displaying the 
			{
				lbldays[i-1].setText(Integer.toString(j)); // put as (i-1) because when it is leaving from the last 
				i++;																			 // loop it adds a nother one to the i
			}	
		}
		else
		{			
			
			for(j=1;j<=nod[m];j++)
			{
				lbldays[i-1].setText(Integer.toString(j));
				i++;
			}
							
		}
					
	}
	
	
	public static void main(String[] args)
	{
		mycalander n=new mycalander();  // creating an object form the class
		n.makeGui();
		n.setResizable(false); 
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{		
				
				try
				{
					year = Integer.parseInt(t1.getText());
					if(year>=1980 && year <2100)
					{
    				month=0;
						b2.setEnabled(true);
						b3.setEnabled(true);
						b4.setEnabled(true);
						setcal(year,month);			
					}
					else
					{
						JOptionPane.showMessageDialog(mycalander.this,"Year ot of range !!!");
						clear();
					}
				}
				catch(NumberFormatException a)
				{
					JOptionPane.showMessageDialog(mycalander.this,"Cannot enter String for the year !!!");
					clear();
				}
				
			}
			
			if(e.getSource()==b2)
			{
				if(month>0) // if only it has a previos month in the perticular state
				{
					month=month-1;  //when press it as << substract 1 from the global variable month and call setcall again
					setcal(year,month);				
				}
			}
		
		
		  if(e.getSource()==b3)
			{
				if(month<11)  // if only it has a next month in the perticular state
				{
					month=month+1;
					setcal(year,month);				
				}
			}
			
			if(e.getSource()==b4)
			{
				clear();
			}
			
			
		}
	}
	
}
	
