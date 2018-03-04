package Calculator;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class movingball extends JFrame{
	int x= 0;
	int y = 0;
	int angleX = 1, angleY = 1;
	int speed = 2;
      public movingball() {}
      public  movingball(String s) {
    	  super(s);
      }
      public void move() {
    	  if (x + angleX <0) {
    		  angleX = speed;
    	  }
    	  else if (x + angleX > getWidth() - 50) {
    		  angleX = -speed;
    	  }
    	  if (y + angleY <0) {
    		  angleY = speed;
    	  }
    	  else if (y + angleY > getHeight() - 50) {
    		  angleY = -speed;
    	  }
    	  x = x+angleX;
    	  y = y+angleY;
      }
       public void paint(Graphics g) {
    	  super.paint(g);
    	  g.setColor(Color.RED);
    	 g.fillOval(x, y, 50, 50);
    	 g.setColor(Color.RED);
    	 
      }
      public static void main(String[] args)  throws InterruptedException {
    	  movingball ball = new movingball("moving ball");
    	  ball.setVisible(true);
    	  ball.setSize(300, 400);
    	  ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  //ball.setResizable(false);
    	  ball.move();
    	  while(true) {
    		  ball.move();
    		  ball.repaint();
    		  Thread.sleep(10);
    	  }
      }
}
      