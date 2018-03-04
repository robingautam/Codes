package example;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class menu extends JFrame {
       JMenu menu,submenu;
       JMenuItem i1, i2, i3, i4, i5, i6;
       menu(){}
       public  menu(String s){
    	   super(s);
       }
       void setComponents() {
    	   menu = new JMenu("menu");
    	   submenu = new JMenu("sub menu");
    	   JMenuBar mb = new JMenuBar();
    	   i1 = new JMenuItem("item 1");
    	   i2 = new JMenuItem("item 2");
    	   i3 = new JMenuItem("item 3");
    	   i4 = new JMenuItem("item 4");
    	   i5 = new JMenuItem("item 5");
    	   i6 = new JMenuItem("item 6");
            setLayout(null);
            mb.add(menu);
    	   menu.add(i1); menu.add(i2); menu.add(i3); menu.add(i4); submenu.add(i5); submenu.add(i6);
    	   add(menu); menu.add(submenu);  add(mb); 
    	   mb.setBounds(20, 30, 100, 30);
    	   
       }
       public static void main(String [] args) {
    	   menu menu = new menu();
    	   menu.setSize(500, 500);
    	   menu.setVisible(true);
    	   menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	   menu.setComponents();
    	   menu.setResizable(false);
    	
       }
}
