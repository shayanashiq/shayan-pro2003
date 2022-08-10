import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class  Kan extends JFrame implements ActionListener 
{
    JPanel jp;
    JTextArea ta;
    JButton jb;
    Container cn;
    void Mill()
    {
        cn=this.getContentPane();
        jp=new JPanel();
        jp.setBounds(50,50,100,40);
        cn.add(jp);
        ta=new JTextArea(" ");
        ta.setBounds(50,70,1000,50);
        jp.add(ta);
        jb=new JButton("Hello");
        jb.setBounds(80,100,80,40);
        jb.addActionListener(this);
        cn.add(jb);
        cn.setLayout(new GridLayout());
        this.setLayout(null);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        ta.setText("Pakistan");
        cn.setBackground(Color.GREEN);
        ta.setBackground(Color.YELLOW);
        jp.setBackground(Color.WHITE);
    }
}
class KanA
{
    public static void main(String args[])
    {
        Kan kn=new Kan();
        kn.Mill();
    }
}