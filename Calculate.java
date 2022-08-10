import java.awt.*;
import javax.swing.JTextField;
//import javax.smartcardio.CommandAPDU;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.event.*;
class Cal
{
   
        JFrame frm=new JFrame();
        JPanel jp=new JPanel();
        JPanel jp1 = new JPanel();
        JTextArea ta=new JTextArea(2,10);
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton b0=new JButton("0");
        
        JButton ba=new JButton("+");
        JButton bs=new JButton("-");
        JButton bm=new JButton("*");
        JButton bd=new JButton("/");
        JButton bc=new JButton("C");
        JButton bdo=new JButton(".");
        JButton be=new JButton("=");

       

        JButton[] buttons = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,bc,bdo,be};
        
        double num1,num2,res;
        int addc=0,mulc=0,divc=0,subc=0;

        public void Calculat()
        {
            frm.setSize(340,450);
            //frm.setVisible(true);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setTitle("Shayan");
            frm.setResizable(false);
            frm.add(jp);
            jp.setBackground(Color.gray);
            Border bo=BorderFactory.createLineBorder(Color.RED);
            jp.add(ta);
            ta.setBackground(Color.BLACK);
            Border tb=BorderFactory.createLineBorder(Color.RED);
            ta.setBorder(tb);
            Font ft=new Font("arial",Font.BOLD,33);
            ta.setFont(ft);
            ta.setForeground(Color.WHITE);
            ta.setPreferredSize(new Dimension(2, 10));
            ta.setLineWrap(true);
            
           // b1.addActionListener((ActionListener) this);
            //b1.setBounds(50,10,9,3);  
            //frm.add(b1);

            //jp.add(b1);
            for (int i = 0; i < buttons.length; i++) {
                jp.add(buttons[i]);
              //  b[i].addActionListener((ActionListener) this);
            }
            //frm.add(jp1);


            frm.setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
            ta.setText(ta.getText());
        }
    
}
class Calculate
{
    public static void main(String args[])
    {
        Cal ca=new Cal();
        ca.Calculat();
        public void actionCommand(ActionListener e)
        {
        if(ta==b1)
        {
            
        }
    }
}