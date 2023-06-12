import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame 
{ 
    JPDemo jp;
	FDemo()
	{
		jp=new JPDemo();
		add(jp);
	}
}

class JPDemo extends JPanel implements ActionListener,KeyListener
{
	ImageIcon img1,img2,img3;
	Image dot,head,food;
	int x[]=new int[100];
	int y[]=new int[100];
	int dots=4,s=0;
      boolean	start=false,over=false;
	boolean right=false, left=false,  up=false,  down=false;
	int r1=0,r2=0;
	
	JPDemo()
	{
		setBackground(Color.CYAN);	
		
		img1=new ImageIcon("dot.png");
		dot=img1.getImage();

		img2=new ImageIcon("head.png");
		head=img2.getImage();

		img3=new ImageIcon("food.png");
		food=img3.getImage();
		
		x[0]=150;
		x[1]=125;
		x[2]=100;
		x[3]=75;
		x[4]=50;
		
		y[0]=100;
		y[1]=100;
		y[2]=100;
		y[3]=100;
		y[4]=100;
		
		Timer t=new Timer(150,this);
		t.start();
		addKeyListener(this);
		setFocusable(true);
		random();
	}
	
	void random(){
		r1=(int)Math.round(Math.random()*20+1);
		r1=r1*25;
       	r2=(int)Math.round(Math.random()*20+1);
		r2=r2*25;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(food,r1,r2,this);
        Font f=new Font("",Font.ITALIC,100);
        g.setFont(f);	
	    for(int i=dots ;i>=0; i--){
     	if(i==0)
			g.drawImage(head,x[i],y[i],this);	
	    else  
			g.drawImage(dot,x[i],y[i],this);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(r1==x[0]&&r2==y[0]){dots++; s=s+5; random();  }
		for(int j=dots; j>0 ;j--)
		{
			if(x[0]==x[j]&&y[0]==y[j])
			{
				start=false;
			}
		}		
		if(start){
		for(int i=dots ; i>0 ;i--)
		{
			x[i]=x[i-1];
			y[i]=y[i-1];
		}
		if(right)x[0]+=25;
		if(left)x[0]-=25;
		if(up)y[0]-=25;
		if(down)y[0]+=25;
		
		}
	    repaint();
	}
	
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e)
	{
		start=true;
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
	     right=true; 
	     left=false;  
		 up=false; down=false;
		}		
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			right=false; 
			left=true;  
			up=false; 
			down=false;
		}		
        if(e.getKeyCode()==KeyEvent.VK_UP)
		{right=false; left=false;  up=true; down=false;}		
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{right=false; left=false;  up=false; down=true;}		
		
		
	}
	public void keyTyped(KeyEvent e){}
	
	
	
}

class snake1
{
public static void main(String ali[])
{
       FDemo f=new FDemo();
	   f.setVisible(true);
	   f.setSize(1200,700);
	   f.setLocation(50,20);
	   //f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}
}