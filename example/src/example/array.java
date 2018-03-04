package example;
import java.util.*;

public class array {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int a[] = new int[10];
		int n;
		System.out.println("how many element do you want to enter");
		n= rob.nextInt();
		System.out.print("enter the elements of an array");
		for (int i=0;i<n;i++) {
			a[i] = rob.nextInt();
		}
		for (int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
