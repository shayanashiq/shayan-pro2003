import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GridView extends JFrame implements ActionListener
{

    JLabel jl;
    String s;
    JTextField jf;
    JTextArea ta;
    JLabel jls;
   Container c;
    JButton jb;
    JButton rs;
    JPanel jp;

    public void render()
    {
        c=this.getContentPane();
        jls= new JLabel("Table");
        jls.setBounds(130,20,80,30);
        jls.setForeground(Color.BLACK);
       // jls.setFont(Font.BOLD);
        c.add(jls);
        jl=new JLabel("Enter the num :");
        jl.setBounds(10,60,100,30);
        c.add(jl);
        jf=new JTextField();
        jf.setBounds(110,60,110,30);
        c.add(jf);
        jb=new JButton("Click");
        jb.setBounds(80,100,70,40);
        this.add(jb);

        jb.addActionListener(this);

        jp=new JPanel();
        jp.setBackground(Color.YELLOW);
        jp.setBounds(100,150,250,250);
        c.add(jp);

        ta=new JTextArea();
        ta.setBounds(100,150,250,25);
        ta.setBackground(Color.YELLOW);
        jp.add(ta);
        //c.setBackground(Color.GRAY);

       // c=this.getContentPane();
        //c.add(jp);

       rs=new JButton("Reset");
        rs.setBounds(200,100,70,40);
        c.add(rs);
        rs.addActionListener(this);

        c.setBackground(Color.GRAY);
        
        this.setSize(400,450);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
        public  void actionPerformed(ActionEvent e)
        {
            int x=Integer.parseInt(jf.getText());
            if(e.getSource()==jb)
            {
               for(int i=0;i<=10;i++)
               {
                ta.setText(ta.getText().concat(x+"*"+i+"="+x*i));
                ta.setText(ta.getText().concat("\n"));
               }
               c.setBackground(Color.LIGHT_GRAY);

            }

            if(e.getSource()==rs)
            {
                jf.setText("");
                ta.setText(" ");
                c.setBackground(Color.GRAY);
               // ta.setText(ta.getText().concat(" "));
            }
        }
        
    
}
public class GridNew
{
    public static void main(String args[])
    {
        GridView gv=new GridView();
        gv.render();
    }
}