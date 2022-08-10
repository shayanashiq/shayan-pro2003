import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.*;
class Cal extends JFrame implements ActionListener
{
    private Container cr;
    private JLabel l1,l2;
    private JTextField f1,f2;
    JButton ba,bs,bm,bd;
    private JLabel Result;
    void hsb()
    {
        cr=this.getContentPane();
        cr.setLayout(null);
        cr.setBackground(Color.LIGHT_GRAY);
        l1=new JLabel("First Number :");
        l1.setBounds(10,20,100,30);
        cr.add(l1);
        l2=new JLabel("Sec Number :");
        l2.setBounds(10,50,100,30);
        cr.add(l2);
        f1=new JTextField();
        f1.setBounds(100,20,100,25);
        cr.add(f1);

        f1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        f2=new JTextField();
        f2.setBounds(100,50,100,25);
        f2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setSize(300,300);
        cr.add(f2);
        ba=new JButton("+");
        ba.setBounds(20,100,50,40);
        cr.add(ba);
        ba.setBorder(BorderFactory.createLineBorder(Color.black));

        bs=new JButton("-");
        bs.setBounds(80,100,50,40);
        cr.add(bs);
        bs.setBorder(BorderFactory.createLineBorder(Color.black));
        
        bm=new JButton("*");
        bm.setBounds(140,100,50,40);
        cr.add(bm);
        bm.setBorder(BorderFactory.createLineBorder(Color.black));

        bd=new JButton("/");
        bd.setBounds(200,100,50,40);
        cr.add(bd);
        bd.setBorder(BorderFactory.createLineBorder(Color.black));

        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);

        Result=new JLabel();
        Result.setBounds(20,150,70,20);
        cr.add(Result);
        //Result.addActionListener(this);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
       // ba,bs,bm,bd
        /**if(e.getSource()==ba){
            cr.setBackground(Color.YELLOW);
        }

        if(e.getSource()==bs){
            cr.setBackground(Color.BLUE);
        }
        if(e.getSource()==bm){
            cr.setBackground(Color.PINK);
        }
        if(e.getSource()==bd){
            cr.setBackground(Color.GREEN);
        }**/


        if(e.getSource()==ba){
            int a=Integer.parseInt(f1.getText());
            int b=Integer.parseInt(f2.getText());
            int c=a+b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
            this.setBackground(Color.RED);
        }

        if(e.getSource()==bs){
            Double a=Double.parseDouble(f1.getText());
            Double b=Double.parseDouble(f2.getText());
            Double c=a-b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
            this.setBackground(Color.RED);
        }

        if(e.getSource()==bm){
            Double a=Double.parseDouble(f1.getText());
            Double b=Double.parseDouble(f2.getText());
            Double c=a*b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
            this.setBackground(Color.RED);
        }

        if(e.getSource()==bd){
            Double a=Double.parseDouble(f1.getText());
            Double b=Double.parseDouble(f2.getText());
            Double c=a/b;
            Result.setText("Result :"+c);
            cr.setBackground(Color.PINK);
            this.setBackground(Color.RED);
        }

    }
}
class SimpCal
{
    public static void main(String args[])
    {
        Cal ca=new Cal();
        ca.hsb();
    }
}