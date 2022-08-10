import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.*;
class MainGui implements ItemListener
{
    JLabel lbl;
    List lst;
    void maygui()
    {
        JFrame frm=new JFrame();
        Container con=frm.getContentPane();
        con.setLayout(new GridLayout(2,1,0,10));
       // JPanel pn=new JPanel();
        JMenuBar mn=new JMenuBar();
        JMenu jm=new JMenu("File");
        mn.add(jm);
        JMenuItem ji=new JMenuItem("New filw");
        JMenuItem mi=new JMenuItem("Save");
        jm.add(ji);
        jm.add(mi);
       
        lbl=new JLabel("CS dept NFC ***");
        lst=new List(3,false);
        
        Font fnt=new Font("Respect your future",Font.BOLD,15);
        lst.add("Red");
        lst.add("Green");
        lst.add("Yellow");
        lst.add("Orange");
        lst.addItemListener(this);
        lst.setBackground(Color.GRAY);
        con.add(lbl);
        con.add(lst);
       // frm.setBorder(Color.RED);
      // lbl.add(mn);
        frm.setSize(300,400);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String args[])
        {
            MainGui g=new MainGui();
            g.maygui();
        }
        public void itemStateChanged(ItemEvent e)
        {
            String it=lst.getSelectedItem();
            if(it =="Red")
            {
                lbl.setForeground(Color.RED);
            }
            else if(it=="Green")
            {
                lbl.setForeground(Color.GREEN);
            }
            else if(it=="Yellow")
            {
                lbl.setForeground(Color.YELLOW);
            }
            else if(it=="Orange")
            {
                lbl.setForeground(Color.ORANGE);
            }
            int i=lst.getSelectedIndex();
            lbl.setText("Index:"+i+" "+it);
        }
}