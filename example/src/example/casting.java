package example;
import java.util.*;
import java.io.*;

public class casting {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		double d;
		int ans;
		System.out.println("enter the float number");
		d = rob.nextDouble();
		System.out.println("do you want to convert it into int number");
		System.out.println("1.Yes    2.No");
		ans = rob.nextInt();
		try {
		  if (ans!=1 && ans!=2) {
			  throw new ArithmeticException("please enter the correct number");
		  }
		  if (ans==1) {
			  int a = (int)d;
			  System.out.println(a);
		  }
		  else if (ans==2) {
			  System.out.println(d);
		  }
				
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

}
}
