package Calculator;
import javax.swing.*;
//import java.util.*;
//import java.util.*;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.image.*;

public class calculator extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField t1,t2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnpoint,btnsum,btnsub,btnmul,btndiv,btn,equal,clear,delete;
    int operator;
    double a=0,b=0,result=0;
   
    calculator (){}
   public calculator(String s) {
	   super(s);
   }
   public void setComponents() {
	   
	   t1 = new JTextField();
	   t2 = new JTextField();
	   btn1 = new JButton("1");
	   btn2 = new JButton("2");
	   btn3 = new JButton("3");
	   btn4 = new JButton("4");
	   btn5 = new JButton("5");
	   btn6 = new JButton("6");
	   btn7 = new JButton("7");
	   btn8 = new JButton("8");
	   btn9 = new JButton("9");
	   btnpoint = new JButton(".");
	   btnsum = new JButton("+");
	   btnsub = new JButton("-");
	   btnmul = new JButton("*");
	   btndiv = new JButton("/");
	   btn = new JButton("0");
	   equal = new JButton("=");
	   delete = new JButton("D");
	   clear = new JButton("Clear");
	   setLayout(null);
	   t1.setBounds(30,30,240,30);
	   t2.setBounds(30,15,240,20);
	   btn1.setBounds(30,70,50,35);
	   btn2.setBounds(90,70,50,35);
	   btn3.setBounds(150,70,50,35);
	   btnsum.setBounds(210,70,50,35);
	   btn4.setBounds(30,125,50,35);
	   btn5.setBounds(90,125,50,35);
	   btn6.setBounds(150,125,50,35);
	   btnsub.setBounds(210,125,50,35);
	   btn7.setBounds(30,180,50,35);
	   btn8.setBounds(90,180,50,35);
	   btn9.setBounds(150,180,50,35);
	   btnmul.setBounds(210,180,50,35);
	   btnpoint.setBounds(30,235,50,35);
	   delete.setBounds(90,235,50,35);
	   btn.setBounds(150,235,50,35);
	   btndiv.setBounds(210,235,50,35);
	   equal.setBounds(30,285,110,35);
	   clear.setBounds(150,285,110,35);
	   t2.setBorder(null);
	   t1.setBorder(null);
	   t1.setEditable(false);
	   t2.setEditable(false);
	   t1.setBackground(Color.white);
	   t2.setBackground(Color.white);
	   btn1.addActionListener(new Handler());
	   btn2.addActionListener(new Handler());
	   btn3.addActionListener(new Handler());
	   btn4.addActionListener(new Handler());
	   btn5.addActionListener(new Handler());
	   btn6.addActionListener(new Handler());
	   btn7.addActionListener(new Handler());
	   btn8.addActionListener(new Handler());
	   btn9.addActionListener(new Handler());
	   btnpoint.addActionListener(new Handler());
	   btn.addActionListener(new Handler());
	   btnsum.addActionListener(new Handler());
	   btndiv.addActionListener(new Handler());
	   btnmul.addActionListener(new Handler());
	   btnsub.addActionListener(new Handler());
	   clear.addActionListener(new Handler());
	   equal.addActionListener(new Handler());
	   delete.addActionListener(new Handler());
	   add(t2);
	   add(btn1);
	   add(btn2);
	   add(btn3);
	   add(btnsum);
	   add(btn4);
	   add(btn5);
	   add(btn6);
	   add(btnsub);
	   add(btn7);
	   add(btn8);
	   add(btn9);
	   add(btnmul);
	   add(equal);
	   add(clear);
	   add(btndiv);
	   add(btn);
	    add(t1);
	    add(btnpoint);
	    add(delete);

   }
   class Handler implements ActionListener {
	   public void actionPerformed(ActionEvent e) {
		   if (e.getSource()==btn1) {
			   t1.setText(t1.getText()+"1");
		   }
		   if (e.getSource()==btn2) {
			   t1.setText(t1.getText()+"2");
		   }
		   if (e.getSource()==btn3) {
			   t1.setText(t1.getText()+"3");
		   }
		   if (e.getSource()==btn4) {
			   t1.setText(t1.getText()+"4");
		   }
		   if (e.getSource()==btn5) {
			   t1.setText(t1.getText()+"5");
		   }
		   if (e.getSource()==btn6) {
			   t1.setText(t1.getText()+"6");
		   }
		   if (e.getSource()==btn7) {
			   t1.setText(t1.getText()+"7");
		   }
		   if (e.getSource()==btn8) {
			   t1.setText(t1.getText()+"8");
		   }
		   if (e.getSource()==btn9) {
			   t1.setText(t1.getText()+"9");
		   }
		   if (e.getSource()==btnpoint) {
			   t1.setText(t1.getText()+".");
		   }
		   if (e.getSource()==btn) {
			   t1.setText(t1.getText()+"0");
		   }
		   if (e.getSource()==btnsum) {
			   t2.setText(t1.getText()+"+");
			
			    a = Double.parseDouble(t1.getText());
			   
			   operator = 1;
			   t1.setText(t1.getText());
			   t1.setText(null);
			  }
		   if (e.getSource()==btndiv) {
			    a = Double.parseDouble(t1.getText());
			    t2.setText(t1.getText()+"/");
			   operator = 2;
			   t1.setText(t1.getText());
			   t1.setText(null);
			  }
		   if (e.getSource()==btnmul) {
			   
			    a = Double.parseDouble(t1.getText());
			    t2.setText(t1.getText()+"*");
			   operator = 3;
			   t1.setText(t1.getText());
			   t1.setText(null);
			    }
		   if (e.getSource()==btnsub) {
			
			   a = Double.parseDouble(t1.getText());
			   t2.setText(t1.getText()+"-");
			   operator = 4;
			 
			   t1.setText(t1.getText());
			   t1.setText(null);
			 }
		   if (e.getSource()==clear) {
			   t1.setText(null);
			   t2.setText(null);
		   }
		   if (e.getSource()==delete) {
			   String s1=t2.getText();
	            t2.setText("");
	            for(int i=0;i<s1.length()-1;i++)
	            t2.setText(t2.getText()+s1.charAt(i));
	            
			   String s=t1.getText();
			   t1.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            t1.setText(t1.getText()+s.charAt(i));
	            
	            
		}
		   
		   if (e.getSource()==equal) {
	
			    b = Double.parseDouble(t1.getText());
			  
			   switch(operator) {
			   case 1:
				   result = a+b;
				   break;
			   case 2:
				   result = a/b;
				   break;
			   case 3:
				   result = a*b;
				   break;
			   case 4:
				   result = a-b;
				   break;
				   default: result = 0;
			   }
			   t1.setText(""+result);
			   t2.setText(""+result);
		   }
		  
	   }
   }
   public static void main(String[] args) {
	   calculator calculator = new calculator("calculator");
	  
	   calculator.setComponents();
	   calculator.setVisible(true);
	   calculator.setSize(300,400);
	  ImageIcon icon = new ImageIcon("C:\\robin\\icon.jpg");
	  calculator.setIconImage(icon.getImage());
	  calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  calculator.setResizable(false);
	   
   }
}
