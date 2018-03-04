package localedemo;
import java.util.*;

public class localedemo {
	public static void main(String []args) {
		String lan = "en";
		String country = "US";
		Locale l = new Locale(lan, country);
		ResourceBundle rob = ResourceBundle.getBundle("localedemo/bundle", l);
		String str = rob.getString("wish");
		System.out.println(str);
	}

}
