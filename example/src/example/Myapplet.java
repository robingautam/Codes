package example;
import java.awt.*;
import java.awt.event.ActionListener;
import java.applet.*;
import java.awt.event.*;
/*<applet code="my applet" width="700" height="300"></applet>*/

public class Myapplet extends Applet{
  Label l1,l2,l3;
  TextField t1,t2;
  Button B;
  public void init() {
	  l1= new Label("enter the first number");
	  l2 = new Label("enter the second number");
	  t1 = new TextField();
	  t2 = new TextField();
	  B = new Button("sum");
	  l3 = new Label();
	  setLayout(null);
	  l1.setBounds(30,50,120,20);
	  l2.setBounds(30,100,140,20);
	  t1.setBounds(180,50,100,20);
	  t2.setBounds(180,100,100,20);
	  B.setBounds(100,150,80,20);
	  l3.setBounds(100,200,150,30);
	  add(l1);
	  add(l2);
	  add(t1);
	  add(t2);
	  add(B);
	  add(l3);
	  B.addActionListener(new Handler());
  }
  class Handler implements ActionListener
  {
	  public void actionPerformed(ActionEvent e) {
			 int a,b,s;
			 a=Integer.parseInt(t1.getText());
			 b=Integer.parseInt(t2.getText());
			 s=a+b;
			 l3.setText("sum is "+s);
		 } 
  }
	
}
