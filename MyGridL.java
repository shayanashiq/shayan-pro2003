import java.awt.*;    
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute; 
import java.awt.event.*;   
public class MyGridL implements ActionListener {    
JFrame f; 
JPanel jl;  
JLabel kb; 
JTextArea jt;
   MyGridLayout(){
    f=new JFrame();  
    jl=new JPanel();
    Container cn=f.getContentPane();
    cn.setBackground(Color.GREEN);
    f.setBackground(Color.RED);
    jt=new JTextArea(); 
    jt.setBackground(Color.PINK);
    jl.setBackground(Color.YELLOW); 
    JButton b1=new JButton("1");    
    JButton b2=new JButton("2");    
    JButton b3=new JButton("3");    
    JButton b4=new JButton("4");    
    JButton b5=new JButton("5");    
    JButton b6=new JButton("6");    
    JButton b7=new JButton("7");    
    JButton b8=new JButton("8");    
    JButton b9=new JButton("9");    
    JButton b0=new JButton("0");
    JButton ba=new JButton("+");
    JButton bm=new JButton("-");
    JButton bmu=new JButton("*");
    JButton bdv=new JButton("/");
    JButton btd=new JButton(".");
    JButton be=new JButton("="); 
    JButton bt[]={b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bm,bmu,bdv,btd,be};
    for(int i=0;i<bt.length;i++){
    jt.add(bt[i]);
    }

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    ba.addActionListener(this);
    bm.addActionListener(this);
    bmu.addActionListener(this);
    bdv.addActionListener(this);
    btd.addActionListener(this);
    be.addActionListener(this);
     // adding buttons to the frame 
     b1.setText(b1.getText().concat("1"));
     jt.setBounds(10,50,200,20);  
     f.add(jt);    
    jl.add(b1); jl.add(b2); jl.add(b3);  
    jl.add(b4); jl.add(b5); jl.add(b6);  
    jl.add(b7); jl.add(b8); jl.add(b9); 
    jl.add(b0); jl.add(ba); jl.add(bm);
    jl.add(bmu); jl.add(bdv); jl.add(btd);
    jl.add(be);   
  
    // setting grid layout of 3 rows and 3 columns    
    jl.setLayout(new GridLayout(4,4));  
    f.add(jl);  
    f.add(BorderLayout.SOUTH,jl);
    f.setSize(300,400);    
    f.setVisible(true);  
    
     public void actionPerformed(ActionEvent e)
        {
         if(e.getSource()==b1)
            {
               
                jt.add(b1);
            }

        }
    }
    public static void main (String args[])
    {
        MyGridL ng=new MyGridL();
        new MyGridLayout();
    }
}
