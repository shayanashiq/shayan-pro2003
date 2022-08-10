import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

class Gray
{
    JFrame fe;
    JPanel gp;
   // Checkbox cb;
    JButton b=new JButton();
    public void GridLayoutT()
    {
       // cb=new Checkbox("JAVA");
        fe=new JFrame();
       // fe.add(cb);
        fe.setBackground(Color.GRAY);
        fe.setLayout(new GridLayout(10,20));
        fe.setSize(300,400);
        fe.setVisible(true);
        fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp=new JPanel();
        JButton[] b=new JButton[10];
        for(int i=0;i<b.length;i++)
        {
            jp.add(b[i]);
        }
        fe.add(jp);
    }
    public static void main(String args[])
    {
        Gray g=new Gray();
        g.GridLayoutT();
    }
}