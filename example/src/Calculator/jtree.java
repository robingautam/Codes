package Calculator;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;


public class jtree extends JFrame {
     jtree() {}
        public jtree(String s){
    	   super(s);
     }
        void set() {
        	DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
        	DefaultMutableTreeNode name = new DefaultMutableTreeNode("name");
        	DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
            DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        	style.add(font); style.add(color);
        	DefaultMutableTreeNode italic = new DefaultMutableTreeNode("italic");
        	DefaultMutableTreeNode serif = new DefaultMutableTreeNode("serif");
        	DefaultMutableTreeNode sans = new DefaultMutableTreeNode("sans");
        	font.add(sans); font.add(serif); font.add(italic);
        	DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        	DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        	DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        	DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        	color.add(blue); color.add(black); color.add(red); color.add(green);
        	JTree jt = new JTree(style);
        	add(jt);
     
        }
        
        public static void main(String []args) {
        	jtree tree = new jtree("tree");
        	tree.set();
        	tree.setSize(400, 400);
        	tree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	tree.setVisible(true);
        	tree.setResizable(true);
        }
}
