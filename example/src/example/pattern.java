package example;
import java.util.*;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int n;
		int i,j,k;
		/*System.out.println("enter the number");
		n = rob.nextInt();*/
		
		/*for (i=1;i<=5;i++) {
			k=1;
			//for (j=1;j<=(n*1)+(n-1);j++) {
			for(j=1;j<=9;j++) {
				//if (j>=(n+1)-i && j<=(n-1)+i)
				if((j>=6-i) && (j<=4+i)) {
					System.out.print(k);
				}
				else 
					System.out.print(" ");
			}
			System.out.print("\n");
		}*/


	for(i=1;i<=9;i++) {
		for(j=1;j<=9;j++) {
			while(i<=5) {
				if ((j<=6) && (j>=4+i))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			if (j<=4-i && j>=9)
				System.out.print("*");
			else 
				System.out.print("*");
		}
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
