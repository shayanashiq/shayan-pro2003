import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ClearJTextArea extends JFrame
{    
  public ClearJTextArea()
  {
    super("Clear the contents of a JTextArea");
    JButton clearButton = new JButton("Clear");
    clearButton.setBounds(150,310,100,40);
    JTextArea text = new JTextArea();
    text.setBounds(10,10,365,290);
    add(clearButton);
    add(text);
    
    // This code is called when the Clear button is clicked.
    clearButton.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           text.setText("");
       }
    });
    
    setLayout(null);
    setLocationRelativeTo(null);
    setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
    
  public static void main(String[] args){
    new ClearJTextArea();
  }
}