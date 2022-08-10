import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Fear implements ActionListener
{
    JFrame jf;
    void ant()
    {
        jf.setSize(300,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea ta=new JTextArea();
        jf.add(ta);
        jf.setLayout(new GridLayout(20,10));
        JPanel jp=new JPanel();
        JButton b1=new JButton("Number 1");
        JButton b2=new JButton("Number 2");
        JButton b3=new JButton("Number 3");
        JButton b4=new JButton("Number 4");
        JButton b5=new JButton("Number 5");
        JButton b6=new JButton("Number 6");
        JButton b7=new JButton("Number 7");
        JButton b8=new JButton("Number 8");
        JButton[] jb={b1,b2,b3,b4,b5,b6,b7,b8};
        for(int i=0;i<jb.length;i++)
        {
            jp.add(jb[i]);
            jf.add(jp);
            public  void actionPerformed(ActionEvent e)
            {
                ta.setText(ta.getText().concat("Shayan"));
            }
        
        }
    }
    
}
class Imp
{
    public static void main(String args[])
    {
        Fear f=new Fear();
        f.ant();
    }
}