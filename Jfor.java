import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.StyledEditorKit.BoldAction;
class Jfor
{
    public static void main(String args[])
    {
        JFrame fr=new JFrame();
        Container cn=fr.getContentPane();
        cn.setLayout(null);
       // cn.setBackground(Color.black);
        fr.setBounds(100,100,500,200);
        JPasswordField jp=new JPasswordField();
        jp.setBounds(100,50,120,30);
        cn.add(jp);
       // fr.add(cn);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}