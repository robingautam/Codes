package example;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class tictactoe extends JFrame{
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    tictactoe(){}
    public  tictactoe(String s) {
    	super(s);
    }
    void components() {
    	t2 = new JTextField();  	t3 = new JTextField(); 	t1 = new JTextField(); 	t4 = new JTextField();
    	t5 = new JTextField();     	t6 = new JTextField();    	t7 = new JTextField(); 	t8 = new JTextField();
    	t9 = new JTextField();
    	add(t1); add(t2); add(t3); add(t4); add(t5); add(t6); add(t7); add(t8); add(t9);
    	setLayout(null);
    	t1.setBounds(30,50,50,40);
    	t2.setBounds(110,50,50,40);
    	t3.setBounds(170,50,50,40);
    	t4.setBounds(30,100,50,40);
    	t5.setBounds(110,100,50,40);
    	t6.setBounds(170,100,50,40);
    	t7.setBounds(30,130,50,40);
    	t8.setBounds(110,130,50,40);
    	t9.setBounds(170,130,50,40);
   }
    public static void main(String[] args) {
    	tictactoe tic = new tictactoe();
    	tic.components();
    	tic.setSize(400, 400);
    	tic.setVisible(true);
    	tic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	tic.setResizable(false);
    }
}
