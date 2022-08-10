import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Hag extends JFrame implements ActionListener
{
    Container ct;
    JLabel jl1,jl2;
    JTextField jf;
    JPasswordField jp;
    JButton jb;
    void cet()
    {
        ct=this.getContentPane();
        jl1=new JLabel("UserName");
        jl1.setBounds(10,50,100,20);
        ct.add(jl1);
        jl2=new JLabel("Password");
        jl2.setBounds(10,100,100,20);
        ct.add(jl2);
        jf=new JTextField();
        jf.setBounds(100,50,150,30);
        ct.add(jf);
        jp=new JPasswordField();
        jp.setBounds(100,100,150,30);
        ct.add(jp);
        jb=new JButton("LogIn");
        jb.setBounds(50,150,100,40);
        ct.add(jb);
        this.setSize(350,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        this.setBackground(Color.RED);
        ct.setBackground(Color.GRAY);
        System.out.println("UserName:"+jf.getText());
        System.out.println("Password:"+jp.getText());
    }

}
class sag
{
    public static void main(String args[])
    {
        Hag hg=new Hag();
        hg.cet();
    }
}