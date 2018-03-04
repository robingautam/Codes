package example;
//import java.util.*;
enum mobile {
    APPLE,SAMSUNG,HTC;
}

public class enumexample { 
	public static void main(String []args) {
		//String input;
		//Scanner rob = new Scanner(System.in);
		
		mobile m = mobile.HTC;
		switch(m) {
		case APPLE:
			System.out.println("apple is the best");
			break;
		case SAMSUNG:
			System.out.println("samsung is the best");
			break;
		case HTC:
			System.out.println("htc is the best");
		}
	}

}
