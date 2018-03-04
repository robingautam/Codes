import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class swing extends JFrame {
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b;
    public swing() {}
    public swing(String s) {
    	super(s);
    }
    public void setComponent() {
    	l1 = new JLabel("enter the first number");
    	l2 = new JLabel("enter the second number");
    	l3 = new JLabel();
    	t1 = new JTextField();
    	t2 = new JTextField();
    	b = new JButton("sum");
    	setLayout(null);
    	l1.setBounds(70, 70, 170, 20);
    	l2.setBounds(70, 120, 170, 20);
    	t1.setBounds(250, 70, 130, 20);
    	t2.setBounds(250, 120, 130, 20);
    	l3.setBounds(70, 200, 150, 20);
    	b.setBounds(100,150,80,30);
    	b.addActionListener(new Handler());
    	add(l1);
    	add(l2);
    	add(t1);
    	add(t2);
    	add(l3);
    	add(b);
    	
    }
    class Handler implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		int a = Integer.parseInt(t1.getText());
    		int b = Integer.parseInt(t2.getText());
    		int s = a+b;
    		l3.setText("sum of two number is "+s);
    	}
    	
    }
    
    public static void main(String[] args) {
       swing jf = new swing("sum of the numbers");
       jf.setComponent();
       jf.setVisible(true);
       jf.setSize(400,400);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
