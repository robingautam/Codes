package example;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Canvas;




public class image extends JFrame{
	image(){}
	public image(String s) {
		super(s);
	}
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("C:\\robin\\icon.jpg");
		g.drawImage(i, 120, 100, this);
	}
	void set() {
	}
	public static void main(String [] args) {
		image m = new image();
		m.setSize(400, 400);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
