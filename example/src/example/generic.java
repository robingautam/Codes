package example;

import java.util.*;
class filehandling {
	public <e> void  robin(e []s) {
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public static void main(String [] args) {
		String employee;
		int salary;
		
		Scanner rob = new Scanner(System.in);
		filehandling array = new filehandling();
		System.out.println("enter the name of the employee");
		for (int i=1;i<=10;i++) {
			employee = rob.nextLine(); 
		}
		
		System.out.println("enter the salary of the employee");
		for (int j=1;j<=10;j++) {
			salary = rob.nextInt();
		}
		String countries[] =  new String[10];
		Integer numbers[] = new Integer[10];
	
		
		
		array.robin(countries);
		System.out.println("\t");
		array.robin(numbers);
	}
}

