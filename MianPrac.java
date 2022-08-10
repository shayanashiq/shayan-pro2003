import java.awt.*;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

//import apple.laf.JRSUIState.TitleBarHeightState;

import java.awt.event.*;

class Head extends JFrame implements ActionListener
{
   // Container co;
    JButton jn;
    JButton jn1;
    JButton jn2;
    Container ce;
    void gel()
    {
       this.setSize(550,450);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ce=this.getContentPane();
       jn=new JButton("RED");
       jn1=new JButton("GREEN");
       jn2=new JButton("YELLOW");
       jn.setBounds(100,100,100,50);
       jn1.setBounds(250,100,100,50);
       jn2.setBounds(400,100,100,50);
       jn.addActionListener(this);
       jn1.addActionListener(this);
       jn2.addActionListener(this);
       ce.add(jn);
       ce.add(jn1);
       ce.add(jn2);
       this.setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jn)
        {
            ce.setBackground(Color.RED);
        }
        if(e.getSource()==jn1)
        {
            ce.setBackground(Color.GREEN);
        }
        if(e.getSource()==jn2)
        {
            ce.setBackground(Color.YELLOW);
        }
        
    }
}
class MianPrac
{
    public static void main(String args[])
    {
        Head he=new Head();
        he.gel();
    }
}