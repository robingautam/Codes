package example;
import java.util.*;
import javax.swing.*;

public class Game extends JFrame {
	JTextArea a;
	Game(){
  }
	public Game(String s) {
		super(s);
	}
	void set() {
		a = new JTextArea();
		add(a);
		setLayout(null);
		a.setBounds(20, 30, 400, 400);
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.set();
		game.setSize(400, 400);
		game.setVisible(true);
		game.setResizable(true);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

