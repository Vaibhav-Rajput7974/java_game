import java.awt.*;
import java.awt.event.*;
class red extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	Button rest;
	Label lo2=new Label("");
	Label lo=new Label("");
	
	int i=0;
	int pl=0;
	int pl2=0;
	red()
	{
		
		
	    rest=new Button("Play Again");
		rest.setSize(300,120);
		rest.setLocation(250,500);
		add(rest);
		rest.addActionListener(this);
		
		Font fn=new Font("Arial Black",Font.BOLD,40);
		setFont(fn);
		setTitle("color changing page");
		setLayout(null);
	int x=100;
		int k=0;
	int y=100;
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
			{
				b[k]=new Button();
				 b[k].setLabel(null);
				b[k].setLocation(x,y);
			    b[k].setSize(100,100);
			    add(b[k]);
				b[k].addActionListener(this);
			    k++;
                x=x+100;
			}
			x=100;
			y+=100;
		}
		
		setBackground(Color.yellow);
	
	}
	public void actionPerformed(ActionEvent g)
	{
		if(g.getSource()==rest)
		{
			for(int i=0;i<9;i++)
			{
		     b[i].setLabel(null);

			 b[i].addActionListener(this);
			}
			 lo.setText("");
			 lo2.setText("");
			 
		}
			 
			for(int k=0;k<9;k++)
			{
		 if(g.getSource()==b[k])
		{
		i++;
		if(i%2==0)
		{
	b[k].setLabel("0");
			
		}
		else
		{
			b[k].setLabel("x");
		
		
		}
		b[k].removeActionListener(this);
		}
		}
		
		 if( 
	( b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")
	||
    (b[3].getLabel()=="x" && b[4].getLabel()=="x" && b[5].getLabel()=="x")
	||
	(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")
	||
	(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")
	||
	(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")
	||
	(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")
	||
    (b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")
    ||
    (b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x")
	)
		{
		lo.setText("PLAYER ONE WIN");
		lo.setSize(500,100);
		lo.setLocation(600,130);

		add(lo);		
		}
			else if(
(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
||
(b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
||
(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
		{
		lo2.setText("PLAYER TWO WIN");
		lo2.setSize(500,100);
		lo2.setLocation(600,230);
		add(lo2);
		}
		
	}
	
}
class tick
{
	public static void main(String ar[])
	{
		red r=new red();
		r.setVisible(true);
		r.setSize(1200,1200);
		r.setLocation(100,100);
	}
}