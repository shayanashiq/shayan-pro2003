import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.Caret;
class Table implements ActionListener
{
    JFrame jf=new JFrame();
    JTextField jt;
    JPanel jpn;
    Container ct;
    String r;
    JButton ju;
    //JLabel jl;
    public void tex()
    {
        ju=new JButton("Click");
        jt=new JTextField(10);
        jpn=new JPanel();
        jt.setBounds(50,20,50,30);
        jf.add(jt);
       // Container cn=jf.getContentPane();
        jf.setLayout(null);
        jpn.setBounds(50,80,200,200);
        jpn.setOpaque(true);
        jf.add(jpn);
        jpn.setBackground(Color.YELLOW);
        //setLayout(null);
        //Container cn=jf.getContentPane();
        
        //jl=new JLabel("TABLE");
        ju.addActionListener(jf);
        //jf.add(jl);
        jf.setSize(300,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
        public void caretUpdate(CaretEvent ce)
        {
            String s=jt.getText();
            if(!s.equals(""))
            {
                int num=Integer.parseInt(s);
                JLabel la[]=new JLabel[num];
                for(int i=0;i<=la.length;i++)
                {
                    la[i]=new JLabel("hye"+i);
                    jpn.add(la[i]); 
                }
            }
            jpn.validate();
            jpn.repaint();
        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==ju){
            int r=Integer.parseInt(jt.getText());
            for(int i=0;i<=10;i++)
            {
                jt.setText(jt.getText().concat(r+"*"+i+"="+r*i));
            }
        }
        }
        
    public static void main(String args[])
    {
        Table tb=new Table();
        tb.tex();
    }
}