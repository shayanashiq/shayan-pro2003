import java.awt.*;
import javax.swing.*;
class MainP
{
    public static void main(String args [])
    {
        JFrame rf=new JFrame();
        rf.setBounds(100,100,1000,500);
        rf.setVisible(true);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setTitle("Business");
        //ImageIcon ii=new ImageIcon("sh.png");
        //rf.setIconImage(ii.getImage());
        Container c=rf.getContentPane();
        c.setLayout(null);
        //JLabel lj=new JLabel("Username:");
        ImageIcon ii=new ImageIcon("sh.png");
        JLabel lj=new JLabel("Text",ii,JLabel.RIGHT);
        lj.setBounds(50,10,ii.getIconWidth(),ii.getIconHeight());
        lj.setBounds(0,100,400,200);
        c.add(lj);
    }
}
