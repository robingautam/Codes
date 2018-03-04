package example;
import java.util.*;
class house {
	public double table;
	public double chair;
	public double showpieces;
	public void setHome(double table, double chair, double showpieces) {
		this.table = table;
		this.chair = chair;
		this.showpieces = showpieces;
	}
	public double getchair() {
		return chair;
	}
	public double gettable() {
		return table;
	}
	public double getshowpieces() {
		return showpieces;
	}
	public void print() {
		System.out.println("the rate of the table is "+gettable());
		System.out.println("the rate of the chair is "+getchair());
		System.out.println("the rate of the showpiece is "+getshowpieces());
	}
}
class bigHouse extends house{
	public double bed;
	public double sofaset;
	public void setHome(double bed, double sofaset) {
		this.bed = bed;
		this.sofaset = sofaset;
	}
	public double getsofa() {
		return sofaset;
	}
	public double getbed() {
		return bed;
	}
	public void print() {
		System.out.println("the big house wil have the following ");
		System.out.println("the rate of the table is "+gettable());
		System.out.println("the rate of the chair is "+getchair());
		System.out.println("the rate of the showpiece is "+getshowpieces());
		System.out.println("the rate of the sofaset is "+getsofa());
		System.out.println("the rate of the bed is "+getbed());
	}
}
public class example {
	public static void main(String[] args) {
		int n;
		double chair,table,showpieces;
		double bed,sofaset;
		Scanner rob = new Scanner(System.in);
		System.out.println("which house would you like to choose");
		System.out.println("1.house   2. bighouse");
		System.out.println("enter the number 1 or 2");
		n = rob.nextInt();
		if (n!=1 && n!=2) {
			System.out.println("please choose the correct number");
		}
	    System.out.println("enter the chair rate");
	    chair = rob.nextDouble();	
	    System.out.println("enter the table rate");
	    table = rob.nextDouble();
	    System.out.println("enter the showpiece rate");
	    showpieces = rob.nextDouble();
		if (n==1) {
			house sonu = new house();
			sonu.setHome(table, chair, showpieces);
			sonu.print();
		}
		 if (n==2) {
			System.out.println("enter the bed rate");
			bed = rob.nextDouble();
			System.out.println("enter the sofaset rate");
			sofaset = rob.nextDouble();
			bigHouse seema = new bigHouse();
			seema.setHome(bed, sofaset);
			seema.print();
		}
		else {
			System.out.println("please choose correct number");
		}
		
	}
}

