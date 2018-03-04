package example;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame {
      JPasswordField f1;
      JTextField t1;
      JButton button;
      login(){}
      public login(String s) {
    	  super(s);
      }
      void set() {
    	  f1 = new JPasswordField();
    	  t1 = new JTextField();
    	  button = new JButton("login");
    	
    	  add(f1);
    	  add(t1);
    	  add(button);
    	  
    	  setLayout(null);
    	  f1.setBounds(100, 120, 150, 30);
    	  t1.setBounds(100, 180, 150, 30);
    	  button.setBounds(100, 230, 150, 30);
    	  button.addActionListener(new Handler());
      }
      class Handler implements ActionListener {
    	  public void actionPerformed(ActionEvent e) {
    		   
    	  }
      }
      public static void main(String[] args) {
    	  login login = new login();
    	  login.set();
    	  login.setVisible(true);
    	  login.setSize(500, 500);
    	  login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}
