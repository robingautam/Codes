package example;
import java.util.*;
class exception {
	public static void main(String[] args) {
	  int balance = 2000;
	  int withdrawlAmount;
	  Scanner net = new Scanner(System.in);
	  System.out.println("enter your amount");
	  withdrawlAmount = net.nextInt();
	  try {
		  if (withdrawlAmount > balance) {
			  throw new ArithmeticException("Insufficient balance: your account balance is low "+balance);
			  
			  
		  }
		  balance = balance - withdrawlAmount;
		  System.out.println("Transaction completed successfully");
		  System.out.println("your net balance is "+balance);
	  }
		 
		  catch(ArithmeticException e) {
			  System.out.println(e.getMessage());
		  }
	  System.out.println("Thanks for visiting");
	  
}
}

