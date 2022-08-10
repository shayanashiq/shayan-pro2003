import java.awt.*;    
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;    
public class MyGridLayout{    
JFrame f; 
JPanel jl;  
JLabel kb; 
MyGridLayout(){    
    f=new JFrame();  
    jl=new JPanel();
    Container cn=f.getContentPane();
    cn.setBackground(Color.GREEN);
    f.setBackground(Color.RED);
    JTextArea jt=new JTextArea(); 
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
    
     // adding buttons to the frame 
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
}    
public static void main(String[] args) {    
    new MyGridLayout();    
}    
}    