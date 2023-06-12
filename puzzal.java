import java.awt.*;
import java.awt.event.*;

class Fdemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
    Label la1,la;
	Button rest;
	Fdemo()
	{
		setTitle("PUZZAL GAME ");
		Font f=new Font("Arial Black",Font.BOLD,40);
		setFont(f);
		setLayout(null);
		int x=200,y=300;
		
		rest=new Button("Play Again");
		
		rest.setSize(200,60);
		rest.setLocation(250,600);
		add(rest);
		rest.addActionListener(this);
		
		la1=new Label("Arrange All Numbers");
		la1.setSize(450,80);
		la1.setLocation(100,50);
		la1.setLocation(100,50);
		add(la1); 
		for(int i=0;i<9;i++)
		{
			b[i]=new Button();
			b[i].setSize(100,100);
			b[i].setLocation(x,y);
			b[i].addActionListener(this);
			add(b[i]);
			x+=100;
			if(i==2)
			{
				y+=100;
				x=200;
			}	
			if(i==5)
			{	
				y+=100;
				x=200;
			}	
		}
		
		
		b[0].setLabel("1");
		b[1].setLabel("3");
		b[2].setLabel("5");
		b[3].setLabel("4");
		b[4].setLabel("6");
		b[5].setLabel("");
		b[6].setLabel("7");
		b[7].setLabel("2");
		b[8].setLabel("8");
		
	setBackground(Color.yellow);	
		
	}
	public void actionPerformed(ActionEvent e)
	{
		//0
		if(e.getSource()==b[0]&&(  b[1].getLabel()=="" || b[3].getLabel()=="" ) )
		{
			if(b[1].getLabel()=="")
			{
				String sl=b[0].getLabel();
				b[0].setLabel(b[1].getLabel());
				
				b[1].setLabel(sl);
			}
			else if(b[3].getLabel()=="")
			{
				String sl=b[0].getLabel();
				b[0].setLabel(b[3].getLabel());
				
				b[3].setLabel(sl);
			}
		}
		
		
		//1
		else if(e.getSource()==b[1]&&  (b[2].getLabel()=="" || b[4].getLabel()=="" ||b[0].getLabel()==""  ))
		{
			if(b[2].getLabel()=="")
			{
				String sl=b[1].getLabel();
				b[1].setLabel(b[2].getLabel());
				
				b[2].setLabel(sl);
			}
			else if(b[4].getLabel()=="")
			{
				String sl=b[1].getLabel();
				b[1].setLabel(b[4].getLabel());
				
				b[4].setLabel(sl);
			}
			 else if(b[0].getLabel()=="")
			{
				String sl=b[1].getLabel();
				b[1].setLabel(b[0].getLabel());
				
				b[0].setLabel(sl);
			}
			
		}
		
		
		//2
		else if(e.getSource()==b[2]&&  (b[1].getLabel()=="" || b[5].getLabel()=="")  )
		{
			if(b[1].getLabel()=="")
			{
				String sl=b[2].getLabel();
				b[2].setLabel(b[1].getLabel());
				
				b[1].setLabel(sl);
			}
			else if(b[5].getLabel()=="")
			{
				String sl=b[2].getLabel();
				b[2].setLabel(b[5].getLabel());
				
				b[5].setLabel(sl);
			}
		}
		
		//3
		else if(e.getSource()==b[3]&&  (b[0].getLabel()=="" || b[4].getLabel()=="" || b[6].getLabel()=="" ))
		{
			if(b[0].getLabel()=="")
			{
				String sl=b[3].getLabel();
				b[3].setLabel(b[0].getLabel());
				
				b[0].setLabel(sl);
			}
			else if(b[4].getLabel()=="")
			{
				String sl=b[3].getLabel();
				b[3].setLabel(b[4].getLabel());
				
				b[4].setLabel(sl);
			}
			else if(b[6].getLabel()=="")
			{
				String sl=b[3].getLabel();
				b[3].setLabel(b[6].getLabel());
				
				b[6].setLabel(sl);
			}
		}
		//4
		else if(e.getSource()==b[4]&&  (b[1].getLabel()=="" || b[5].getLabel()=="" || b[3].getLabel()=="" ||b[7].getLabel()==""))
		{
			if(b[1].getLabel()=="")
			{
				String sl=b[4].getLabel();
				b[4].setLabel(b[1].getLabel());
				
				b[1].setLabel(sl);
			}
			else if(b[5].getLabel()=="")
			{
				String sl=b[4].getLabel();
				b[4].setLabel(b[5].getLabel());
				
				b[5].setLabel(sl);
			}
			else if(b[3].getLabel()=="")
			{
				String sl=b[4].getLabel();
				b[4].setLabel(b[3].getLabel());
				
				b[3].setLabel(sl);
			}
			else if(b[7].getLabel()=="")
			{
				String sl=b[4].getLabel();
				b[4].setLabel(b[7].getLabel());
				
				b[7].setLabel(sl);
			}
		}
		//5
		 
	   else if(e.getSource()==b[5]&&  (b[4].getLabel()=="" || b[2].getLabel()=="" || b[8].getLabel()==""))
		{
			if(b[4].getLabel()=="")
			{
				String sl=b[5].getLabel();
				b[5].setLabel(b[4].getLabel());
				
				b[4].setLabel(sl);
			}
			else if(b[2].getLabel()=="")
			{
				String sl=b[5].getLabel();
				b[5].setLabel(b[2].getLabel());
				
				b[2].setLabel(sl);
			}
			else if(b[8].getLabel()=="")
			{
				String sl=b[5].getLabel();
				b[5].setLabel(b[8].getLabel());
				
				b[8].setLabel(sl);
			}
		}
		//6
		 if(e.getSource()==b[6]&& ( b[3].getLabel()=="" || b[7].getLabel()==""))
		{
			if(b[3].getLabel()=="")
			{
				String sl=b[6].getLabel();
				b[6].setLabel(b[3].getLabel());
				
				b[3].setLabel(sl);
			}
			else if(b[7].getLabel()=="")
			{
				String sl=b[6].getLabel();
				b[6].setLabel(b[7].getLabel());
				
				b[7].setLabel(sl);
			}
			
		}
		
		//7
		 else if(e.getSource()==b[7]&& ( b[4].getLabel()=="" || b[8].getLabel()=="" || b[6].getLabel()==""))
		{
			if(b[4].getLabel()=="")
			{
				String sl=b[7].getLabel();
				b[7].setLabel(b[4].getLabel());
				
				b[4].setLabel(sl);
			}
			else if(b[8].getLabel()=="")
			{
				String sl=b[7].getLabel();
				b[7].setLabel(b[8].getLabel());
				
				b[8].setLabel(sl);
			}
			else if(b[6].getLabel()=="")
			{
				String sl=b[7].getLabel();
				b[7].setLabel(b[6].getLabel());
				
				b[6].setLabel(sl);
			}
		}
	   //8
		else if(e.getSource()==b[8]&& ( b[5].getLabel()=="" || b[7].getLabel()==""))
		{
			if(b[5].getLabel()=="")
			{
				String sl=b[8].getLabel();
				b[8].setLabel(b[5].getLabel());
				
				b[5].setLabel(sl);
			}
			else if(b[7].getLabel()=="")
			{
				String sl=b[8].getLabel();
				b[8].setLabel(b[7].getLabel());
				
				b[7].setLabel(sl);
			}
		}
		
		//rest
		else if(e.getSource()==rest)
		{
			la.setText("");
			
			b[0].setLabel("1");
		b[1].setLabel("2");
		b[2].setLabel("3");
		b[3].setLabel("4");
		b[4].setLabel("");
		b[5].setLabel("3");
		b[6].setLabel("7");
		b[7].setLabel("6");
		b[8].setLabel("5");
		}
	   if(b[0].getLabel()=="1"&&b[1].getLabel()=="2"&&b[2].getLabel()=="3"&&b[3].getLabel()=="4"&&b[4].getLabel()=="5"&&b[5].getLabel()=="6"&&b[6].getLabel()=="7"&&b[7].getLabel()=="8"
	   )
	   {
		  la=new Label();
		   la.setText("You Won The Game");
		  la.setSize(500,50);
		   
		 la.setLocation(100,200);
		   add(la);
		   for(int m=1;m<=10;m++);
		   {
		   for(int i=0;i<8;i++)
		   {
            int a[i]=Math.round(Math.random()*10);
			int a[i+1]=Math.round(Math.random()*10);
			if(a!=b)break;
		   }
	   }
			
		b[0].setLabel("1");
		b[1].setLabel("2");
		b[2].setLabel("3");
		b[3].setLabel("4");
		b[4].setLabel("5");
		b[5].setLabel("6");
		b[6].setLabel("7");
		b[7].setLabel("8");
		b[8].setLabel("9");
	   }
		
		
	}
}
class puzzal
{
	public static void main(String ar[])
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(700,700);
		f.setLocation(300,10);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
				}
		});
	}
}