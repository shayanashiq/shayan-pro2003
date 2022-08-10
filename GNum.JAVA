import java.awt.*;
import javax.swing.*;
 class GNum
 {
    public static void main(String args [])
    {
        JFrame ja=new JFrame();
        Container ci=ja.getContentPane();
        FlowLayout fw=new FlowLayout();
        ci.setLayout(fw);
       // JPanel jp=new JPanel();
        JTextField jf=new JTextField();
        jf.setBounds(100,1000,5000,30);
        ja.add(jf);
        JButton[] jt=new JButton[20];
        for(int i=0;i<jt.length;i++)
        {
            jt[i]=new JButton((i+1)+"");
            ci.add(jt[i]);
        }
        ja.setSize(300,400);
        ja.setVisible(true);
        ja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 }