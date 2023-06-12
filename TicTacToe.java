import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class TicTac extends Frame implements ActionListener{
    static Button b1,b2,b3,b4,b5,b6,b7,b8,b9,Reset;			// globle
    static int n=-1;
    static Label l1,l2,l3;
    Scanner sc = new Scanner(System.in);
    String s1,s2;

    TicTac(){
		
		
		
        System.out.println("Name of player 1 :");
        s1 = sc.next();
        System.out.println("Name of player 2 :");
        s2 = sc.next();

        setTitle("Tic-tac-Toe");
        setLayout(null);

        Color c2 = new Color(59, 91, 96);
        setBackground(c2);
        Color r = new Color(185, 40, 40);

        Font f = new Font("Arial",Font.BOLD,30);
        Reset = new Button("Reset");
        Reset.setLocation(420,300);
        Reset.setSize(100,50);
        Reset.setBackground(r);
        Reset.setForeground(Color.WHITE);
        Reset.setFont(f);
        add(Reset);
        Reset.addActionListener(this);


        Color c = new Color(255, 255, 255);

        b1 = new Button();
        b1.setSize(100,100);
        b1.setLocation(100,200);
        b1.setBackground(c);
        add(b1);
        b1.addActionListener(this);

        b2 = new Button();
        b2.setSize(100,100);
        b2.setLocation(200,200);
        b2.setBackground(c);
        add(b2);
        b2.addActionListener(this);

        b3 = new Button();
        b3.setSize(100,100);
        b3.setLocation(300,200);
        b3.setBackground(c);
        add(b3);
        b3.addActionListener(this);

        b4 = new Button();
        b4.setSize(100,100);
        b4.setLocation(100,300);
        b4.setBackground(c);
        add(b4);
        b4.addActionListener(this);

        b5 = new Button();
        b5.setSize(100,100);
        b5.setLocation(200,300);
        b5.setBackground(c);
        add(b5);
        b5.addActionListener(this);

        b6 = new Button();
        b6.setSize(100,100);
        b6.setLocation(300,300);
        b6.setBackground(c);
        add(b6);
        b6.addActionListener(this);

        b7 = new Button();
        b7.setSize(100,100);
        b7.setLocation(100,400);
        b7.setBackground(c);
        add(b7);
        b7.addActionListener(this);

        b8 = new Button();
        b8.setSize(100,100);
        b8.setLocation(200,400);
        b8.setBackground(c);
        add(b8);
        b8.addActionListener(this);

        b9 = new Button();
        b9.setSize(100,100);
        b9.setLocation(300,400);
        b9.setBackground(c);
        add(b9);
        b9.addActionListener(this);



        b1.setLabel(null);
        b2.setLabel(null);
        b3.setLabel(null);
        b4.setLabel(null);
        b5.setLabel(null);
        b6.setLabel(null);
        b7.setLabel(null);
        b8.setLabel(null);
        b9.setLabel(null);


    }

    public void actionPerformed(ActionEvent e){
        Font f = new Font("Arial",Font.BOLD,50);
        setFont(f);

        n++;

        if(e.getSource() == Reset){
            reset();
            return;
        }

        if(n > 9|| isWon())
            return;

        if(e.getSource() == b1) {
            if(n%2 == 0)
                b1.setLabel("0");
            else
                b1.setLabel("X");
        }
        if(e.getSource() == b2)
        {
            if(n%2 == 0)
                b2.setLabel("0");
            else
                b2.setLabel("X");
        }
        if(e.getSource() == b3) {
            if(n%2 == 0)
                b3.setLabel("0");
            else
                b3.setLabel("X");
        }
        if(e.getSource() == b4) {
            if(n%2 == 0)
                b4.setLabel("0");
            else
                b4.setLabel("X");
        }
        if(e.getSource() == b5) {
            if(n%2 == 0)
                b5.setLabel("0");
            else
                b5.setLabel("X");
        }
        if(e.getSource() == b6) {
            if(n%2 == 0)
                b6.setLabel("0");
            else
                b6.setLabel("X");
        }
        if(e.getSource() == b7){
            if(n%2 == 0)
                b7.setLabel("0");
            else
                b7.setLabel("X");
        }
        if(e.getSource() ==b8) {
            if(n%2 == 0)
                b8.setLabel("0");
            else
                b8.setLabel("X");
        }
        if(e.getSource() == b9) {
            if(n%2 == 0)
                b9.setLabel("0");
            else
                b9.setLabel("X");
        }



        if(n>=4){                       //  Atleast 5 moves are needed to win for any player
            if(isWon())
            {
                Font f1 = new Font("Algerian",Font.BOLD,30);
                setForeground(Color.ORANGE);
                String winner;
                if(n%2==0)
                    winner = s1;
                else
                    winner = s2;

                l1 = new Label("-: Congratulation :- ");
                l1.setLocation(110,520);
                l1.setSize(500,40);
                l1.setFont(f1);
                add(l1);

                l2 = new Label(""+winner);
                l2.setLocation(180,570);
                l2.setSize(500,40);
                l2.setFont(f1);
                add(l2);

                l3 = new Label("You won the match !");
                l3.setLocation(110,620);
                l3.setSize(500,40);
                l3.setFont(f1);
                add(l3);

            }

        }
    }


    public static void reset()
    {
        b1.setLabel(null);
        b2.setLabel(null);
        b3.setLabel(null);
        b4.setLabel(null);
        b5.setLabel(null);
        b6.setLabel(null);
        b7.setLabel(null);
        b8.setLabel(null);
        b9.setLabel(null);

        if(l1!=null)
            l1.setVisible(false);
        if(l2!=null)
            l2.setVisible(false);
        if(l3!=null)
            l3.setVisible(false);
        n=0;
    }

    public boolean isWon(){                        //  check winning
        if((b1.getLabel()!=null && b2.getLabel()!=null && b3.getLabel() != null) && (b1.getLabel() == b2.getLabel() && b2.getLabel() == b3.getLabel()))
            return true;
        if((b4.getLabel()!=null && b5.getLabel()!=null && b6.getLabel() != null) && (b4.getLabel() == b5.getLabel() && b5.getLabel() == b6.getLabel()))
            return true;
        if((b7.getLabel()!=null && b8.getLabel()!=null && b9.getLabel() != null) && (b7.getLabel() == b8.getLabel() && b8.getLabel() == b9.getLabel()))
            return true;

        if((b1.getLabel()!=null && b4.getLabel()!=null && b7.getLabel() != null) && (b1.getLabel() == b4.getLabel() && b4.getLabel() == b7.getLabel()))
            return true;
        if((b2.getLabel()!=null && b5.getLabel()!=null && b8.getLabel() != null) && (b2.getLabel()== b5.getLabel() && b5.getLabel() == b8.getLabel()))
            return true;
        if((b3.getLabel()!=null && b6.getLabel()!=null && b9.getLabel() != null) && (b3.getLabel() == b6.getLabel() && b6.getLabel() == b9.getLabel()))
            return true;

        if((b1.getLabel()!=null && b5.getLabel()!=null && b9.getLabel() != null) && (b1.getLabel() == b5.getLabel() && b5.getLabel() == b9.getLabel()))
            return true;
        if((b3.getLabel()!=null && b5.getLabel()!=null && b7.getLabel() != null) && (b3.getLabel() == b5.getLabel()&& b5.getLabel() == b7.getLabel()))
            return true;

        return false;
    }

    public void paint(Graphics g){

        g.setColor(Color.ORANGE);
        g.drawLine(10,98,550,98);
        g.drawLine(10,96,550,96);
        g.drawLine(10,94,550,94);

        Font f1 = new Font("Algerian",Font.BOLD,30);
        g.setFont(f1);
        Color c = new Color(255, 255, 255);
        g.setColor(c);
        g.drawString("Tic-Tac-Toe",160,80);

        Font f2 = new Font("Serif",Font.BOLD,20);
        g.setFont(f2);

        Color c1 = new Color(255, 255, 255);
        g.setColor(c1);
        g.drawString("Player 1 : ",60,130);
        g.drawString("Player 2 : ",60,170);

        Font f3 = new Font("Serif",Font.BOLD,30);
        g.setFont(f3);
        Color c2 = new Color(255, 226, 4);
        g.setColor(c2);
        g.drawString(""+s1,160,130);
        g.drawString(""+s2,160,170);
    }

}

public class TicTacToe{
    public static void main(String ar[]){
        TicTac f = new TicTac();
        f.setVisible(true);
        f.setSize(550,700);
        f.setLocation(800,20);

    }
}