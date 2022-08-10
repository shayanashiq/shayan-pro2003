import java.awt.*;
import javax.swing.*;
class DemoGUI
{
    public static void main(String args[])
    {
        JFrame frm=new JFrame();
        Container co=frm.getContentPane();
        //FlowLayout fq=new FlowLayout();
        //co.setLayout(fq);
        JButton bo=new JButton();
        co.add(bo);
        JMenuBar mb=new JMenuBar();
        frm.add(mb);
        JMenu mn=new JMenu("File");
        JMenu mnm=new JMenu("Debbug");
        mb.add(mn);
        mb.add(mnm);
        JMenuItem mi=new JMenuItem();
        mn.add("save");
        JMenuItem mii=new JMenuItem();
        mn.add("Save as");
        JMenuItem min=new JMenuItem();
        mn.add("New File");
        JMenuItem mni=new JMenuItem();
        mnm.add("Compile");
        JMenuItem ma=new JMenuItem();
        mnm.add("Run");
        JPanel pn=new JPanel();
        JLabel lb=new JLabel("Enter text:");
        pn.add(lb);
        JTextField jt=new JTextField(20);
        pn.add(jt);
        JButton jb=new JButton("Send");
        pn.add(jb);
        JButton bt=new JButton("Restart");
        pn.add(bt);
        JTextArea te=new JTextArea();
        frm.add(BorderLayout.SOUTH,pn);
        frm.add(BorderLayout.CENTER,te);
        frm.add(BorderLayout.NORTH,mb);
        frm.setSize(300,400);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 