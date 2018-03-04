package example;
import java.util.*;

public class collection {
    public static void main(String[] args) {
    	LinkedList<Integer> value = new LinkedList<Integer>();
    	value.add(1);
    	value.add(3);
    	value.add(2);
    	value.add(0);
    	value.remove(1);
     for (Object i: value) {
    	 System.out.println(i);
     }
    	
    }
}
