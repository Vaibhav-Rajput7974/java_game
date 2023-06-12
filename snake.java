import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame 
{
	FDemo fp;
	Demo()
	{
		fp=new FDemo();
		add(fp);
	}
}
class FDemo extends JPanel implements ActionListener,KeyListener
{
	ImageIcon img1,img2,img3;
	Image head,body,food;
	int x[]=new int[100];
	int y[]=new int[100];
	int dots=5;
	
	FDemo()
	{
		x[0]=160;
		y[0]=80;
		
		x[1]=120;
		y[1]=80;
		
		x[2]=80;
		y[2]=80;
		
		x[3]=40;
		y[3]=80;
		
		img1=new ImageIcon("dot.png");
	}
}
class snake
{
	public static void main(String ar[])
	{
		Demo f=new Demo();
		
	}
}