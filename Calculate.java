import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Mcalc extends JFrame implements ItemListener
{
    Container cn;
    JTextField jf;
    JCheckBox jc1,jc2;
    JRadioButton jr1,jr2;
    List jl;
    void mal()
    {
        cn=this.getContentPane();
        jf=new JTextField("SHAYAN");
        jf.setBounds(20,50,150,40);
        cn.add(jf);
        jc1=new JCheckBox("BOLD");
        jc1.setBounds(20,130,80,30);
        cn.add(jc1);
        jc2=new JCheckBox("ITALIC");
        jc2.setBounds(100,130,80,30);
        cn.add(jc2);
       
        jr1=new JRadioButton("10");
        jr1.setBounds(30,200,50,30);
        cn.add(jr1);
        jr2=new JRadioButton("20");
        jr2.setBounds(90,200,50,30);
        cn.add(jr2);
        
        jl=new List(6,false);
        jl.add("RED");
        jl.add("YELLOW");
        jl.add("GREEN");
        jl.add("BLACK");
        jl.add("BLUE");
        jl.add("PINK");
        jl.setBounds(5,270,100,30);
        cn.add(jl);
        jl.setBackground(Color.LIGHT_GRAY);

        jl.addItemListener(this);
        jr1.addItemListener(this);
        jr2.addItemListener(this);
        jc1.addItemListener(this);
        jc2.addItemListener(this);
        cn.setBackground(Color.GRAY);
        this.setSize(300,400);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void itemStateChanged(ItemEvent e)
    {
        String i=jl.getSelectedItem();
        if(e.getItem()==jc1)
        {
            jf.setFont(new Font("Arial",Font.BOLD,15));
        }
        if(e.getItem()==jc2)
        {
            jf.setFont(new Font("Arial",Font.ITALIC,15));
        }
        if(e.getItem()==jr1)
        {
            jf.setFont(new Font("Arial",Font.CENTER_BASELINE,10));
        }
        if(e.getItem()==jr2)
        {
            jf.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
        }
        if(i=="RED")
        {
            jf.setForeground(Color.RED);
        }
        if(i=="YELLOW")
        {
            jf.setForeground(Color.YELLOW);
        }
        if(i=="GREEN")
        {
            jf.setForeground(Color.GREEN);
        }
        if(i=="BLACK")
        {
            jf.setForeground(Color.BLACK);
        }
        if(i=="BLUE")
        {
            jf.setForeground(Color.BLUE);
        }
        if(i=="PINK")
        {
            jf.setForeground(Color.PINK);
        }

    }

}
public class Calculate
{
    public static void main(String args[])
    {
        Mcalc mc=new Mcalc();
        mc.mal();

    }
}
