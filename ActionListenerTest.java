//package com.javapointers.javase;
 import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
 
public class ActionListenerTest implements ActionListener {
 
    JButton button;
    JButton button2;
    JButton b3;
    JFrame frame;
    JTextArea textArea;
    Container ci;
    JPanel jp1;
    JPanel jp2;

    public ActionListenerTest() {
        button = new JButton("Click Me");
     //   button.setBounds(10,50,70,30);
        button2 =new JButton("Click here");
       // button2.setBounds(15,50,70,30);
        frame = new JFrame("ActionListener Test");

        b3=new JButton("Reset");
        b3.addActionListener(this);
        b3.setBounds(20,50,70,30);

        textArea = new JTextArea(5, 40);
        ci=frame.getContentPane();
        button.addActionListener(this);
        button2.addActionListener(this);
        textArea.setLineWrap(true);
        jp1=new JPanel();
        jp2=new JPanel();
        jp1.setBounds(10,50,100,30);
        jp2.setBounds(15,100,100,30);
        jp1.add(button);
        jp2.add(button2);
        frame.add(jp1,jp2);

        //frame.setLayout(new BorderLayout());
        frame.add(textArea, BorderLayout.NORTH);
       // jp1.add(button, BorderLayout.CENTER);
       // jp2.add(button2,BorderLayout.SOUTH);
      //  frame.add(jp1);
       // frame.add(jp2);
      //  frame.setLayout(new GridLayout(3,3));
        frame.setBounds(10,200,500,500);
        frame.pack();
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
   // @Override
    public void actionPerformed(ActionEvent e) {
        frame.setBackground(Color.RED);
        ci.setBackground(Color.BLUE);
        textArea.setText(textArea.getText().concat("You have clicked the button"));

        if(e.getSource()==b3)
        {
            frame.setBackground(Color.WHITE);
            ci.setBackground(Color.WHITE);

        }
    }
 
    public static void main(String args[]) {
        ActionListenerTest test = new ActionListenerTest();
    }
}
