import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.*;
class Cal extends JFrame implements ActionListener
{
    private Container cr;
    private JLabel l1,l2;
    private JTextField f1,f2;
    JButton ba,bs,bm,bd,re;
    private JLabel Result;
    
    void hsb()
    {
        
        cr=this.getContentPane();
        cr.setLayout(null);
        l1=new JLabel("1st value :");
        l1.setBounds(10,50,100,30);
        cr.add(l1);
        l2=new JLabel("2st value :");
        l2.setBounds(10,100,100,30);
        cr.add(l2);
        f1=new JTextField();
        f1.setBounds(80,50,100,30);
        cr.add(f1);
        f2=new JTextField();
        f2.setBounds(80,100,100,30);
        cr.add(f2);
        ba=new JButton("+");
        ba.setBounds(30,150,50,40);
        cr.add(ba);
        bs=new JButton("-");
        bs.setBounds(100,150,50,40);
        cr.add(bs);
        bm=new JButton("X");
        bm.setBounds(170,150,50,40);
        cr.add(bm);
        bd=new JButton("/");
        bd.setBounds(240,150,50,40);
        cr.add(bd);
        
    

        re=new JButton("C");
        re.setBounds(30,200,50,40);
        cr.add(re);

        Result=new JLabel();
        Result.setBounds(20,250,100,30);
        cr.add(Result);

        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        re.addActionListener(this);

        this.setBackground(Color.RED);
        cr.setBackground(Color.LIGHT_GRAY);

        this.setVisible(true);
        this.setSize(350,400);
        this.setLayout(null);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ba)
        {
            int a=Integer.parseInt(f1.getText());
            int b=Integer.parseInt(f2.getText());
            int c=a+b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
        }
        if(e.getSource()==bs)
        {
            int a=Integer.parseInt(f1.getText());
            int b=Integer.parseInt(f2.getText());
            int c=a-b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
        }
        if(e.getSource()==bm)
        {
            int a=Integer.parseInt(f1.getText());
            int b=Integer.parseInt(f2.getText());
            int c=a*b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
        }
        if(e.getSource()==bd)
        {
            double a=Double.parseDouble(f1.getText());
            double b=Double.parseDouble(f2.getText());
            double c=a/b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
        }

        if(e.getSource()==re)
        {
            f1.setText("");
            f2.setText("");
           cr.setBackground(Color.LIGHT_GRAY);
        }

    }
    
}
class RescolCal
{
    public static void main(String args[])
    {
        Cal ca=new Cal();
        ca.hsb();
    }
}