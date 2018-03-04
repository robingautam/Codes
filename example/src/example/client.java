package example;
import java.util.*;
import java.io.*;
import java.net.*;

public class client {
  public static void main(String []args) {
	  Scanner rob = new Scanner(System.in);
	  String msg;
	  System.out.println("enter your message");
	  msg = rob.nextLine();
	  try {
	  Socket s = new Socket("localhost",6667);
	  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	  dout.writeUTF(msg);
	  dout.flush();
	  dout.close();
	  s.close();
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
  }
}
