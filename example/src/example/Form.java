
import javax.swing.*;
import java.awt.event.*;

class form extends JFrame {
	JPasswordField f1;
	JTextField t1;
	form(){}
	public form(String s) {
		super(s);
	}
	void setComponent() {
		f1 = new JPasswordField();
		t1 = new JTextField();
		f1.setBounds(100, 50, 150, 30);
		t1.setBounds(100, 100, 150, 30);
		add(t1);
		add(f1);
	}
	
}

public class Form {
	public static void main(String[] args) {
		form form = new form("login form");
		form.setComponent();
		form.setVisible(true);
		form.setSize(400,500);
		form.setResizable(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
