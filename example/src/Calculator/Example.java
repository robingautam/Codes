package Calculator;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class Example extends JFrame {
      JPasswordField p1;
      JTextField t1;
      Example(){
    	  
      }
      public Example (String s) {
    	  super(s);
      }
     public void setComponents() {
    	 t1 = new JTextField();
    	 p1 = new JPasswordField();
    	 t1.setBounds(180, 200, 300, 60);
    	 p1.setBounds(180, 300, 300, 60);
    	 add(p1);
    	 add(t1);
    	 
      }
     class Handler implements ActionListener{
    	 public void actionPerformed(ActionEvent e) {
    		
    	 }
     }
      public static void main(String[] args) {
    	  Example frame = new Example("Gender");
    	  frame.setComponents();
    	  frame.setVisible(true);
    	  frame.setSize(800,800);
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}
