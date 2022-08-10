import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.MenuBarUI;
class Frm
{
    public static void main(String args[])
    {

       JFrame f=new JFrame();
       Container cn=f.getContentPane();
       BorderLayout fl=new BorderLayout(); 
       cn.setLayout(fl);
        JButton bn=new JButton("Click plz");
        f.add(bn);
       // f.add(BorderLayout.top,fl);
        //f.add(fl);
        f.setSize(100,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}