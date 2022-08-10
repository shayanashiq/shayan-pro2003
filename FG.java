import javax.swing.*;
import java.awt.*;
import javax.swing.*;
class FG
{
    public static void main(String args[])
    {
        JFrame hf=new JFrame();
        Container con=hf.getContentPane();
        FlowLayout fl=new FlowLayout();
        con.setLayout(fl);
        JButton[] bt=new JButton[20];
        for(int i=0;i<bt.length;i++)
        {
            bt[i]=new JButton((i+1)+"");
            con.add(bt[i]);
        }
       // con.add(bt);
        hf.setSize(300,400);
        hf.setVisible(true);
        hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

